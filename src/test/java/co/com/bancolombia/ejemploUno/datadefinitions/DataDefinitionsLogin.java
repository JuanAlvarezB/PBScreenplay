package co.com.bancolombia.ejemploUno.datadefinitions;

import co.com.bancolombia.ejemploUno.models.LoginCredencialesModel;
import co.com.bancolombia.ejemploUno.models.MessageModel;
import co.com.bancolombia.ejemploUno.models.UserInformationModel;
import io.cucumber.java.DataTableType;

import java.util.Map;

import static co.com.bancolombia.ejemploUno.utils.Constants.*;

public class DataDefinitionsLogin {
    @DataTableType(replaceWithEmptyString = "[blank]")
    public LoginCredencialesModel loginCredencialesModel(Map<String,String> entry){
        return new LoginCredencialesModel(
                entry.get(USER.getConstants()),
                entry.get(PASSWORD.getConstants())
        );
    }

    @DataTableType(replaceWithEmptyString = "[blank]")
    public MessageModel messageModel(Map<String, String> entry) {
        return new MessageModel(
                entry.get(MESSAGE.getConstants())
        );
    }

    @DataTableType(replaceWithEmptyString = "[blank]")
    public UserInformationModel userInformationModel(Map<String, String> entry){
        return new UserInformationModel(
                entry.get(NOMBRE.getConstants()),
                entry.get(APELLIDO.getConstants()),
                entry.get(CODIGO_POSTAL.getConstants())
        );
    }
}
