package US_307;

import Utility.BaseDriver;
import Utility.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TC_307 extends BaseDriver {
    /*Acceptance Criteria:
    Find the "E-Commerce By E-Junkie" link on homepage and click.
    Click the e-junkie logo at the top left on the opened page.
    Verify that URL is " ".*/
    @Test
    public void TC_307() {
        
        TC307_308_Elements elements = new TC307_308_Elements();

        UrlOpen();

        elements.EcommerceByJunkieLink.click();

        Tools.Bekle(1);

        elements.EcommerceByJunkieLogo.click();

        Tools.Bekle(2);

        System.out.println(driver.getCurrentUrl());

        Assert.assertTrue(driver.getCurrentUrl().equals("https://www.e-junkie.com/"), "Test failed");
    }
}
