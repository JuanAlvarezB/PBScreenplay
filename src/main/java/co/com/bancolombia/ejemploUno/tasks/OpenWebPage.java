package co.com.bancolombia.ejemploUno.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWebPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn().thePageNamed("pages.baseUrl")
        );
    }

    public static OpenWebPage OpenSauceDemoPage() {
        return instrumented(OpenWebPage.class);
    }
}
