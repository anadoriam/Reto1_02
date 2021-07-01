package co.com.choucair.certification.reto1.questions;

import co.com.choucair.certification.reto1.userinterface.ColorlibInlineValPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class Answer implements Question<Boolean> {

    private String question;

    public Answer(String question){

        this.question =question;
    }
    public static Answer tothe(String question) {
        return new Answer(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String NameFormulario = Text.of(ColorlibInlineValPage.Titulo).viewedBy(actor).asString();
        if (question.equals(NameFormulario)){
            result= true;
        }
        else {
            result= false;
        }
        return result;
    }
}
