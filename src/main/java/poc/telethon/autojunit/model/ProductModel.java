package poc.telethon.autojunit.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;
import java.math.BigInteger;


@Builder
@Data
@AllArgsConstructor
public class ProductModel implements Serializable {
    String productId;
    String productName;
    String productStatus;
    BigInteger price;
}
