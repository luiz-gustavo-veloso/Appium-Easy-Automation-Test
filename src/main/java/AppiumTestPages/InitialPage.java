package AppiumTestPages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class InitialPage extends BasePage{

    public InitialPage(AndroidDriver driver){
        super(driver);
    }

    private final By buttonDontShowAgain = AppiumBy.id("android:id/button1");


    public HomePage pularPrimeiraTela() {
        clicar(buttonDontShowAgain);
        return new HomePage(driver);
    }


}
