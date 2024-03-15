package Utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class BaseDriver {
    public  static WebDriver driver;
    public  static WebDriverWait wait;
    @BeforeClass
    public void BaslangicIslemleri (){


        driver = new ChromeDriver();
        driver.manage().window().maximize();//ekranı max yapar
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20 sn mühlet: elementi bulma mühleti
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));



    }

    public void UrlOpen(){
        System.out.println("Siteye girildi");
        driver.get("https://shopdemo.e-junkie.com/");

    }


    @AfterClass
    public void KapanisIslemleri(){
        System.out.println("kapanış işlemleri yapılıyor");//bekle kapat

        Tools.Bekle(3);

    }


}
