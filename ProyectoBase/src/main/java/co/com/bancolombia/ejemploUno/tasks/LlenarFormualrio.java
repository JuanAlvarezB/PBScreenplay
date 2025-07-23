package co.com.bancolombia.ejemploUno.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.bancolombia.ejemploUno.userinterfaces.IngreInfoUserInterfaces.*;
import static co.com.bancolombia.ejemploUno.userinterfaces.IngreInfoUserInterfaces.BTN_CONTINUE;
import static co.com.bancolombia.ejemploUno.userinterfaces.IngreInfoUserInterfaces.BTN_FINISH;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LlenarFormualrio implements Task {
    private String nombre;
    private String apelliedo;
    private String codigoPostal;

    public LlenarFormualrio(String nombre, String apelliedo, String codigoPostal) {
        this.nombre = nombre;
        this.apelliedo = apelliedo;
        this.codigoPostal = codigoPostal;
    }

    public static LlenarFormualrio infousuario(String nombre, String apelliedo, String codigoPostal){
        return instrumented(LlenarFormualrio.class,nombre,apelliedo,codigoPostal);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(nombre).into(FIRST_NAME),
                Enter.theValue(apelliedo).into(LAST_NAME),
                Enter.theValue(codigoPostal).into(POSTAL_CODE),
                Click.on(BTN_CONTINUE),
                Click.on(BTN_FINISH)
        );

    }
}
