package lesson3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Authorization {
    public static void authorization() throws InterruptedException {
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
                webDriver.findElement(By.xpath("//*[@class='s-header-item-post--long']"));
        loginButtonWindow.click();

        Thread.sleep(3000);

        webDriver.quit();
    }
}
