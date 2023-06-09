package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class CreatePost extends AbstractTest {
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

        WebElement loginButtonWindow = getDriver().findElement(By.xpath(".//button[@class='b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center']"));
        loginButtonWindow.click();

        Thread.sleep(3000);


        WebElement element1 = getDriver().findElement(By.xpath("//*[@class='s-header-item-post--long']"));
        element1.click();

        Thread.sleep(1000);

        WebElement element2 = getDriver().findElement(By.xpath("//*[@class = 'notranslate public-DraftEditor-content']"));
        element2.click();
        element2.sendKeys("111");

        Thread.sleep(1000);

        WebElement element3 = getDriver().findElement(By.xpath("//*[@class = 'reset-0-2-222 root-0-2-224 rootSmall-0-2-227 textSemibold-0-2-234 backgroundBlue-0-2-237 textWithDropDownIcon-0-2-248']"));
        element3.click();

        Thread.sleep(1000);


        WebElement element4 = getDriver().findElement(By.xpath("//*[@class = 'reset-0-2-222 root-0-2-224 rootMaxWidth-0-2-232 textBold-0-2-235 textBlue-0-2-236']"));
        element4.click();

        Thread.sleep(1000);

        Assertions.assertEquals("https://www.livejournal.com/post", getDriver().getCurrentUrl());
    }
}
