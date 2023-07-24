package mate.academy.spring.model.dto.request;

import com.sun.istack.NotNull;
import jakarta.validation.constraints.Email;

public class UserRequestDto {
    @NotNull
    @Email
    private String email;
    @NotNull
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}