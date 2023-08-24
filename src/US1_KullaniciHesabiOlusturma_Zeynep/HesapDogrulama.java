package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

//i>[href='/akakcem/']
public class HesapDogrulama extends BaseDriver {
    @Test
    public void Test(){
        OturumAc();
        WebElement isim= driver.findElement(By.cssSelector("i>[href='/akakcem/']"));
        Assert.assertTrue("Başarrılı kayıt yapılamadı.",isim.getText().equals("Ali"));



        System.out.println(driver.getCurrentUrl());

        Bekleme(10);
    }
}
