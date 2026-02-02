package co.com.siigo.serenityFront.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginUI {
    public static final Target INPUT_USER = Target.the("user field")
            .located(By.xpath("//input[@id='siigoSignInName']"));
    public static final Target INPUT_PASS = Target.the("pass field")
            .located(By.xpath("//input[@name='Contraseña' and @id='siigoPassword']"));
    public static final Target BTN_LOGIN = Target.the("btn for login")
            .located(By.xpath("//button[@class='bg-default' and @id='siigoNext']"));


}
