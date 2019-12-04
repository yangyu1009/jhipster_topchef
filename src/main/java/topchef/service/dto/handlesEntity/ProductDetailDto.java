package topchef.service.dto.handlesEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
public class ProductDetailDto {
    private String price;
    private String title;
    private String imgUrl;
    private String id;
    private String brand;
    private String description;
}
