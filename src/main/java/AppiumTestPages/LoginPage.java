package AppiumTestPages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;



public class LoginPage extends BasePage {


    private final By fieldUserName = AppiumBy.accessibilityId("Username input field");
    private final By fieldPasswordName = AppiumBy.accessibilityId("Password input field");
    private final By buttonSubmitLogin = AppiumBy.accessibilityId("Login button");



    public LoginPage(AndroidDriver driver) {
        super(driver); // Repassa o Driver para a BasePage
    }


    public void preencherUsuario(String user) {
        escrever(fieldUserName, user);
    }

    public void preencherSenha(String senha) {
        escrever(fieldPasswordName, senha);
    }

    public void clicarSubmitLogin() {
        clicar(buttonSubmitLogin);
    }

    public HomePage realizarLogin(String user, String password) {
        preencherUsuario(user);
        preencherSenha(password);
        clicarSubmitLogin();
        return new HomePage(driver);
    }

}
