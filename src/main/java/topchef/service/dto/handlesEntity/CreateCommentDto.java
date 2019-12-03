package topchef.service.dto.handlesEntity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class CreateCommentDto {
    private String recipeId;
    private String description;
}
