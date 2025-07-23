package co.com.bancolombia.ejemploUno.questions;

import co.com.bancolombia.ejemploUno.models.MessageModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import net.serenitybdd.screenplay.targets.Target;

import static co.com.bancolombia.ejemploUno.userinterfaces.TextoValidarUserInterface.TEXTO_COMPRA_EXITOSA;

public class ValidarTexto implements Question<Boolean> {
    private final MessageModel messageModel;
    private final Target elemento;

    public ValidarTexto(MessageModel messageModel, Target elemento) {
        this.messageModel = messageModel;
        this.elemento = elemento;
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        String textoObtenido = BrowseTheWeb.as(actor).find(elemento).getText().trim();
        return messageModel.getMessage().equals(textoObtenido);
    }

    public static ValidarTexto validarTexto(MessageModel messageModel, Target elemento) {
        return new ValidarTexto(messageModel, elemento);
    }
}
