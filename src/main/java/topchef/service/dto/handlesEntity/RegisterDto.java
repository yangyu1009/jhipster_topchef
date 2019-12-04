package topchef.service.dto.handlesEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
public class RegisterDto {
    private String uerId;
    private String userName;
    private String password;
    private String email;
    private String createTime;


    public String getUerId() {
        return this.uerId;
    }
    public String getUserName() {
        return this.userName;
    }
    public String getPassword() {
        return this.password;
    }
    public String getEmail() {
        return this.email;
    }
    public String getCreateTime() {
        return this.createTime;
    }


    public void setUerId(String userId) {
        this.uerId = userId;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
