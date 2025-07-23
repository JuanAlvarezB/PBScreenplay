package co.com.bancolombia.ejemploUno.userinterfaces;

import org.openqa.selenium.By;
import net.serenitybdd.screenplay.targets.Target;

public class LoginUserinterfaces {

    public static final Target INPUT_USER = Target.the("Input User")
            .located(By.id("user-name"));

    public static final Target INPUT_PASSWORD = Target.the("Input password")
            .located(By.id("password"));

    public static final Target BTN_LOGIN = Target.the("Button to login")
            .located(By.id("login-button"));
}
