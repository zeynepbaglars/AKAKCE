package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OturumKapatma extends BaseDriver {
    @Test
    public void Test(){
        OturumAc();
        WebElement isim= driver.findElement(By.cssSelector("i>[href='/akakcem/']"));
        hoverOver(isim);
        Bekleme(2);
        WebElement cikis=driver.findElement(By.cssSelector("a[href='#Çık']"));
        cikis.click();
        Bekleme(2);

        Assert.assertTrue("Başarılı çıkış yapılamadı.",driver.getCurrentUrl().equals("https://www.akakce.com/"));

        BekleVeKapat();

    }
}
