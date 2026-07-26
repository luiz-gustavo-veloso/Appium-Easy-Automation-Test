package AppiumTestPages;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    protected AndroidDriver driver;
    protected WebDriverWait wait;

    public BasePage(AndroidDriver driver){
        this.driver = driver;

    }

    protected WebElement encontrar(By elemento) {
        return driver.findElement(elemento);
    }

    protected void escrever(By elemento, String texto){

        encontrar(elemento).sendKeys(texto);
    }

    protected void clicar(By elemento){

        encontrar(elemento).click();
    }

    protected boolean estaVisivel(By elemento, int tempoEmSegundos){
        try {
            wait = new WebDriverWait(driver, Duration.ofSeconds(tempoEmSegundos));
            return wait.until(ExpectedConditions.visibilityOfElementLocated(elemento)).isDisplayed();
        } catch (Exception e) {
            return false;
         }
        }
    }


