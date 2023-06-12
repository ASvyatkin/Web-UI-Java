package lesson6;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProfileEditing extends AbstractTest {
    @Test
    void test() {

        HomePage homePage = new HomePage(getEventDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());

        AuthPanel authPanel = new AuthPanel(getEventDriver());
        authPanel
                .inputLogin(authPanel.getLogin())
                .inputPassword(authPanel.getPassword())
                .clickOnElement(authPanel.getRememberMeButton())
                .clickOnElement(authPanel.getLoginButtonWindow());

        HomePage homePageAfter = new HomePage(getEventDriver());

        homePageAfter
                .moveToElement(homePageAfter.getProfileHeader())
                .clickOnElement(homePageAfter.getSettingButton());

        Assertions.assertEquals("https://www.livejournal.com/settings", getEventDriver().getCurrentUrl());
    }
}

