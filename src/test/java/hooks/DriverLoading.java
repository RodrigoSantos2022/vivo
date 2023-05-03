package hooks;

import org.openqa.selenium.NoSuchSessionException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;


public class DriverLoading {

    private static WebDriver instance;

    private DriverLoading() {
    }

    public static WebDriver getDriver() {
        if (instance == null) {
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--remote-allow-origins=*");

            System.setProperty("webdriver.chrome.driver", "C:\\AdvantageShop\\chromedriver.exe");
            instance = new ChromeDriver(options);
            instance.manage().window().maximize();
        }
        return instance;
    }

    public static void closeDriver() {
        try {
            if (instance != null && ((RemoteWebDriver) instance).getSessionId() != null) {
                instance.quit();
            }
        } catch (NoSuchSessionException e) {

        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            instance = null;
        }
    }


}


