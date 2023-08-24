package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OturumAcma_Negatif_1_EksikBilgi extends BaseDriver {
    @Test
    public void Test1(){
        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.cssSelector("[id='H_rl_v8'] :nth-child(2)"));
        girisYap.click();
        Bekleme(2);
        WebElement mailGir = driver.findElement(By.cssSelector("span[class='frm_v8'] input[type='email'][id='life']"));
        mailGir.sendKeys("asudebaykal123_Gecersiz@gmail.com");
        Bekleme(3);
        WebElement sifreGir = driver.findElement(By.cssSelector("form[action='/akakcem/nojs/'] [type='password'][id='lifp']"));
        sifreGir.sendKeys("Ac.123456_Gecersiz");
        Bekleme(1);
        WebElement GirisBtn = driver.findElement(By.xpath("(//*[@value='Giriş yap'])[1]"));
        GirisBtn.click();
        Bekleme(5);
        //[class='alertX t2'] p
        WebElement Alert = driver.findElement(By.cssSelector("[class='alertX t2'] p"));
        Bekleme(1);
        Assert.assertTrue("Boş veri ile giriş yapıldı",Alert.getText().equals("Böyle bir kullanıcı yok."));

        BekleVeKapat();
    }
}
