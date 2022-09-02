package tests;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTestClass {

    AppiumDriver driver;

    public BaseTestClass(AppiumDriver mainDriver){
        this.driver = mainDriver;
    }

    public void waitForElement(WebElement elementToWaitFor){
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.visibilityOf(elementToWaitFor));
    }
}

