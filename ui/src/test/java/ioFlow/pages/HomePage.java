package ioFlow.pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.support.FindBy;

@DefaultUrl("https://flowco.io/dashboard/home")
public class HomePage extends PageObject {
    @FindBy(xpath = "//button[@class=’hero__btn’][contains(text(),’Login’ )]")
    WebElementFacade visitLogin;

    public void setVisitLogin(WebElementFacade visitLogin) {
        visitLogin.click();
    }
}
