package co.com.bancolombia.ejemploUno.stepDefinitions;

import co.com.bancolombia.ejemploUno.models.*;
import co.com.bancolombia.ejemploUno.questions.ValidarMensaje;
import co.com.bancolombia.ejemploUno.questions.ValidarTexto;
import co.com.bancolombia.ejemploUno.tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;

import static co.com.bancolombia.ejemploUno.userinterfaces.TextoValidarUserInterface.TEXTO_COMPRA_EXITOSA;


public class StepDefinitions {

    @Given("accede a la página de saucedemo")
    public void accedeALaPáginaDeSaucedemo() {
        OnStage.theActorCalled("User").wasAbleTo(
                OpenWebPage.OpenSauceDemoPage()
        );
    }

    @Given("el usuario inicia sesión en el sistema de saucedemo")
    public void elUsuarioIniciaSesiónEnElSistemaDeSaucedemo(LoginCredencialesModel loginCredencialesModel) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LoginWith.yourCredentials(loginCredencialesModel)
        );
    }

    @When("el agrega un producto al carrito hasta finalizar la compra")
    public void elAgregaUnProductoAlCarritoHastaFinalizarLaCompra() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregaunProductoAlCarrito.agregarProducto()
        );
    }

    @And("el usuario ingresa los datos de envío")
    public void elUsuarioIngresaLosDatosDeEnvío(UserInformationModel userInformationModel) {

        OnStage.theActorInTheSpotlight().attemptsTo(
                IngresarInfoUsuario.ingresarInfoUsuario(userInformationModel)
        );

    }

    @Then("valida que la compra se haya realizado correctamente visualizando el mensaje de confirmación")
    public void validaQueLaCompraSeHayaRealizadoCorrectamenteVisualizandoElMensajeDeConfirmación(MessageModel messageModel) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarTexto.validarTexto(messageModel, TEXTO_COMPRA_EXITOSA)));

    }

    @And("ingresa la informacion de {string}, {string} y {string}")
    public void ingresaLaInformacionDeY(String nombre, String apellido, String codigoPostal) {
        OnStage.theActorInTheSpotlight().attemptsTo(
                LlenarFormualrio.infousuario(nombre, apellido, codigoPostal)
        );
    }

    @Then("el usuario visualiza el {string}")
    public void elUsuarioVisualizaEl(String mensaje) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidarMensaje.comprobarMensaje(TEXTO_COMPRA_EXITOSA,mensaje)));
    }

    @When("selecciona unos productos para agregarlos al carrito")
    public void seleccionaUnosProductosParaAgregarlosAlCarrito() {
        OnStage.theActorInTheSpotlight().attemptsTo(
                AgregarProducctos.carrito()
        );
    }
}
