package base;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import pages.RegistrationPage;

import static com.codeborne.selenide.Selenide.open;

public class TestBasic {
    public RegistrationPage registrationPage = new RegistrationPage();
    @BeforeAll
    public static void before(){
        Configuration.baseUrl = "https://demoqa.com";
        open();
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
    }
}
