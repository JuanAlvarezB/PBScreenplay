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
            .located(By.id("shopping_cart_container"));

    public static final Target BTN_CHECKOUT = Target.the("Scroll to element UP")
            .located(By.id("checkout"));

    public static final Target ELEMENTO_UNO = Target.the("Scroll to elemento Down")
            .located(By.xpath("//img[@data-test='inventory-item-sauce-labs-onesie-img' and @class='inventory_item_img']"));

    public static final Target BTN_ADD_TWO = Target.the("Add baby clothes")
            .located(By.id("add-to-cart-sauce-labs-onesie"));

    public static final Target ELEMENTO_DOS = Target.the("Sroll to element UP two")
            .located(By.xpath("//img[@alt='Sauce Labs Bike Light' and @class='inventory_item_img']"));

    public static final Target BTN_ADD_TRHEE = Target.the("add focus")
            .located(By.id("add-to-cart"));

    public static final Target BTN_BACK = Target.the("button for back")
            .located(By.id("back-to-products"));

    public static final Target BTN_ADD_FOUR = Target.the("four element")
            .located(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));


}
