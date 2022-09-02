package pageobjects;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.WebElement;

public class AvatarSelectionPage extends BasePageObject{

    public AvatarSelectionPage(AppiumDriver mainDriver){
        super(mainDriver);
    }

    public WebElement avatarPageContainer(){
        return super.findElementByImage("pathToAvatarPageContaninerImageRef");
    }

    public WebElement firstAvatar(){
        return super.findElementByImage("pathToFirstAvatarImageRef");
    }

    public WebElement firstAvatarSelected(){
        return super.findElementByImage("pathToFirstAvatarSelectedImageRef");
    }

    public WebElement confirmAvatarChoiceButton(){
        return super.findElementByImage("pathToConfirmAvatarChoiceButtonImageRef");
    }
}
