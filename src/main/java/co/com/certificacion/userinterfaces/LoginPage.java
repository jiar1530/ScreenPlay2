package co.com.certificacion.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target LINK_LOGIN = Target.the("Link Login").located(By.xpath("//button[text()='Log in']"));
    public static final Target TXT_USERNAME = Target.the("Text Username").located(By.xpath("//form[@id='login']/div/input"));
    public static final Target TXT_PASSWORD = Target.the("Text Password").located(By.xpath("//form[@id='login']/div[2]/input"));
    public static final Target BTN_LOGIN = Target.the("Button Login").located(By.xpath("//button[@type='submit']"));
    public static final Target LBL_USERNAME = Target.the("Label Username").located(By.xpath("//div[@id='app']/div/header/div/div[2]/ul/div/button/span"));
    public static final Target LBL_PAGINA = Target.the("Label Pagina").located(By.xpath("//*[@id='app']/div/header/div/div[2]/ul/div/button/span[1]"));

}
