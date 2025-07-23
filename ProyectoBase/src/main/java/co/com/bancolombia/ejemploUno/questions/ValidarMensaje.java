package co.com.bancolombia.ejemploUno.questions;


import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class ValidarMensaje implements Question<Boolean> {
    private Target elemento;
    private String mensaje;

    public ValidarMensaje(Target elemento, String mensaje) {
        this.elemento = elemento;
        this.mensaje = mensaje;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textoObtenido = BrowseTheWeb.as(actor).find(elemento).getText().trim();
        return mensaje.equals(textoObtenido);
    }

    public static ValidarMensaje comprobarMensaje(Target elemento, String mensaje){
        return new ValidarMensaje(elemento,mensaje);
    }
}
