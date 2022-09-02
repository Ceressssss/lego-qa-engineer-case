package pageobjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TutorialVideoPage extends BasePageObject {


    public TutorialVideoPage(AppiumDriver mainDriver){
        super(mainDriver);
    }

    public WebElement firstPageOfTutorialVideoContainer(){
        return driver.findElementByImage("pathToFirstPageOfTutorialVideoContainerImageRef");
    }

    public WebElement firstPageOfTutorialContinueButton(){
        return driver.findElementByImage("pathToFirstPageOfTutorialContinueButtonImageRef");
    }
}
