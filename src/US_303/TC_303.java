package US_303;

import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;

public class TC_303 extends BaseDriver {


    @Test
    public void Tc_303()  {
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




        driver.switchTo().frame(2);

        elements1.credtCardInput.sendKeys("1111 1111 1111 1111");

        driver.switchTo().parentFrame();

        elements1.payclick.click();

        if (elements1.snackBar.isDisplayed()){
            System.out.println("TEST PASSED");
        }else System.out.println("TEST FAIL");






    }
}
