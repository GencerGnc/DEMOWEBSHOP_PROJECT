package US_305;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_305 extends BaseDriver {
    @Test
    public void Tc_305() {
        TC305_306_Elements elements = new TC305_306_Elements();
        UrlOpen();

        elements.addcart.click();

        Tools.Bekle(3);
        driver.switchTo().frame(elements.iframeodeme);
        Tools.Bekle(1);
        elements.creditCard.click();
        Tools.Bekle(3);


        elements.mail.sendKeys("gencer@gmail.com");
        elements.confirmail.sendKeys("gencer@gmail.com");
        elements.nameOncard.sendKeys("gencer genc");


        driver.switchTo().frame(2);

        elements.credtCardInput.sendKeys("4242 4242 4242 4242");
        elements.experidationDay.sendKeys("1224");
        elements.ccv.sendKeys("000");

        driver.switchTo().parentFrame();

        elements.payclick.click();
        wait.until(ExpectedConditions.urlContains("gencer"));
        Tools.Bekle(3);
        elements.downlandbtn.click();


        Assert.assertTrue(elements.downlandbtn.isDisplayed());
        if (elements.downlandbtn.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAIL");


        driver.quit();

    }
}

