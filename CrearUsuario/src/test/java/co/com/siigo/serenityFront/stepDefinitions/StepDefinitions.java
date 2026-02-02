package co.com.siigo.serenityFront.stepDefinitions;

import co.com.siigo.serenityFront.interactions.InteractionsLogin;
import co.com.siigo.serenityFront.tasks.SelectOption;
import co.com.siigo.serenityFront.models.LoginModel;
import co.com.siigo.serenityFront.tasks.FillFormDatosBasicos;
import co.com.siigo.serenityFront.tasks.LiftPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;


import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class StepDefinitions {
    @Given("user access the siigo page")
    public void userAccessTheSiigoPage() {
        OnStage.theActorCalled("actor").wasAbleTo(
                LiftPage.liftPage()
        );
    }
    @Given("user logs in the system")
    public void userLogsInTheSystem(LoginModel loginModel) {
        theActorInTheSpotlight().attemptsTo(
                InteractionsLogin.login(loginModel)
        );
    }
    @Given("user selects the option to create a third")
    public void userSelectsTheOptionToCreateAThird() {
        theActorInTheSpotlight().attemptsTo(
                SelectOption.clicCrearTercero()
        );
    }
    @When("user fills the form Datos basicos with {string},{string}, {string}, {string}, {string}, {string},{string},{string},{string}")
    public void userFillsTheFormDatosBasicosWith(String Name, String lastName, String businessName, String city, String address, String sucursalCode, String id, String indicative, String phone) {
        theActorInTheSpotlight().attemptsTo(
                FillFormDatosBasicos.inputTheInfo(Name,lastName,businessName,city,address,sucursalCode,id,indicative,phone)
        );
    }
    @When("user fills the form Datos para facturacion with {string},{string}")
    public void userFillsTheFormDatosParaFacturacionWith(String email, String zip) {

    }
    @When("user fills the form Datos Bancarios with {string},{string}")
    public void userFillsTheFormDatosBancariosWith(String holderName, String accountNumber) {

    }
    @When("user fills the form Contactos with {string},{string},{string},{string},{string}")
    public void userFillsTheFormContactosWith(String contactName, String lastNameContact, String contactEmail, String position, String contactPhone) {

    }
    @Then("user validates the confirm message {string}")
    public void userValidatesTheConfirmMessage(String status) {

    }
    @Then("user validate the {string}")
    public void userValidateThe(String fullName) {

    }


}
