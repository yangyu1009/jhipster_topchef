package topchef.service.dto.tableEntity;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class SubscribeDto {
    private String userId;
    private String recipeId;

    public String getUserId() {
        return this.userId;
    }
    public String getRecipeId() {
        return this.recipeId;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
}
