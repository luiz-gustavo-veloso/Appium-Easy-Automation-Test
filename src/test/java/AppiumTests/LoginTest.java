package AppiumTests;

import AppiumConfig.DriverFactory;
import AppiumTestPages.HomePage;
import AppiumTestPages.InitialPage;
import AppiumTestPages.LoginPage;
import io.appium.java_client.android.AndroidDriver;
import org.junit.jupiter.api.*;

public class LoginTest  {

    private AndroidDriver driver;


@BeforeEach

public void setUp() throws Exception{
    this.driver = DriverFactory.theDriver();
 }

@Test
@DisplayName("Test LogIn no MyDemoApp")
//comentario
public void testLogIn(){
    Boolean initialPage = new InitialPage(driver)
            .pularPrimeiraTela()
                    .abrirTab()
                        .abrirLogInSection()
                                    .realizarLogin("bob@example.com","10203040")
                                            .produtoEstaVisivelNoCatalogo();


    Assertions.assertTrue(initialPage,"FALHA: O produto do catálogo não ficou visível após autenticar!" );
}

}


