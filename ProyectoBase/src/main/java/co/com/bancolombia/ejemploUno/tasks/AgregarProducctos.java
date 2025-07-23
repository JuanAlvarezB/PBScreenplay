package co.com.bancolombia.ejemploUno.tasks;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import org.checkerframework.checker.units.qual.C;


import static co.com.bancolombia.ejemploUno.userinterfaces.AgregarAlCarritoUserinterfaces.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregarProducctos implements Task {

    public static AgregarProducctos carrito() {
        return instrumented(AgregarProducctos.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(ELEMENTO_UNO),
                Click.on(BTN_ADD_TWO),
                Scroll.to(ELEMENTO_DOS),
                Click.on(ELEMENTO_DOS),
                Click.on(BTN_ADD_TRHEE),
                Click.on(BTN_BACK),
                Scroll.to(BTN_ADD_FOUR),
                Click.on(BTN_ADD_FOUR),
                Scroll.to(BTN_CART),
                Click.on(BTN_CART),
                Scroll.to(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT)
        );
    }
}
