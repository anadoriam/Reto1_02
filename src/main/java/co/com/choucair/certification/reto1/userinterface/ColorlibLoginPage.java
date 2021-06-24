package co.com.choucair.certification.reto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorlibLoginPage extends PageObject {

    public static final Target Input_User= Target.the("Nombre de usuario")
            .located(By.xpath("(//INPUT[@type='text'])[1]"));

    public static final Target Input_Password= Target.the("Contraseña")
            .located(By.xpath("(//INPUT[@type='password'])[1]"));

    public static final Target Button_Singin= Target.the("Boton de inicio de sesion")
            .located(By.xpath("//BUTTON[@class='btn btn-lg btn-primary btn-block'][text()='Sign in']"));

}
