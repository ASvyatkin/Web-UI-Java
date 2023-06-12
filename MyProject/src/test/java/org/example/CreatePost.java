package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class CreatePost {
    public static void CreatePost() throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");

        WebDriver webDriver = new ChromeDriver(options);
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        webDriver.get("https://www.livejournal.com");

        WebElement loginButtonHeader = webDriver.findElement(By.xpath(".//a[text()='Войти']"));
        loginButtonHeader.click();

        Thread.sleep(1000);

        WebElement inputNameField = webDriver.findElement(By.xpath(".//input[@id = 'user']"));
        inputNameField.click();
        inputNameField.sendKeys("A-Svyatkin");

        Thread.sleep(1000);

        WebElement inputPasswordField = webDriver.findElement(By.xpath(".//input[@id = 'lj_loginwidget_password']"));
        inputPasswordField.click();
        inputPasswordField.sendKeys("QweAsd9648725060");

        Thread.sleep(1000);

        WebElement rememberMeButton = webDriver.findElement(By.xpath(".//label[@class = 'b-loginform-checkbox__control']"));
        rememberMeButton.click();

        WebElement loginButtonWindow = webDriver.findElement(By.xpath(".//button[@class='b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center']"));
        loginButtonWindow.click();

        Thread.sleep(3000);


        WebElement element1 = webDriver.findElement(By.xpath("//*[@class='s-header-item-post--long']"));
        element1.click();

        Thread.sleep(1000);

        WebElement element2 = webDriver.findElement(By.xpath("//*[@class = 'aentry-post__block--unstyled aentry-post__block-with-sidebar']"));
        element2.click();
        element2.sendKeys("111");

        Thread.sleep(1000);

        WebElement element3 = webDriver.findElement(By.xpath("//*[@class = 'reset-0-2-222 root-0-2-224 rootSmall-0-2-227 textSemibold-0-2-234 backgroundBlue-0-2-237 textWithDropDownIcon-0-2-248']"));
        element3.click();

        Thread.sleep(1000);

        WebElement element4 = webDriver.findElement(By.xpath("//*[@class = 'reset-0-2-222 root-0-2-224 rootSmall-0-2-227 textSemibold-0-2-234 backgroundBlue-0-2-237 textWithDropDownIcon-0-2-248']"));
        element4.click();

        Thread.sleep(1000);

        WebElement element5 = By.xpath("//*[@class= 'reset-0-2-222 root-0-2-224 rootMaxWidth-0-2-232 textBold-0-2-235 textBlue-0-2-236']").findElement(webDriver);
        element5.click();

        Thread.sleep(1000);

        webDriver.quit();
    }
}
