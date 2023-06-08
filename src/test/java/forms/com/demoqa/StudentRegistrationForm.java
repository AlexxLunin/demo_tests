package forms.com.demoqa;

import org.junit.jupiter.api.Test;
import base.TestBasic;

public class StudentRegistrationForm extends TestBasic {

    @Test
    void ApplicationForm() {

        TestBasic.before();
        registrationPage.openPage()
                .setFirstName("Thomas")
                .setLastName("Holmes")
                .setEmail("ThomasHolmes@gmail.com")
                .setGender("Male")
                .setMobileNum("17945634565")
                .setDateOfBirth("31", "October", "1997")
                .setSubjects("Math")
                .setSubjects("Biology")
                .setHobby("2")  // MAX 3
                .sentFile("src/test/resources/Images/IMG.png")
                .setAddress("221B Baker Street, London, England")
                .setState("Haryana")
                .setCity("Panipat")
                .click();
    }

}
