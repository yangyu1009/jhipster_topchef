package topchef.service.dto.handlesEntity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Data
@Getter
@Setter
@NoArgsConstructor
public class RecipeDetailDto {
    // recipe simple info
    private String recipeId;
    private String recipeName;
    private String image;
    private String description;
    private String publishTime;
    private int v_number;
    private int s_number;

    // publisher Info
    private String userId;
    private String userName;

    //ingredient
    private HashMap<String, String> ingredient = new HashMap<>();


    //practice
    private List<List<String>> practice = new ArrayList<>();

    public String getRecipeId() {
        return this.recipeId;
    }
    public String getRecipeName() {
        return this.recipeName;
    }
    public String getImage() {
        return this.image;
    }
    public String getDescription() {
        return this.description;
    }
    public String getPublishTime() {
        return this.publishTime;
    }
    public String getUserId() {
        return this.userId;
    }
    public String getUserName() {
        return this.userName;
    }
    public int getS_number() {
        return this.s_number;
    }
    public int getV_number() {
        return  this.v_number;
    }
    public HashMap<String, String> getIngredient() {
        return this.ingredient;
    }
    public List<List<String>> getPractice() {
        return this.practice;
    }

    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
    public void setRecipeName(String recipeName) {
        this.recipeName = recipeName;
    }
    public void setImage(String image) {
        this.image = image;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setS_number(int s_number) {
        this.s_number = s_number;
    }
    public void setV_number(int v_number) {
        this.v_number = v_number;
    }





}
