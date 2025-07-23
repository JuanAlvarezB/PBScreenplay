package co.com.bancolombia.ejemploUno.models;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UserInformationModel {
    private @Getter String name;
    private @Getter String lastName;
    private @Getter String postalCode;

}
