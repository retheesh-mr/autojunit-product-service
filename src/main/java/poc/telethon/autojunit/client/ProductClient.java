package poc.telethon.autojunit.client;

import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import poc.telethon.autojunit.model.ProductModel;

@Component
@Log4j2
public class ProductClient {

    @Value("${product.url}")
    private String productUrl;

    @Autowired
    private RestTemplate restTemplate;

    public ProductModel getProduct(String productId) {
        return restTemplate.getForObject(productUrl, ProductModel.class, productId);
    }

}
