package topchef.repository;
import topchef.service.dto.handlesEntity.RecipeDetailDto;
import topchef.service.dto.tableEntity.RecipeDto;

import java.util.List;

public interface TopChefRecipeDao {
    public RecipeDetailDto getRecipeDetail(String recipeId);
    public List<RecipeDto> searchRecipe(String keyword);
    public void updateSubscribeNumber(String recipeId);
    public void updateViewNumber(String recipeId);
}
