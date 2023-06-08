package elements.com.demoqa;

import org.junit.jupiter.api.Test;
import base.TestBasic;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;


public class Text_Box extends TestBasic {

    @Test
    void FillFormTest() {
        TestBasic.before();
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
