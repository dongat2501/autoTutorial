package ioFlow.pages;

import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends PageObject {
    @FindBy(xpath = "//ins[contains(text(),’Login’ )]")
    WebElementFacade visitSignUp;

    public void setVisitLogin() {
        visitSignUp.click();
    }
}
