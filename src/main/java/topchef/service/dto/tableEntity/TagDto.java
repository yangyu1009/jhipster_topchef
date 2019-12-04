package topchef.service.dto.tableEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class TagDto {
    private String tagId;
    private String tagName;

    public String getTagId() {
        return this.tagId;
    }
    public String getTagName() {
        return this.tagName;
    }
    public void setTagId(String tagId) {
        this.tagId = tagId;

    }
    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

}
