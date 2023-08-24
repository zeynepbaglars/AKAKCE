package Utlity;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.logging.Level;
import java.util.logging.Logger;


public class BaseDriver {
    public static WebDriver driver; // SingletonDriver method

    static{
        Logger logger=Logger.getLogger("");
        logger.setLevel(Level.SEVERE);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    }

    public static void BekleVeKapat(){
        MyFunc.Bekle(5);
        driver.quit();
    }
    public static void Bekleme(int sn) {
        MyFunc.Bekle(sn);
    }
    public static void Giris() {

        driver.get("https://www.akakce.com/");

        WebElement girisYap=driver.findElement(By.cssSelector("[id='H_rl_v8'] :nth-child(2)"));
        girisYap.click();
        Bekleme(2);
        WebElement mailGir=driver.findElement(By.cssSelector("span[class='frm_v8'] input[type='email'][id='life']"));
        mailGir.sendKeys("zeynepbaglars@gmail.com");
        Bekleme(3);
        WebElement sifreGir=driver.findElement(By.cssSelector("form[action='/akakcem/nojs/'] [type='password'][id='lifp']"));
        sifreGir.sendKeys("Zey123456");
        Bekleme(1);
        WebElement GirisBtn=driver.findElement(By.xpath("(//*[@value='Giriş yap'])[1]"));
        GirisBtn.click();
        Bekleme(5);

    }


}


