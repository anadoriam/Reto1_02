package co.com.choucair.certification.reto1.tasks;

import co.com.choucair.certification.reto1.userinterface.ColorlibFormsPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Forms implements Task {
    public static Forms onThePage() {
        return Tasks.instrumented(Forms.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                Enter.theValue("Ana").into(ColorlibFormsPage.Required),
                Enter.theValue("adoriam@choucairtesting.com").into(ColorlibFormsPage.E_mail),
                Enter.theValue("Anadm").into(ColorlibFormsPage.Password),
                Enter.theValue("Anadm").into(ColorlibFormsPage.confirm_password),
                Enter.theValue("23/06/2021").into(ColorlibFormsPage.date),
                Enter.theValue("https://operacion.choucairtesting.com/academy/course/view.php?id=484").into(ColorlibFormsPage.Url),
                Enter.theValue("123456").into(ColorlibFormsPage.Digits_Only),
                Enter.theValue("6").into(ColorlibFormsPage.Range),
                Click.on(ColorlibFormsPage.Policy),
                Click.on(ColorlibFormsPage.Button_Validar)
        );


    }
}