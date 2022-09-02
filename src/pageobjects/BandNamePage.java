package pageobjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class BandNamePage extends BasePageObject{

    public BandNamePage(AppiumDriver mainDriver) {
        super(mainDriver);
    }

    public WebElement bandNamePageContainer(){
        return super.findElementByImage("pathToBandNamePageContainerImageRef");
    }

    public WebElement acceptGeneratedNameButton(){
        return super.findElementByImage("pathToAcceptGeneratedNameButtonImageRef");
    }
}
