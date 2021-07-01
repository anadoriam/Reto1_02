package co.com.choucair.certification.reto1.tasks;

import co.com.choucair.certification.reto1.userinterface.BuscarTituloPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class Search implements Task {
    private String titulo;

    public Search(String titulo){

        this.titulo = titulo;
    }

    public static Search the(String titulo) {

        return Tasks.instrumented(Search.class,titulo);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(BuscarTituloPage.Titulo)
        );

    }





}
