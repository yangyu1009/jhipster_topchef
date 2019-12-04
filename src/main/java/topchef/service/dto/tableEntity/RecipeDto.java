package topchef.service.dto.tableEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
public class RecipeDto {
    private String recipeId;
    private String recipeName;
    private String description;
    private String image;
    private int sNumber;
    private int vNumber;
    private String publishTime;
    private String userId;

    public String getRecipeId() {
        return this.recipeId;
    }
    public String getRecipeName() {
        return this.recipeName;
    }
    public String getDescription() {
        return this.description;
    }
    public String getImage() {
        return this.image;
    }
    public int getSNumber() {
        return this.sNumber;
    }
    public int getVNumber() {
        return this.vNumber;
    }
    public String getPublishTime() {
        return this.publishTime;
    }
    public String getUserId() {
        return this.userId;
    }


    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public void setSNumber(int sNumber) {
        this.sNumber = sNumber;
    }
    public void setVNumber(int vNumber) {
        this.vNumber = vNumber;
    }
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
}
