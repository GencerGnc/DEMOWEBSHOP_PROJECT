package US_302;

import US_301.TC301_302_Elements;
import Utility.BaseDriver;
import Utility.Tools;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TC_302 extends BaseDriver {
    @Test
    public void TC_302() {
        TC301_302_Elements allElements = new TC301_302_Elements();

// Step 1: Access the e-junkie demo site.
        driver.get("https://shopdemo.e-junkie.com/");

// Step 2: Find and click the "Add Demo E-Book to Cart" button.
        allElements.eBookAdd.get(0).click();
        driver.switchTo().frame(allElements.SwitchIframe.get(0));
// Step 3: Verify that the demo e-book is successfully added to the basket.
        String actualText = allElements.addToCartControl.get(0).getText();
        Assert.assertEquals(actualText, "Demo eBook", "Error.");
// Step 4: Find the "Pay Using Debit Card" option and click on the basket page.
        allElements.PayUsingCC.get(0).click();
// Step 5: On the payment page, ensure there are fields to enter email, name, and debit card information (card number, expiration date, CVC).
        if (allElements.EnsureEmail.get(0).isDisplayed()) {
            System.out.println("The item appears in status on the page.");
        } else {
            System.out.println("Element is not visible on the page.");
        }
        Tools.Bekle(2);
        if (allElements.EnsureNameOnCard.get(0).isDisplayed()) {
            System.out.println("The item appears in status on the page.");
        } else {
            System.out.println("Element is not visible on the page.");
        }
        Tools.Bekle(2);
        if (allElements.EnsureCartDetails.get(0).isDisplayed()) {
            System.out.println("The item appears in status on the page.");
        } else {
            System.out.println("Element is not visible on the page.");
        }

        Tools.Bekle(2);

// Step 6: Leave the e-mail address and other required fields blank on the payment page.
// Step 7: Click the "Pay" button to attempt completing the payment process.
        allElements.payButton.get(0).click();

        String actualResult= allElements.WrongProcess.get(0).getText();
        System.out.println("actualResult = " + actualResult);
// Step 8: Verify that during the payment process, "Invalid email" and "Invalid Billing Name" errors are displayed at the same time.
        Assert.assertEquals(actualResult,
                "Invalid Email\n" +
                "Invalid Email\n" +
                "Invalid Billing Name",
                "Not Found");
    }
}
