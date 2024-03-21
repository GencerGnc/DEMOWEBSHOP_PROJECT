package US_309;

import Utility.BaseDriver;
import Utility.Tools;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.Pdf;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class TC_309 extends BaseDriver {

    @Test
    public void Test() throws AWTException, IOException, UnsupportedFlavorException {
        TC_309_Element elements=new TC_309_Element();

        driver.get("https://www.e-junkie.com/wiki/demo/paypal");



        elements.addcart.click();
        driver.switchTo().frame(elements.iframe1);
        elements.CreditCard.click();

        elements.email.sendKeys("Gencer@gmail.com");
        elements.confirmEmail.sendKeys("Gencer@gmail.com");
        elements.NameCard.sendKeys("Gencer");
        elements.adress1.sendKeys("ankara");
        elements.adress2.sendKeys("ankara");
        elements.city.sendKeys("ankara");
        elements.Zip.sendKeys("010101");



        elements.inputCard.sendKeys("4242 4242 4242 4242");
        elements.date.sendKeys("1224");
        elements.ccvInput.sendKeys("000");
        elements.payButton.click();

        Tools.Bekle(10);

        elements.download.click();
        Tools.Bekle(3);
        String filePath = "C:/Users/Gencer/Downloads/demo.pdf";


        //To open and show the downloaded pdf
        try {
            Desktop.getDesktop().open(new File(filePath));
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Checking the content of the PDF file
        PDDocument document = PDDocument.load(new File(filePath));//It allows you to perform various operations
        // on PDF documents,
        // such as opening, reading, editing or extracting text from the document.

        PDFTextStripper pdfStripper = new PDFTextStripper();//Extract text from PDF file and print to screen

        String pdfText = pdfStripper.getText(document);//To extract all text from a
        // PDF document and print it to the console,
        // extract text from the document to perform a search operation,
        // or save the extracted text to a database

        String searchText = "Gencer";
        //to search for the desired text
        if (pdfText.contains(searchText)) {
            System.out.println("The searched text in the PDF was found..");
        } else {
            System.out.println("The searched text in the PDF was not found..");
        }


    }


}
