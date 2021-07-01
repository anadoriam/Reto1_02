package co.com.choucair.certification.reto1.stepdefinitions;

import co.com.choucair.certification.reto1.questions.Answer;
import co.com.choucair.certification.reto1.questions.Answer2;
import co.com.choucair.certification.reto1.tasks.*;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ColorLibStepdefinitions {



    @Before
        public void setStage(){
            OnStage.setTheStage(new OnlineCast());
        }
    @Given("^Ana quiere ingresar a la pagina colorlib$")
    public void anaQuiereIngresarALaPaginaColorlib() {
        OnStage.theActorCalled("Ana").wasAbleTo
                (OpenUp.thePage(), (Login.onThePage()));

    }


    @When("^Seleccione en el menu la opcion validations$")
    public void seleccioneEnElMenuLaOpcionValidations()  {
        OnStage.theActorInTheSpotlight().attemptsTo(SearchValidation.Page());


    }

    @Then("^verifique el titulo del formulario (.*)$")
    public void verifiqueElTituloDelFormularioBlockValidation(String question2) {
               OnStage.theActorInTheSpotlight().attemptsTo(Forms.onThePage());
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer2.the(question2)));

    }
    @And("^Verifique el titulo del formulario (.*)$")
    public void verifiqueElTituloDelFormularioInlineValidation(String question)  {
              OnStage.theActorInTheSpotlight().attemptsTo(InlineVal.TheInPage());
         OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.tothe(question)));
    }
    @Then("^Los datos del formulario Inline Validation son erroneos$")
    public void losDatosDelFormularioInlineValidationSonErroneos()  {
        OnStage.theActorInTheSpotlight().attemptsTo(InlineError.Page());
    }


}
