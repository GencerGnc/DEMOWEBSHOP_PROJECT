package US_303;

import Utility.BaseDriver;
import Utility.Tools;
import org.testng.annotations.Test;

public class TC_303 extends BaseDriver {


    @Test
    public void Tc_303(){
        TC303_304_ELEMENTS elements1=new TC303_304_ELEMENTS();
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
//        driver.switchTo().defaultContent();
        driver.switchTo().frame(elements1.iframeCreditCar);
        elements1.credtCardInput.sendKeys("1111 1111 1111 1111");
        elements1.payclick.click();








    }
}
