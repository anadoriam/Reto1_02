package co.com.choucair.certification.reto1.stepdefinitions;

import co.com.choucair.certification.reto1.tasks.Forms;
import co.com.choucair.certification.reto1.tasks.InlineVal;
import co.com.choucair.certification.reto1.tasks.Login;
import co.com.choucair.certification.reto1.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;



public class ColorlibStepDefinitions {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^: Ana quiere validar el formulario$")
    public void anaQuiereValidarElFormulario() {
        OnStage.theActorCalled("Ana").wasAbleTo(OpenUp.thePage(), (Login.onThePage()));


    }

    @When("^: Ingrsa a la funcionalidad Block Validatio y Inline Validation en la pagina Colorlib$")
    public void ingrsaALaFuncionalidadBlockValidatioYInlineValidationEnLaPaginaColorlib()  {

        OnStage.theActorCalled("Ana").wasAbleTo(Forms.onThePage(), (InlineVal.TheInPage()));

    }





    @Then("^: Diligencia el formulario y verifica la respuesta exitosa$")
    public void diligenciaElFormularioYVerificaLaRespuestaexitosa()  {

    }





}
