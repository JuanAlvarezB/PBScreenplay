package co.com.bancolombia.ejemploUno.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class IngreInfoUserInterfaces {

    public static final Target FIRST_NAME = Target.the("Input for first name")
            .located(By.id("first-name"));
    public static final Target LAST_NAME = Target.the("Input for last name")
            .located(By.id("last-name"));
    public static final Target POSTAL_CODE = Target.the("Input for postal code")
            .located(By.id("postal-code"));
    public static final Target BTN_CONTINUE = Target.the("Button to continue")
            .located(By.id("continue"));
    public static final Target BTN_FINISH = Target.the("Button to finish")
            .located(By.id("finish"));


}
