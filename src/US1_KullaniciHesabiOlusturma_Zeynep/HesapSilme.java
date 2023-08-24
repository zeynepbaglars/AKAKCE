package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class HesapSilme extends BaseDriver {
    @Test
    public void Test4() {//hesap sil

       OturumAc();
       Bekleme(10);
       WebElement isim= driver.findElement(By.xpath("//a[text()='Ali']"));
       isim.click();
       Bekleme(2);
       WebElement hesabim = driver.findElement(By.cssSelector("//a[text()='Hesabım']"));
       hesabim.click();
       Bekleme(2);
       WebElement hesabiSil = driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
       hesabiSil.click();
       Bekleme(2);
       WebElement sifreGir = driver.findElement(By.cssSelector("[onfocusout='ControlPassword();']"));
       sifreGir.sendKeys("Ac.123456");
       WebElement hesapSil = driver.findElement(By.xpath("//*[text()='Hesabın silindi.']"));
       Assert.assertTrue("Hesap başarılı silinemedi.",hesapSil.getText().equalsIgnoreCase("Hesabın silindi."));

        BekleVeKapat();
    }
}
