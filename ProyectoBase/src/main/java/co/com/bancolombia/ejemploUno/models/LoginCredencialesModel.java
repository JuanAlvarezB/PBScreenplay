package co.com.bancolombia.ejemploUno.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LoginCredencialesModel {
    private @Getter String user;
    private @Getter String password;
}
