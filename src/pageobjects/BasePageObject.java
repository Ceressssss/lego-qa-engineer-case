package pageobjects;

import io.appium.java_client.AppiumDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

public class BasePageObject {

    AppiumDriver driver;

    public BasePageObject(AppiumDriver mainDriver){
        this.driver = mainDriver;
    }

    public WebElement findElementByImage(String pathToRefImage) {
        try{
            return driver.findElementByImage(encodeReferenceImageToBase64(pathToRefImage));
        } catch (IOException e){
            // Ideally this would be printed to a logger with a fitting error message
            e.printStackTrace();
            return null;
        }
    }

    private String encodeReferenceImageToBase64(String pathToImage) throws IOException {
        byte[] fileContent = FileUtils.readFileToByteArray(new File(pathToImage));
        return Base64.getEncoder().encodeToString(fileContent);
    }
}
