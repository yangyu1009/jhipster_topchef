package topchef.service.dto.tableEntity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class PracticeDto {
    private String recipeId;
    private int index;
    private String description;
    private String image;

    public String getRecipeId() {
        return this.recipeId;
    }
    public String getDescription() {
        return this.description;
    }
    public String getImage() {
        return this.image;
    }
    public int getIndex() {
        return this.index;
    }
    public void setRecipeId(String recipeId) {
        this.recipeId = recipeId;
    }
    public void setIndex(int index) {
        this.index = index;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setImage(String image) {
        this.image = image;
    }
}
