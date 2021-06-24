package co.com.choucair.certification.reto1.tasks;

import co.com.choucair.certification.reto1.userinterface.ColorlibLoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;


public class Login implements Task {
    public static Login onThePage() {
        return Tasks.instrumented(Login.class);
        }

    @Override
    public <T extends Actor> void performAs(T actor){
       actor.attemptsTo(
               Enter.theValue("demo").into(ColorlibLoginPage.Input_User),
               Enter.theValue("demo").into(ColorlibLoginPage.Input_Password),
               Click.on(ColorlibLoginPage.Button_Singin)
       );

    }
}
