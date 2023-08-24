package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class SiparisListesiKontrolu extends BaseDriver {
    @Test
    public void Test(){
        OturumAc();
        WebElement isim= driver.findElement(By.cssSelector("i>[href='/akakcem/']"));
        isim.click();
        Bekleme(2);

        WebElement siparislerim= driver.findElement(By.cssSelector("a[href='/akakcem/siparislerim/']"));
        siparislerim.click();
        Bekleme(2);

        WebElement siparisKontrolu= driver.findElement(By.cssSelector("div[class='no-record']"));
        Bekleme(5);
        Assert.assertTrue("Siparis kontrolü başarıyla yapılamadı.",siparisKontrolu.getText().equals("Kayıtlı siparişiniz bulunmuyor."));

        BekleVeKapat();
    }



}
