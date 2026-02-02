package co.com.siigo.serenityFront.dataDefinitions;

import io.cucumber.java.DataTableType;

import java.util.Map;

import static co.com.siigo.serenityFront.utils.Constants.*;
import co.com.siigo.serenityFront.models.LoginModel;
public class DataDefinitions {
    @DataTableType(replaceWithEmptyString = "[blank]")
    public LoginModel compraModel(Map<String, String> entry){
        return new LoginModel(
                entry.get(USER.getConstants()),
                entry.get((PASSWORD.getConstants()))
        );
    }
}
