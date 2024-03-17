package US_301;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_301 extends BaseDriver {

    @Test
    public void TC_301() {
        JavascriptExecutor js=(JavascriptExecutor) driver;
        TC301_302_Elements allElements = new TC301_302_Elements();
        driver.get("https://shopdemo.e-junkie.com/");

        allElements.eBookAdd.get(0).click();
        Tools.Bekle(3);
        driver.switchTo().frame(allElements.SwitchIframe.get(0));
        Assert.assertFalse(allElements.addToCartControl.isEmpty(), "addToCartControl list empty.");
        Tools.Bekle(3);

        String actualText = allElements.addToCartControl.get(0).getText();
        Assert.assertEquals(actualText, "Demo eBook", "Error.");
        Tools.Bekle(3);

        allElements.PromotionButton.get(0).click();
        Tools.Bekle(3);

        allElements.AddPromoCode.get(0).sendKeys("TechnoStudy", Keys.ENTER);
        Tools.Bekle(2);

        String actualText2= allElements.WrongProcess.get(0).getText();
        Assert.assertEquals(actualText2, "Invalid promo code", "Error.");
    }

}
