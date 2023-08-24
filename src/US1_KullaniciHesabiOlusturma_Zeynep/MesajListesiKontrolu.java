package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MesajListesiKontrolu extends BaseDriver {
    @Test
    public void Test01(){
        OturumAc();
        WebElement girisYap2 = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYap2.click();
        Bekleme(2);

        WebElement hesabim= driver.findElement(By.xpath("//a[text()='Ali']"));
        hesabim.click();
        Bekleme(2);

        WebElement mesajlarim= driver.findElement(By.xpath("//a[text()='Mesajlarım']"));
        mesajlarim.click();
        Bekleme(2);

        WebElement mesaj= driver.findElement(By.xpath("//div[@class='wbb_v8']/p"));

        Assert.assertTrue("Test Başarısız..",mesaj.getText().contains("Listelenecek mesaj bulunamadı."));




        BekleVeKapat();
    }
}


