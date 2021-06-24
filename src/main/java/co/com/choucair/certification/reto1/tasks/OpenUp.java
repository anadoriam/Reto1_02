package co.com.choucair.certification.reto1.tasks;

import co.com.choucair.certification.reto1.userinterface.ColorlibPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUp implements Task{
    private ColorlibPage colorlibPage;

    public static Performable thePage() {
        return Tasks.instrumented(OpenUp.class);
    }



    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(Open.browserOn(colorlibPage));

    }




}
