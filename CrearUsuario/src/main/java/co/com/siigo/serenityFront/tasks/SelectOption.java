package co.com.siigo.serenityFront.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.siigo.serenityFront.userInterfaces.CrearTerceroUI.OPTION_CREAR_TERCERO;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SelectOption implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(OPTION_CREAR_TERCERO, isVisible()).forNoMoreThan(25).seconds(),
                Click.on(OPTION_CREAR_TERCERO)

        );
    }


    public static SelectOption clicCrearTercero(){
        return instrumented(SelectOption.class);
    }
}
