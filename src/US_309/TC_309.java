package US_309;

import US_303.TC303_304_ELEMENTS;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_309 extends BaseDriver {
    @Test
    public void Tc_304() {
        TC303_304_ELEMENTS elements1 = new TC303_304_ELEMENTS();
        UrlOpen();

        elements1.addcart.click();

        Tools.Bekle(3);
        driver.switchTo().frame(elements1.iframeodeme);
        Tools.Bekle(1);
        elements1.creditCard.click();
        Tools.Bekle(3);


        elements1.mail.sendKeys("gencer@gmail.com");
        elements1.confirmail.sendKeys("gencer@gmail.com");
        elements1.nameOncard.sendKeys("gencer genc");


        driver.switchTo().frame(2);

        elements1.credtCardInput.sendKeys("4242 4242 4242 4242");
        elements1.experidationDay.sendKeys("1224");
        elements1.ccv.sendKeys("000");

        driver.switchTo().parentFrame();

        elements1.payclick.click();

        wait.until(ExpectedConditions.urlContains("gencer"));


        elements1.download.click();

        Assert.assertTrue(elements1.download.isEnabled());


        if (elements1.download.isEnabled()) {
            System.out.println("TEST PASSED");
        } else System.out.println("TEST FAIL");


    }
}