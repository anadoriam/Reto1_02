package co.com.choucair.certification.reto1.tasks;


import co.com.choucair.certification.reto1.userinterface.ColorlibInlineValPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class InlineVal implements Task {

    public static InlineVal TheInPage() {

        return Tasks.instrumented(InlineVal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor){
        actor.attemptsTo(
                Click.on(ColorlibInlineValPage.Titulo),
                Enter.theValue("Ana").into(ColorlibInlineValPage.Req),
                Enter.theValue("adoriam@choucairtesting.com").into(ColorlibInlineValPage.Email),
                Enter.theValue("123456").into(ColorlibInlineValPage.Passw),
                Enter.theValue("123456").into(ColorlibInlineValPage.Conf_Pass),
                Enter.theValue("24/06/2021").into(ColorlibInlineValPage.Dat),
                Enter.theValue("https://operacion.choucairtesting.com/academy/course/view.php?id=484").into(ColorlibInlineValPage.Url),
                Click.on(ColorlibInlineValPage.Politic_Priv),
                Enter.theValue("123").into(ColorlibInlineValPage.Minm3Chars),
                Enter.theValue("123456").into(ColorlibInlineValPage.Max6Chars),
                Enter.theValue("123").into(ColorlibInlineValPage.Minm3),
                Enter.theValue("kjiuhygtrewasdg").into(ColorlibInlineValPage.Max16),
                Click.on(ColorlibInlineValPage.Butt_Val)
        );

    }




}
