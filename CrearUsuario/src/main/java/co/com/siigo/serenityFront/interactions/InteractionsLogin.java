package co.com.siigo.serenityFront.interactions;

import co.com.siigo.serenityFront.models.LoginModel;
import net.serenitybdd.markers.IsSilent;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.siigo.serenityFront.userInterfaces.LoginUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class InteractionsLogin implements Interaction, IsSilent {
    private LoginModel loginModel;

    public InteractionsLogin(LoginModel loginModel) {
        this.loginModel = loginModel;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(INPUT_USER, isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(System.getProperty(loginModel.getUser())).into(INPUT_USER),
                Enter.theValue(System.getProperty(loginModel.getPassword())).into(INPUT_PASS),
                Click.on(BTN_LOGIN)
        );

    }

    public static InteractionsLogin login(LoginModel loginModel) {
        return Tasks.instrumented(InteractionsLogin.class, loginModel);
    }
}
