package topchef.service.dto.handlesEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor


public class LoginTryDto {

    private String password;
    private String email;

    public String getPassword() {
        return this.password;
    }
    public String getEmail() {
        return this.email;
    }
}
