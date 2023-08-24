package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class OturumAcma extends BaseDriver {

    @Test//giriş yap
    public void Test3() {
        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.cssSelector("[id='H_rl_v8'] :nth-child(2)"));
        girisYap.click();
        Bekleme(2);
        WebElement mailGir = driver.findElement(By.cssSelector("span[class='frm_v8'] input[type='email'][id='life']"));
        mailGir.sendKeys("asudebaykal123@gmail.com");
        Bekleme(3);
        WebElement sifreGir = driver.findElement(By.cssSelector("form[action='/akakcem/nojs/'] [type='password'][id='lifp']"));
        sifreGir.sendKeys("Ac.123456");
        Bekleme(1);
        WebElement GirisBtn = driver.findElement(By.xpath("(//*[@value='Giriş yap'])[1]"));
        GirisBtn.click();
        Bekleme(5);

        BekleVeKapat();


    }
}
