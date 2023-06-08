package pages;

import com.codeborne.selenide.SelenideElement;
import pages.components.Calendar;
import pages.components.Click;
import pages.components.FileUpload;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class RegistrationPage {

    Calendar calendar = new Calendar();
    FileUpload fileUpload = new FileUpload();
    Click click = new Click();

    private final String TITLE = "Student Registration Form";
    private SelenideElement
            firstName = $("#firstName"),
            lastName = $("#lastName"),
            emailAddress = $("#userEmail"),
            genderType = $("#genterWrapper"),
            mobileNumber = $("#userNumber"),
            dateOfBirth = $("#dateOfBirthInput"),
            address = $("#currentAddress"),
            stateCity = $("#stateCity-wrapper"),
            varclick = $("#submit");


    public RegistrationPage openPage() {
        open("/automation-practice-form");
        executeJavaScript("$('#fixedban').remove()");
        executeJavaScript("$('footer').remove()");
        $(".practice-form-wrapper").shouldHave(text(TITLE));
        return this;

    }

    public RegistrationPage setFirstName(String name) {
        firstName.setValue(name);
        return this;
    }


    public RegistrationPage setLastName(String name) {
        lastName.setValue(name);
        return this;
    }

    public RegistrationPage setEmail(String email) {
        emailAddress.setValue(email);
        return this;
    }

    public RegistrationPage setGender(String value) {
        genderType.$(byText(value)).click();
        return this;
    }

    public RegistrationPage setMobileNum(String value) {
        mobileNumber.setValue(value);
        return this;
    }

    public RegistrationPage setDateOfBirth(String day, String month, String year) {
        dateOfBirth.click();
        calendar.dateOfBirth(day, month, year);
        return this;
    }

    public RegistrationPage setSubjects(String subject) {
        $("#subjectsInput").setValue(subject).pressEnter();
        return this;
    }

    public RegistrationPage setHobby(String value) {
        $("[for=hobbies-checkbox-" + value + "]").click();
        return this;
    }

    public RegistrationPage sentFile(String path) {
        fileUpload.uploadFile(path);
        return this;
    }

    public RegistrationPage setAddress(String address) {
        this.address.setValue(address);
        return this;
    }

    public RegistrationPage setState(String state) {
        $("#state").click();
        stateCity.$(byText(state)).click();
        return this;
    }

    public RegistrationPage setCity(String city) {
        $("#city").click();
        stateCity.$(byText(city)).click();
        return this;
    }

    public RegistrationPage click() {
        varclick.click();
        return this;
    }
}

