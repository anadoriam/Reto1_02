package co.com.choucair.certification.reto1.tasks;

import co.com.choucair.certification.reto1.userinterface.ColorlibFormsPage;
import co.com.choucair.certification.reto1.userinterface.SearchValidationPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class SearchValidation implements Task {

    public static SearchValidation Page() {
        return Tasks.instrumented(SearchValidation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SearchValidationPage.MenuForm_Elem),
                Click.on(SearchValidationPage.Validations)

        );



    }
}
