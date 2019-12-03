package topchef.service.dto.handlesEntity;


import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PublisherAndFollowerDto {
    private String followerId;
    private String publisherId;
    private String followerName;
}
