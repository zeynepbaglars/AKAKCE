package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class KayitOlma_Negatif extends BaseDriver {
    @Test// hatalı kayıt olma negatif
    public void Test2() {
        driver.get("https://www.akakce.com/");

        WebElement hesapAc = driver.findElement(By.cssSelector("[id='H_rl_v8'] [href='/akakcem/giris/?m=1&s=1']"));//hesap aça tıklandı
        hesapAc.click();
        Bekleme(1);


        WebElement email = driver.findElement(By.cssSelector("[id='rnufe1'][name='rnufe1']"));//mail girildi
        email.sendKeys("testuser@example.com");
        Bekleme(2);

        WebElement emailTekrar = driver.findElement(By.cssSelector("[id='rnufe2'][name='rnufe2']"));//mail tekrar girildi
        emailTekrar.sendKeys("testuser@example.com");
        Bekleme(2);

        WebElement sifre = driver.findElement(By.cssSelector("[id='rnufp1'][name='rnufp1']"));//sifre girildi
        sifre.sendKeys("Password123");
        Bekleme(2);

        WebElement sifreTekrar = driver.findElement(By.cssSelector("[id='rnufp2'][name='rnufp2']"));//sifre tekrar girildi
        sifreTekrar.sendKeys("Password123");
        Bekleme(3);

        WebElement kullanimOnay = driver.findElement(By.cssSelector("[type='checkbox'][id='rnufpca']"));//kullanım sözleşnmesi onay
        kullanimOnay.click();
        Bekleme(1);
        WebElement giris = driver.findElement(By.cssSelector("[value='Hesap aç'][type='submit']"));//Girişe tıkladım
        giris.click();

        WebElement alert = driver.findElement(By.cssSelector("[class='alertX t2']"));
        Assert.assertTrue("Hatalı veya eksik bilgiyle hesap açıldı", alert.getText().equals("Lütfen adınızı yazın"));
        BekleVeKapat();


    }
}
