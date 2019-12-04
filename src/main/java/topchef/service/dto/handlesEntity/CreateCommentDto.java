package topchef.service.dto.handlesEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class CreateCommentDto {
    private String recipeId;
    private String description;

    public String getRecipeId() {
        return this.recipeId;
    }
    public String getDescription() {
        return this.description;
    }
    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
    public void setDescription(String description) {
        this.description = description;
    }
}
