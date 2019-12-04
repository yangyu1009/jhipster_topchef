package topchef.service.dto.handlesEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
public class CreateRecipeDto {
    private String recipeId;
    private String recipeName;
    private String userId;
    private String image;
    private String description;
    private List<String> ingredientName = new ArrayList<>();
    private List<String> ingredientNumber = new ArrayList<>();
    private List<String> practiceImage = new ArrayList<>();
    private List<String> practiceDescription = new ArrayList<>();
    private String tag;

    public String getRecipeId() {
        return this.recipeId;
    }
    public String getRecipeName() {
        return this.recipeName;
    }
    public String getUserId() {
        return this.userId;
    }
    public String getImage() {
        return this.image;
    }
    public String getDescription() {
        return this.description;
    }
    public List<String> getIngredientName() {
        return this.ingredientName;
    }
    public List<String> getIngredientNumber() {
        return this.ingredientNumber;
    }
    public List<String> getPracticeImage() {
        return this.practiceImage;
    }
    public List<String> getPracticeDescription() {
        return this.practiceDescription;
    }
    public String getTag() {
        return this.tag;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public void setDescription(String description) {
        this.description = description;
    }
//    public List<String> getIngredientName() {
//        return this.ingredientName;
//    }
//    public List<String> getIngredientNumber() {
//        return this.ingredientNumber;
//    }
//    public List<String> getPracticeImage() {
//        return this.practiceImage;
//    }
//    public List<String> getpracticeDescription() {
//        return this.practiceDescription;
//    }
    public void setTag(String tag) {
        this.tag = tag;
    }
}
