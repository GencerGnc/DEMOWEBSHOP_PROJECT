package US_301;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TC301_302_Elements {

    public TC301_302_Elements(){

        PageFactory.initElements(BaseDriver.driver,this);
    }
    @FindBy(xpath="//*[@id='products']/div[1]/div/div[2]/a/div/div[2]/button")
    public List<WebElement> eBookAdd;

    @FindBy(xpath="/html/body/iframe[1]")
    public List<WebElement> SwitchIframe;

    @FindBy(xpath="//*[@id='Overlay']/div/div[2]/div/div[1]/div[2]/div[2]/h5")
    public List<WebElement> addToCartControl;

    @FindBy(xpath="//*[@id=\"Overlay\"]/div/div[2]/div/div[1]/div[4]/button[2]")
    public List<WebElement> PromotionButton;

    @FindBy(xpath="//*[@id=\"Overlay\"]/div/div[2]/div/div[1]/div[4]/div/input")
    public List<WebElement> AddPromoCode;

    @FindBy(xpath="//div[@id='SnackBar']/span")
    public List<WebElement> WrongProcess;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/div[3]/div/button[3]")
    public List<WebElement> PayUsingCC;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[1]/input")
    public List<WebElement> EnsureEmail;

    @FindBy(xpath = "//*[@id=\"root\"]/form/div/div[2]/span[2]/span[2]/span/span/input")
    public List<WebElement> EnsureConfirmEmail;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[1]/input")
    public List<WebElement> EnsureNameOnCard;

    @FindBy(xpath = "//*[@id=\"Stripe-Element\"]")
    public List<WebElement> EnsureCartDetails;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[3]/div[2]/button[1]")
    public List<WebElement> payButton;

}
