package poc.telethon.autojunit.mapper;

import org.springframework.stereotype.Component;
import poc.telethon.autojunit.model.ProductModel;
import poc.telethon.autojunit.vo.ProductVo;

@Component
public class ProductModelToVoMapper {

    public ProductVo map(ProductModel productModel) {
        ProductVo productVo = ProductVo.builder()
                .productId(productModel.getProductId())
                .productName(mapProductName(productModel.getProductName()))
                .productStatus(productModel.getProductStatus())
                .build();
        return productVo;
    }

    private String mapProductName(String productNameModel) {
        if(productNameModel.equalsIgnoreCase("F")) {
            return "Fixed";
        } else if(productNameModel.equalsIgnoreCase("M")) {
            return "Mobile";
        } else {
            return "NA";
        }
    }
}
