package topchef.service.dto.tableEntity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class CommentDto {
    private String userId;
    private String recipeId;
    private String description;

    public String getDescription() {
        return this.description;
    }
    public String getUserId() {
        return this.userId;
    }
    public String getRecipeId() {
        return this.recipeId;
    }

    public void setDescription(String description) {
        this.description = description;

    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
}
