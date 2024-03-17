package US_303;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC303_304_ELEMENTS {

    public TC303_304_ELEMENTS() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(css = "[onclick=\"return EJProductClick('1595015')\"]")
    public WebElement addcart;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/div[3]/div/button[3]")
    public WebElement creditCard;

    @FindBy(css = "[class=\"EJIframeV3 EJOverlayV3\"]")
    public WebElement iframeodeme;

    @FindBy(css = "[placeholder=\"Email\"]")
    public WebElement mail;

    @FindBy(css = "[placeholder=\"Confirm Email\"]")
    public WebElement confirmail;

  @FindBy(css = "[placeholder=\"Name On Card\"]")
    public WebElement nameOncard;

  @FindBy(css = "[class=\"Pay-Button\"]")
    public WebElement payclick;

  @FindBy(xpath = "//*[@id=\"Stripe-Element\"]")
    public WebElement credtCardInput;

  @FindBy(css = "[name=\"__privateStripeFrame7006\"]")
    public WebElement iframeCreditCar;


}
