package ioFlow.features.browser;

import ioFlow.steps.serenity.HomeSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.Steps;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(SerenityRunner.class)
public class WhenOpeningtheWeb {
    @Managed
    WebDriver driver;

    @Steps
    HomeSteps ioFlow;

    @Test
    public void launch_web_app() {
        ioFlow.visitApp();
    }
}
