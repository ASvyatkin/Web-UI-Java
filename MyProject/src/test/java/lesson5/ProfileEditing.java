package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ProfileEditing extends AbstractTest {
    @Test
    void test() throws InterruptedException {
        getDriver().get("https://www.livejournal.com");

        WebElement loginButtonHeader = getDriver().findElement(By.xpath(".//a[text()='Войти']"));
        loginButtonHeader.click();

        Thread.sleep(1000);

        WebElement inputNameField = getDriver().findElement(By.xpath(".//input[@id = 'user']"));
        inputNameField.click();
        inputNameField.sendKeys("A-Svyatkin");

        Thread.sleep(1000);

        WebElement inputPasswordField = getDriver().findElement(By.xpath(".//input[@id = 'lj_loginwidget_password']"));
        inputPasswordField.click();
        inputPasswordField.sendKeys("QweAsd9648725060");

        Thread.sleep(1000);

        WebElement rememberMeButton = getDriver().findElement(By.xpath(".//label[@class = 'b-loginform-checkbox__control']"));
        rememberMeButton.click();

        WebElement loginButtonWindow =
                getDriver().findElement(By.xpath(".//button[@class='b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center']"));
        loginButtonWindow.click();

        Thread.sleep(3000);

        WebElement profileHeader = getDriver().findElement(By.xpath(".//a[@title='a_svyatkin']"));
        new Actions(getDriver()).moveToElement(profileHeader).perform();

        WebElement element1 = getDriver().findElement(By.xpath("//*[@class = 'svgicon flaticon flaticon--settings']"));
        element1.click();

        Thread.sleep(1000);

        WebElement element2 = getDriver().findElement(By.xpath(".//a[@href = 'https://www.livejournal.com/manage/profile/?authas=a_svyatkin']"));
        element2.click();

        Thread.sleep(1000);

        WebElement element3 = getDriver().findElement(By.xpath(".//button[@class = 'b-flatbutton']"));
        element3.click();

        Thread.sleep(1000);

        Assertions.assertEquals("https://a-svyatkin.livejournal.com/profile", getDriver().getCurrentUrl());
    }
}
