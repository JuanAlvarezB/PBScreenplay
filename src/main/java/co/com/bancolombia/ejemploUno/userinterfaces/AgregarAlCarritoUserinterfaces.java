package co.com.bancolombia.ejemploUno.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.PageElement;
import org.openqa.selenium.By;

public class AgregarAlCarritoUserinterfaces {


    public static final Target LOCALIZAR_ELEMTO = Target.the("Scroll to element DOWN")
            .located(By.xpath("//div[@data-test='inventory-item-name' and contains(text(),'Test.allTheThings() T-Shirt (Red)')]"));

    public static final Target BTN_ADD_TO_CART = Target.the("Button to add to cart")
            .located(By.id("add-to-cart-test.allthethings()-t-shirt-(red)"));

    public static final Target LOCALIZAR_ELEMTO2 = Target.the("Scroll to element UP")
            .located(By.xpath("//span[@data-test='title' and contains(text(),'Products')]"));

    public static final Target BTN_CART = Target.the("Button to go to cart")
            .located(By.xpath("//a[@class='shopping_cart_link' and @data-test='shopping-cart-link']"));

    public static final Target BTN_CHECKOUT = Target.the("Scroll to element UP")
            .located(By.id("checkout"));
}
