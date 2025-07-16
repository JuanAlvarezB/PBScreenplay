package co.com.bancolombia.ejemploUno.userinterfaces;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
public class TextoValidarUserInterface {

    public static final Target TEXTO_COMPRA_EXITOSA = Target.the("Texto de compra exitosa")
            .located(By.xpath("//h2[@class='complete-header' and contains(text(),'Thank you for your order!')]"));
}
