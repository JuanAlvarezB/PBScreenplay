package co.com.bancolombia.ejemploUno.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.bancolombia.ejemploUno.userinterfaces.AgregarAlCarritoUserinterfaces.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class AgregaunProductoAlCarrito implements Task {


    public static AgregaunProductoAlCarrito agregarProducto() {
        return instrumented(AgregaunProductoAlCarrito.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(LOCALIZAR_ELEMTO),
                Click.on(BTN_ADD_TO_CART),
                Scroll.to(LOCALIZAR_ELEMTO2),
                Click.on(BTN_CART),
                Scroll.to(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT),
                Scroll.to(BTN_CART),
                Click.on(BTN_CART),
                Scroll.to(BTN_CHECKOUT),
                Click.on(BTN_CHECKOUT)
        );

    }
}
