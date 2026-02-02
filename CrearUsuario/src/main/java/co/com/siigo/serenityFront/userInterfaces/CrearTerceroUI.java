package co.com.siigo.serenityFront.userInterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CrearTerceroUI {

    public static final Target OPTION_CREAR_TERCERO = Target.the("select option of create third")
            .located(By.xpath("(//div[@class='icon-container'])[8]"));
}
