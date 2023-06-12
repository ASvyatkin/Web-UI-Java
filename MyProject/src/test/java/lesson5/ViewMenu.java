package lesson5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class ViewMenu extends AbstractTest {
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

        WebElement element1 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/novye_lica/']"));
        element1.click();

        Thread.sleep(1000);

        WebElement element2 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/media_v_zhzh/']"));
        element2.click();

        Thread.sleep(1000);


        WebElement element5 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/video/']"));
        element5.click();

        Thread.sleep(1000);

        WebElement element6 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/ii/']"));
        element6.click();

        Thread.sleep(1000);

        WebElement element7 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/puteshestviya/']"));
        element7.click();

        Thread.sleep(1000);

        WebElement element8 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/eda/']"));
        element8.click();

        Thread.sleep(1000);

        WebElement element10 = getDriver().findElement(By.xpath(".//a[@href='https://www.livejournal.com/category/kino/']"));
        element10.click();

        Thread.sleep(1000);


        Assertions.assertEquals("https://www.livejournal.com/category/kino/", getDriver().getCurrentUrl());
    }
}
