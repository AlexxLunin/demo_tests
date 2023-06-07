package elements;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static java.nio.channels.SocketChannel.open;


public class Text_Box {

    @BeforeAll
    static void before(){
        Configuration.baseUrl = "https://demoqa.com";
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void FillFormTest() {
        open("https://demoqa.com/text-box");
        String userName = "Alex";
        $("#userName").setValue(userName);
        $("#us erEmail").setValue("google@gmail.com");
        $("#currentAddress").setValue("USA");
        $("#permanentAddress").setValue("USA + Canada");
        $(".btn-primary").click();
    }
}
