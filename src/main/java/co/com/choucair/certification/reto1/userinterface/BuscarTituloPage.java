package co.com.choucair.certification.reto1.userinterface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class BuscarTituloPage extends PageObject {

    public static final Target Titulo= Target.the("Inline Validation")
            .located(By.xpath("//H5[text()='Inline Validation']"));
    public static final Target Block_Validation= Target.the("block validation")
            .located(By.xpath("//H5[text()='Block Validation']"));
}
