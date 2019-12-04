package topchef.service.dto.tableEntity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class UserFollowDto {
    private String publisherId;
    private String followerId;

    public String getPublisherId() {
        return this.publisherId;
    }
    public String getFollowerId() {
        return this.followerId;
    }
    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }
    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }
}
