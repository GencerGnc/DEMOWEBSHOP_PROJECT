package US_306;

import US_305.TC305_306_Elements;
import Utility.BaseDriver;
import Utility.Tools;
import org.testng.annotations.Test;

public class TC_306 extends BaseDriver {
    @Test
    public void Tc_306() {
        TC305_306_Elements cm = new TC305_306_Elements();
        UrlOpen();
        cm.contact.click();
        Tools.Bekle(3);
        cm.name.sendKeys("Özgür");
        cm.email.sendKeys("Ozgur@gmail.com");
        cm.subject.sendKeys("Test101");
        cm.message.sendKeys("The message area is here. ");
        cm.sbmtbtn.click();


    }

}
