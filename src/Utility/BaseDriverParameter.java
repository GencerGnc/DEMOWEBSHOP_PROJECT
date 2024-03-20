package Utility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import java.time.Duration;

public class BaseDriverParameter {
    public   WebDriver driver;        // paralelde çalışması için statici kaldıraca kim çağırırsa onun olsun diycez
    public   WebDriverWait wait;
    @BeforeClass
    @Parameters("browserType")
    public void BaslangicIslemleri (String browserType){

        switch (browserType.toLowerCase()){
            case "chrome":driver=new ChromeDriver();break;
            case "firefox":driver=new FirefoxDriver();break;
            case "edge":driver=new EdgeDriver();break;
        }



        driver.manage().window().maximize();//ekranı max yapar
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));// 20 sn mühlet: sayfayı yükleme mühlet
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));//20 sn mühlet: elementi bulma mühleti
        wait=new WebDriverWait(driver,Duration.ofSeconds(20));



    }



    @AfterClass
    public void KapanisIslemleri(){
        System.out.println("kapanış işlemleri yapılıyor");//bekle kapat

        Tools.Bekle(3);
        driver.quit();
    }


}
