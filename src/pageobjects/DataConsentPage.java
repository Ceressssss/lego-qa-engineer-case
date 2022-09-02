package pageobjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class DataConsentPage extends BasePageObject{

    public DataConsentPage(AppiumDriver mainDriver){
        super(mainDriver);
    }

    public WebElement dataConsentPageContainer(){
        return super.findElementByImage("pathToDataConsentPageImageRef");
    }

    public WebElement necessaryDataToggledOn(){
        return super.findElementByImage("pathToNecessaryDataToggledOnImageRef");
    }

    public WebElement experienceDataToggledOn(){
        return super.findElementByImage("pathToExperienceDataToggledOnImageRef");
    }

    public WebElement experienceDataToggledOff(){
        return super.findElementByImage("pathToExperienceDataToggledOffImageRef");
    }

    public WebElement saveSettingsButton(){
        return super.findElementByImage("pathToSaveSettingsImageRef");
    }

}
