package co.com.siigo.serenityFront.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import static co.com.siigo.serenityFront.userInterfaces.FillFormDatosBasicosUI.INPUT_NAME_BASIC_DATES;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FillFormDatosBasicos implements Task {

    private String Name;
    private String lastName;
    private String businessName;
    private String city;
    private String address;
    private String sucursalCode;
    private String id;
    private String indicative;
    private String phone;

    public FillFormDatosBasicos(String Name, String lastName, String businessName, String city, String address, String sucursalCode, String id, String indicative, String phone) {
        this.Name = Name;
        this.lastName = lastName;
        this.businessName = businessName;
        this.city = city;
        this.address = address;
        this.sucursalCode = sucursalCode;
        this.id = id;
        this.indicative = indicative;
        this.phone = phone;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                // WaitUntil.the(INPUT_NAME_BASIC_DATES, isVisible()).forNoMoreThan(25).seconds(),
               // Enter.theValue(Name).into(INPUT_NAME_BASIC_DATES)
        );
    }

    public static FillFormDatosBasicos inputTheInfo(String Name, String lastName, String businessName, String city, String address, String sucursalCode, String id, String indicative, String phone) {
        return instrumented(FillFormDatosBasicos.class,Name,lastName,businessName,city,address,sucursalCode,id,indicative,phone);
    }
}
