package elements.com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Text_Box {

    @BeforeAll
    public final static void before(){
        Configuration.baseUrl = "https://demoqa.com";
        open();
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FillFormTest() {
        open("/text-box");
        String userName = "Alex";
        String userEmail = "google@gmail.com";
        String Address = "USA + Canada";
        $(".main-header").shouldHave(text("Text Box"));
        $("#userName").setValue(userName);
        $("#userEmail").setValue(userEmail);
        $("#currentAddress").setValue(Address);
        $("#permanentAddress").setValue(Address);
        $(".btn-primary").click();
    }
}
