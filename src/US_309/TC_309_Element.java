package US_309;

import Utility.BaseDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TC_309_Element {
    public TC_309_Element() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//*[@id=\"top\"]/main/div[1]/div[2]/div/div/div/p[2]/a[2]")
    public WebElement addcart;


    @FindBy(xpath = "//iframe[@class=\"EJIframeV3 EJOverlayV3\"]")
    public WebElement iframe1;

    @FindBy(xpath = "//*[@class=\"Payment-Button CC\"]")
    public WebElement CreditCard;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[1]/input")
    public WebElement email;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[2]/input")
       public WebElement confirmEmail;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[2]/form/div[1]/p[3]/input")
    public WebElement NameCard;

    @FindBy(xpath = "//*[@placeholder=\"Address Line 1\"][1]")
    public WebElement adress1;

    @FindBy(xpath = "//*[@autocomplete=\"address-2\"][1]")
    public WebElement adress2;

    @FindBy(xpath = "//*[@placeholder=\"City\"][1]")
    public WebElement city;

    @FindBy(xpath = "//*[@placeholder=\"ZIP/Postal Code\"][1]")
    public WebElement Zip;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[3]/div[2]/div[1]/p[2]/input")
    public WebElement inputCard;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[3]/div[2]/div[1]/p[3]/input")
    public WebElement date;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[3]/div[2]/div[1]/p[4]/input")
    public WebElement ccvInput;

    @FindBy(xpath = "//*[@id=\"Overlay\"]/div/div[2]/div/div[3]/div[2]/button[1]")
    public WebElement payButton;

    @FindBy(xpath = "//*[@class=\"download_btn top10\"]")
    public WebElement download;

    }
