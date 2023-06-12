package lesson6;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class Authorization extends AbstractTest {
    @Test
    void test(){
        HomePage homePage = new HomePage(getEventDriver());
        homePage.clickOnElement(homePage.getLoginButtonHeader());

        AuthPanel authPanel = new AuthPanel(getEventDriver());
        authPanel
                .inputLogin(authPanel.getLogin())
                .inputPassword(authPanel.getPassword())
                .clickOnElement(authPanel.getRememberMeButton())
                .clickOnElement(authPanel.getLoginButtonWindow());

        Assertions.assertDoesNotThrow(homePage::getProfileHeader);
    }
}