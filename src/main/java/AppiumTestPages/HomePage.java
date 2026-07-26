package AppiumTestPages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomePage extends BasePage {

    public HomePage(AndroidDriver driver){
        super(driver);
    }

    private final By buttonThreeBars = AppiumBy.xpath("//android.view.ViewGroup[@content-desc=\"open menu\"]/android.widget.ImageView");
    private final By imagemPrimeiroProduto = AppiumBy.xpath("//android.widget.ScrollView/android.view.ViewGroup/android.view.ViewGroup[2]/android.view.ViewGroup[1]/android.view.ViewGroup[1]/android.widget.ImageView");

    public ThreeBarsPage abrirTab() {
        clicar(buttonThreeBars);
        return new ThreeBarsPage(driver);
    }

    public boolean produtoEstaVisivelNoCatalogo() {
        return estaVisivel(imagemPrimeiroProduto, 10);
    }

}
