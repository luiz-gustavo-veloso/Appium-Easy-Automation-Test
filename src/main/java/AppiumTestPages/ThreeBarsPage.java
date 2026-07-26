package AppiumTestPages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class ThreeBarsPage extends BasePage{

    public ThreeBarsPage(AndroidDriver driver){
        super(driver);
    }
    private final By buttonLogIn = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"menu item log in\"]");

    public LoginPage abrirLogInSection() {
        clicar(buttonLogIn);
        return new LoginPage(driver);
    }

}
