package topchef.service.dto.handlesEntity;


import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class PublisherAndFollowerDto {
    private String followerId;
    private String publisherId;
    private String followerName;
}
