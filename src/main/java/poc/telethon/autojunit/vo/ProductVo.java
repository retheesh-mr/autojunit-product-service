package poc.telethon.autojunit.vo;

import lombok.Builder;
import lombok.Data;

import java.io.Serializable;


@Builder
@Data
public class ProductVo implements Serializable {
    String productId;
    String productName;
    String productStatus;
}
