package co.com.bancolombia.ejemploUno.tasks;

import co.com.bancolombia.ejemploUno.models.LoginCredencialesModel;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.ejemploUno.userinterfaces.LoginUserinterfaces.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginWith implements Task {

    private LoginCredencialesModel loginCredencialesModel;

    public LoginWith(LoginCredencialesModel loginCredencialesModel) {
        this.loginCredencialesModel = loginCredencialesModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Enter.theValue(System.getProperty(loginCredencialesModel.getUser())).into(INPUT_USER),
                Enter.theValue(System.getProperty(loginCredencialesModel.getPassword())).into(INPUT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }


    public static LoginWith yourCredentials(LoginCredencialesModel loginCredencialesModel){
        return instrumented(LoginWith.class, loginCredencialesModel);
    }
}
