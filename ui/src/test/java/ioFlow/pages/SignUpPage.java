package ioFlow.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class SignUpPage extends PageObject {
    //Input Full Name
    private static final String Full_Name = "//input[@placeholder='Full Name']";
    public void inputFullName(String fullName) {
        $("Full_Name").type(fullName);
    }

    //Input Company Name
    private static final String Company_Name = "//input[@placeholder='Company Name (If any)']";
    public void inputCompnayName(String companyName) {
        $("Company_Name").type(companyName);
    }

    //Input Email Address
    private static final String Email_Address = "//input[@placeholder='Email Address']";
    public void inputEmailAddress(String emailAddress) {
        $("Email_Address").type(emailAddress);
    }

    //Input Password
    private static final String Password = "input[@placeholder='Password']";
    public void inputPassword(String Password) {
        $("Password").type(Password);
    }

}
