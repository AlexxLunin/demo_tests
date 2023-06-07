package forms.com.demoqa;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.io.File;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.value;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class StudentRegistrationForm {

    @BeforeAll
    public final static void before() {
        Configuration.baseUrl = "https://demoqa.com";
        open();
        WebDriverRunner.getWebDriver().manage().window().maximize();
        Configuration.browser = "chrome";
        Configuration.holdBrowserOpen = true;
    }

    String name = "Elon";
    String lname = "Musk";
    String email = "elonmusk@gmail.com";
    String gender = "Male";
    String mobile = "+12483485974";
    String month = "October";
    String year = "1997";
    String subject1 = "Maths";
    String address = "221B Baker Street, London, UK";


    @Test
    void ApplicationForm() {
        open("/automation-practice-form");
        //Advertisment deleting
        executeJavaScript("$('#fixedban').remove()");
        //Footer deleting
        executeJavaScript("$('footer').remove()");

        //Personal Info
        $(".practice-form-wrapper").shouldHave(text("Student Registration Form"));
        $("#firstName").setValue(name);
        $("#lastName").setValue(lname);
        $("#userEmail").setValue(email);
        $(byText(gender)).click();
        $("#userNumber").setValue(mobile);
        $("#dateOfBirthInput").click();

        // Choose date of birth
        $("#dateOfBirthInput").click();
        $(".react-datepicker__month-select").selectOptionContainingText(month);
        $(".react-datepicker__year-select").selectOptionContainingText(year);
        $(".react-datepicker__day.react-datepicker__day--031").click();

        //Subjects form
        $("#subjectsInput").sendKeys("Ma");
        $(byText(subject1)).click();

        //Hobbies
        $("[for=hobbies-checkbox-2]").click();

        //Choose Picture
        $("#uploadPicture").uploadFile(new File("src/test/resources/Images/IMG.png"));

        //Current address
        $("#currentAddress").setValue(address);

        //State and City
        $("#state").click();
        $("#stateCity-wrapper").$(byText("Haryana")).click();
        $("#city").click();
        $("#stateCity-wrapper").$(byText("Panipat")).click();

        //Submit button
        $("submit").click();


    }

}
