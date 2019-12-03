package topchef.service.dto.handlesEntity;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor


public class LoginTryDto {

    private String password;
    private String email;
}
