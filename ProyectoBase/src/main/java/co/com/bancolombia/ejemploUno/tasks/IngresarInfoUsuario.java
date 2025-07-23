package co.com.bancolombia.ejemploUno.tasks;

import co.com.bancolombia.ejemploUno.models.UserInformationModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.ejemploUno.userinterfaces.IngreInfoUserInterfaces.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class IngresarInfoUsuario implements Task {
    private UserInformationModel userInformationModel;

    public IngresarInfoUsuario(UserInformationModel userInformationModel) {
        this.userInformationModel = userInformationModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(userInformationModel.getName()).into(FIRST_NAME),
                Enter.theValue(userInformationModel.getLastName()).into(LAST_NAME),
                Enter.theValue(userInformationModel.getPostalCode()).into(POSTAL_CODE),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINISH)
        );
    }

    public static IngresarInfoUsuario ingresarInfoUsuario(UserInformationModel userInformationModel) {
        return instrumented(IngresarInfoUsuario.class, userInformationModel);
    }
}
