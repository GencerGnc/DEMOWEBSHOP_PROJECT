package US_308;

import US_307.TC307_308_Elements;
import Utility.BaseDriver;
import Utility.Tools;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;

public class TC_308 extends BaseDriver {
    /*Objective: Access to Information Video.
    Test Case:
    Find the "See How it works" button on https://www.e-junkie.com/ home page.
    Verify that URL is "https://www.e-junkie.com/".
    Start to play the video in the YouTube window that opens.
    Turn off the window after 10 sec.*/
    @Test
    public void TC_308() throws AWTException {
        
        TC307_308_Elements elements = new TC307_308_Elements();

        UrlOpen();

        elements.EcommerceByJunkieLink.click();

        elements.EcommerceByJunkieLogo.click();

        Tools.Bekle(1);

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.e-junkie.com/"), "Test failed");

        Tools.Bekle(1);

        elements.SeehowItWorksButton.click();

        Tools.Bekle(1);

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.e-junkie.com/"), "Test failed");

        Tools.Bekle(1);

        Robot robot = new Robot();

        robot.mouseMove(900, 600);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

        /*Tools.Bekle(3);

        robot.mouseMove(1400, 600);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);*/

        Tools.Bekle(10);

        elements.CloseButton.click();
    }
}
