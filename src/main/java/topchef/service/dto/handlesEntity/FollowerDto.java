package topchef.service.dto.handlesEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class FollowerDto {
    private String followerId;
    private String followerName;

    public String getFollowerId() {
        return this.followerId;
    }
    public String getFollowerName() {
        return this.followerName;
    }
    public void setFollowerId(String followerId) {
        this.followerId = followerId;
    }
    public void setFollowerName(String followerName) {
        this.followerName = followerName;
    }
}
