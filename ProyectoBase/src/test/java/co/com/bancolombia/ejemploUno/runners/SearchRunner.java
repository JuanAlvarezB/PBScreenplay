package co.com.bancolombia.ejemploUno.runners;


import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

import static io.cucumber.junit.CucumberOptions.SnippetType.CAMELCASE;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features",
        glue = {"co.com.bancolombia.ejemploUno.stepDefinitions",
        "co.com.bancolombia.ejemploUno.datadefinitions"},
        snippets = CAMELCASE,
        plugin = {"pretty"},
        tags = "@RealizarCompras"
)
public class SearchRunner {
}
