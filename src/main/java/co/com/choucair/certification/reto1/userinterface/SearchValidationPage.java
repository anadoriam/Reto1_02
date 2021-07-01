package co.com.choucair.certification.reto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class SearchValidationPage extends PageObject {
    public static final Target MenuForm_Elem= Target.the("seleccione Form Elementos")
            .located(By.xpath("(//A[@href='#'])[2]"));

    public static final Target Validations= Target.the("Clic en Validations")
            .located(By.xpath("//A[@href='form-validation.html'][text()='Validation']"));

}
