package topchef.service.dto.tableEntity;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
public class UserDto {
    private String userId;
    private String password;
    private String name;
    private String email;
    private String createDate;

    public String getUserId() {
        return this.userId;
    }
    public String getPassword() {
        return this.password;
    }
    public String getName() {
        return this.name;
    }
    public String getEmail() {
        return this.email;
    }
    public String getCreateDate() {
        return this.createDate;
    }
    public void setUserId(String userId) {
        this.userId = userId;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setCreateDate(String createDate) {
        this.createDate = createDate;
    }
}
