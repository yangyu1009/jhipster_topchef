package topchef.service.dto.tableEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class RecipeTagDto {
    private String recipeId;
    private String tagId;
    public String getRecipeId() {
        return this.recipeId;
    }
    public String getTagId() {
        return this.recipeId;

    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
    public void setTagId(String tagId) {
        this.tagId = tagId;
    }
}
