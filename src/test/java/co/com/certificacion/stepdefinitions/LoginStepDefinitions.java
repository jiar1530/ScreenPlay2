package co.com.certificacion.stepdefinitions;

import co.com.certificacion.question.ValidarInformacion;
import co.com.certificacion.tasks.Login;
import co.com.certificacion.tasks.Navigate;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import static co.com.certificacion.userinterfaces.LoginPage.LBL_PAGINA;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.*;
import static org.hamcrest.core.IsEqual.equalTo;

public class LoginStepDefinitions {

    @Before
    public void prepareStage() {
        OnStage.setTheStage(new OnlineCast());

    }
    @Given("that a {string} enters the portal")
    public void goToThePortal(String actor) {

        theActorCalled(actor).wasAbleTo(Navigate.openUrl());
    }

    @When("the user enters their {string} and {string}")
    public void enterTheCredentials(String username, String password) {

        theActorInTheSpotlight().attemptsTo(Login.addCredentiasls(username, password));
    }


    @Then("Confirmo Ingreso a la Pagina")
    public void confirmoIngresoALaPagina() {
        theActorInTheSpotlight().should(seeThat(ValidarInformacion.ValidarTexto(LBL_PAGINA),
                equalTo("HELLO, JOHN")
        ));

    }
}