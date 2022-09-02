package pageobjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class CameraPermissionsPage extends BasePageObject{

    public CameraPermissionsPage(AppiumDriver mainDriver){
        super(mainDriver);
    }

    public WebElement cameraPermissionsPageContainer(){
        return super.findElementByImage("pathToDataConsentPageImageRef");
    }

    public WebElement acceptCameraPermissionsButton(){
        return super.findElementByImage("pathToAcceptCameraPermissionsImageRef");
    }

    public WebElement confirmCameraAccess(){
        //System notification should be accessable by driver directly
        return driver.findElement(By.id("OK"));
    }

}
