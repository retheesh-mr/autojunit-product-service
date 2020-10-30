package poc.telethon.autojunit.model;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Builder
@Data
public class ProductModel implements Serializable {
    String productId;
    String productName;
    String productStatus;
}
