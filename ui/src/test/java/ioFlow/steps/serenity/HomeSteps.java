package ioFlow.steps.serenity;

import ioFlow.pages.HomePage;
import net.thucydides.core.annotations.Step;

public class HomeSteps {
    HomePage onHomepage;

    @Step
    public void visitApp() {
        onHomepage.open();
    }


}
