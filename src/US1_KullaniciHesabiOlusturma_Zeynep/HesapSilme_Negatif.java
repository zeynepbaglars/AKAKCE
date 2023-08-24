package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class HesapSilme_Negatif extends BaseDriver {
    @Test
    public void Test1() {

        OturumAc();
        Bekleme(10);
        WebElement isim= driver.findElement(By.cssSelector("i>[href='/akakcem/']"));
        isim.click();
        Bekleme(2);
        WebElement hesabiSil = driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        hesabiSil.click();




        Bekleme(2);
        WebElement sifreGir = driver.findElement(By.cssSelector("[onfocusout='ControlPassword();']"));
        sifreGir.sendKeys("HataliSifre.1");
        WebElement btn = driver.findElement(By.cssSelector("[class='s save button']"));
        btn.click();
        Bekleme(3);
        WebElement hesapSil = driver.findElement(By.xpath("//p[text()='Mevcut şifrenizi doğru girdiğinizden emin olun.']"));
        Bekleme(5);
        Assert.assertTrue("Hesap başarılı silinemedi.",hesapSil.getText().equalsIgnoreCase("Mevcut şifrenizi doğru girdiğinizden emin olun."));

        BekleVeKapat();

    }


}


