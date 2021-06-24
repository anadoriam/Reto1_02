package co.com.choucair.certification.reto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ColorlibFormsPage extends PageObject {
    public static final Target MenuForm_Elem= Target.the("seleccione Form Elementos")
            .located(By.xpath("(//A[@href='#'])[2]"));

    public static final Target Validations= Target.the("Clic en Validations")
            .located(By.xpath("//A[@href='form-validation.html'][text()='Validation']"));

    public static final Target Block_Validation= Target.the("block validation")
           .located(By.xpath("//H5[text()='Block Validation']"));

    public static final Target Required= Target.the("ingresar required")
            .located(By.xpath("//INPUT[@id='required2']"));

    public static final Target E_mail= Target.the("ingresar email")
            .located(By.xpath("//INPUT[@id='email2']"));

    public static final Target Password= Target.the("ingresar contraseña")
            .located(By.xpath("//INPUT[@id='password2']"));

    public static final Target confirm_password= Target.the("confirmar contraseña")
            .located(By.xpath("//INPUT[@id='confirm_password2']"));

    public static final Target date= Target.the("ingresar fecha")
            .located(By.xpath("//INPUT[@id='date2']"));

    public static final Target Url= Target.the("ingresar url")
            .located(By.xpath("//INPUT[@id='url2']"));

    public static final Target Digits_Only= Target.the("solo digitos")
            .located(By.xpath("//INPUT[@id='digits']"));

    public static final Target Range= Target.the("rango")
            .located(By.xpath("//INPUT[@id='range']"));

    public static final Target Policy= Target.the("politicas de privacidad")
            .located(By.xpath("//INPUT[@id='agree2']"));

    public static final Target Button_Validar= Target.the("boton validar")
            .located(By.xpath("(//INPUT[@type='submit'])[2]"));



}
