package US_307;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC307_308_Elements {
    public TC307_308_Elements() {

        PageFactory.initElements(BaseDriver.driver, this);
    }

    @FindBy(xpath = "//a[@class='EJ-ShopLink']")
    public WebElement EcommerceByJunkieLink;

    @FindBy(xpath = "//a[@href='/']//img")
    public WebElement EcommerceByJunkieLogo;

    @FindBy(xpath = "//a[normalize-space()='See how it works']")
    public WebElement SeehowItWorksButton;

    @FindBy(xpath = "//button[@aria-label='close']")
    public WebElement CloseButton;

    @FindBy(xpath = "//div[@class='ytp-cued-thumbnail-overlay-image']")
    public WebElement YouTubeThumbnail;
}
