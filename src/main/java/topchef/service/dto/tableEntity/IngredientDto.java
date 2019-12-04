package topchef.service.dto.tableEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class IngredientDto {
    private String recipeId;
    private String ingredientName;
    private String ingredientAmount;

    public String getRecipeId() {
        return this.recipeId;
    }
    public String getIngredientName() {
        return this.ingredientName;
    }
    public String getIngredientAmount() {
        return this.ingredientAmount;
    }
    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
    public void setIngredientName(String ingredientName) {
        this.ingredientName = ingredientName;
    }
    public void setIngredientAmount(String ingredientAmount) {
        this.ingredientAmount = ingredientAmount;
    }
}
