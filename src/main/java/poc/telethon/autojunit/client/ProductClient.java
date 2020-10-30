package poc.telethon.autojunit.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import poc.telethon.autojunit.model.ProductModel;

import java.math.BigInteger;

@Component
public class ProductClient {

    @Value("${product.url}")
    private String productUrl;

    @Value("${productprice.url}")
    private String productPriceUrl;

    @Autowired
    private RestTemplate restTemplate;

    public ProductModel getProduct(String productId) {
        ProductModel productModel = restTemplate.getForObject(productUrl, ProductModel.class, productId);
        BigInteger price = restTemplate.getForObject(productPriceUrl, BigInteger.class, productId);
        if(price == null) {
            price = BigInteger.ZERO;
        }
        productModel.setPrice(price);
        return productModel;
    }

}
