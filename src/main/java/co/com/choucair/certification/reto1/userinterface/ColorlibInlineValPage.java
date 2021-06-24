package co.com.choucair.certification.reto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorlibInlineValPage extends PageObject {

    public static final Target Titulo= Target.the("Buscar el titulo del formulario")
            .located(By.xpath("//H5[text()='Inline Validation']"));
    public static final Target Req = Target.the("Requerido del formulario")
            .located(By.id("required"));
    public static final Target Email= Target.the("E-Mail")
            .located(By.id("email"));
    public static final Target Passw= Target.the("Contraseña")
            .located(By.id("password"));
    public static final Target Conf_Pass= Target.the("Confirmar contraseña")
            .located(By.id("confirm_password"));
    public static final Target Dat= Target.the("Fecha")
            .located(By.id("date"));
    public static final Target Url= Target.the("Url")
            .located(By.id("url"));
    public static final Target Politic_Priv= Target.the("Politicas de privacidad")
            .located(By.id("agree"));
    public static final Target Minm3Chars= Target.the("Mínimo 3 caracteres")
            .located(By.id("minsize"));
    public static final Target Max6Chars= Target.the("Máximo 6 caracteres")
            .located(By.id("maxsize"));
    public static final Target Minm3= Target.the("Mínimo 3")
            .located(By.id("minNum"));
    public static final Target Max16= Target.the("Máximo 16")
            .located(By.id("maxNum"));
    public static final Target Butt_Val= Target.the("")
            .located(By.xpath("(//INPUT[@type='submit'])[3]"));






}
