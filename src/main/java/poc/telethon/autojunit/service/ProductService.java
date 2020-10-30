package poc.telethon.autojunit.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import poc.telethon.autojunit.client.ProductClient;
import poc.telethon.autojunit.mapper.ProductModelToVoMapper;
import poc.telethon.autojunit.model.ProductModel;
import poc.telethon.autojunit.vo.ProductVo;

@Service
public class ProductService {

    @Autowired
    private ProductClient productClient;

    @Autowired
    private ProductModelToVoMapper productModelToVoMapper;


    public ProductVo getProduct(String productId) {
        ProductModel productModel =  productClient.getProduct(productId);
        ProductVo productVo = productModelToVoMapper.map(productModel);
        return productVo;
    }

}
