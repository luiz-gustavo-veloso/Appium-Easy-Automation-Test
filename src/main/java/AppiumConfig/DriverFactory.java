package AppiumConfig;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.URI;
import java.net.URL;
import java.time.Duration;

public class DriverFactory {

    private static AndroidDriver driver;

    public static AndroidDriver theDriver() throws Exception {
        if (driver == null) {
            // 1. Criamos as opções aqui dentro se o driver for nulo
            UiAutomator2Options options = new UiAutomator2Options()
                    .setPlatformName("Android")
                    .setDeviceName("emulator-5554")
                    .setApp(System.getProperty("user.dir") + "/apps/Android-MyDemoAppRN.1.3.0.build-244.apk")
                    .setAutomationName("UiAutomator2")
                    .setFullReset(true);

            // 2. A URL e a inicialização do driver DEVEM ficar dentro do IF.
            // Assim, o 'options' é reconhecido perfeitamente e o driver só é criado uma vez!
            URL url = URI.create("http://127.0.0.1:4723/").toURL();

            driver = new AndroidDriver(url, options);
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        }
        // O retorno do driver fica logo após o fechamento do bloco IF
        return driver;
    } // <-- Aqui fecha corretamente o método oDriver()

    public static void tearDown() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }
}