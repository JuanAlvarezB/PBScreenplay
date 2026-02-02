package co.com.siigo.serenityFront.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class LoginModel {
    private @Getter String user;
    private @Getter String password;

}
