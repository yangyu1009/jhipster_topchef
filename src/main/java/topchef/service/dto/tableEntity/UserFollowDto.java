package topchef.service.dto.tableEntity;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserFollowDto {
    private String publisherId;
    private String followerId;
}
