package org.example;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class ProfileEditing {
    public static void ProfileEditing() throws InterruptedException {
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

        WebElement loginButtonWindow =
                webDriver.findElement(By.xpath(".//button[@class='b-loginform-btn b-loginform-btn--login b-loginform-btn--auth b-loginform-btn--center']"));
        loginButtonWindow.click();

        Thread.sleep(3000);

        WebElement profileHeader = webDriver.findElement(By.xpath(".//a[@title='a_svyatkin']"));
        new Actions(webDriver).moveToElement(profileHeader).perform();

        WebElement element1 = webDriver.findElement(By.xpath("//*[@class = 'svgicon flaticon flaticon--settings']"));
        element1.click();

        Thread.sleep(1000);

        WebElement element2 = webDriver.findElement(By.xpath(".//a[@href = 'https://www.livejournal.com/manage/profile/?authas=a_svyatkin']"));
        element2.click();

        Thread.sleep(1000);

        WebElement element3 = webDriver.findElement(By.xpath(".//button[@class = 'b-flatbutton']"));
        element3.click();

        Thread.sleep(1000);

        webDriver.quit();
    }
}
