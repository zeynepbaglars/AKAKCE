package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class KayitOlma_Pozitif extends BaseDriver {
    @Test
    public void Test1() {//KAYIT OLMA
        driver.get("https://www.akakce.com/");

        WebElement hesapAc = driver.findElement(By.cssSelector("[id='H_rl_v8'] [href='/akakcem/giris/?m=1&s=1']"));//hesap aça tıklandı
        hesapAc.click();
        Bekleme(1);
        WebElement ad = driver.findElement(By.cssSelector("[id='rnufn'][name='rnufn']"));//isim bilgisi bgirildi
        ad.sendKeys("Ali");
        Bekleme(1);
        WebElement soyad = driver.findElement(By.cssSelector("[id='rnufs'][name='rnufs']"));//soyisimisim bilgisi bgirildi
        soyad.sendKeys("Cabbar");
        Bekleme(1);
        WebElement email = driver.findElement(By.cssSelector("[id='rnufe1'][name='rnufe1']"));//mail girildi
        email.sendKeys("asudebaykal123@gmail.com");
        Bekleme(1);
        WebElement emailTekrar = driver.findElement(By.cssSelector("[id='rnufe2'][name='rnufe2']"));//mail tekrar girildi
        emailTekrar.sendKeys("asudebaykal123@gmail.com");
        Bekleme(1);
        WebElement sifre = driver.findElement(By.cssSelector("[id='rnufp1'][name='rnufp1']"));//sifre girildi
        sifre.sendKeys("Ac.123456");
        Bekleme(1);
        WebElement sifreTekrar = driver.findElement(By.cssSelector("[id='rnufp2'][name='rnufp2']"));//sifre tekrar girildi
        sifreTekrar.sendKeys("Ac.123456");
        Bekleme(1);
        WebElement cinsiyet = driver.findElement(By.cssSelector("[name='rngc'][type='radio']"));//cinsiyet seçildi
        cinsiyet.click();
        Bekleme(1);
        WebElement iller = driver.findElement(By.cssSelector("select[id='locpr']"));//iller seç

        Select il = new Select(iller);
        il.selectByVisibleText("Ankara");
        Bekleme(1);
        WebElement ilceler = driver.findElement(By.cssSelector("select[id='locds']"));//ilce seç
        Select ilce = new Select(ilceler);
        ilce.selectByVisibleText("Çankaya");
        Bekleme(1);
        WebElement gunler = driver.findElement(By.cssSelector("[class='select_h_v8'] select[id='bd']"));// doğum günü
        Select gun = new Select(gunler);
        gun.selectByVisibleText("1");
        Bekleme(1);
        WebElement aylar = driver.findElement(By.cssSelector("[class='frm_v8 inl_v8'] select[id='bm']"));//doğum ayı seçimi
        Select ay = new Select(aylar);
        ay.selectByVisibleText("1");
        Bekleme(1);
        WebElement yillar = driver.findElement(By.cssSelector("[class='frm_v8 inl_v8'] select[id='by']"));//yil seçimi
        yillar.click();
        WebElement yil = driver.findElement(By.cssSelector("select[id='by'] option[value='1990']"));//yil seçimi
        yil.click();
        Bekleme(1);
        WebElement kullanimOnay = driver.findElement(By.cssSelector("[type='checkbox'][id='rnufpca']"));//kullanım sözleşnmesi onay
        kullanimOnay.click();
        Bekleme(1);
        WebElement kampanyaBildiriminiActim = driver.findElement(By.cssSelector("[type='checkbox'][id='rnufnee']"));//Kampanya bildirimini açtım içimden geldi
        kampanyaBildiriminiActim.click();
        Bekleme(1);

        WebElement giris = driver.findElement(By.cssSelector("[value='Hesap aç'][type='submit']"));//Girişe tıkladım
        giris.click();
        Bekleme(1);
        Assert.assertTrue("Kayıy yapma başarısız",driver.getCurrentUrl().equals("https://www.akakce.com/"));

        System.out.println(driver.getCurrentUrl());

        Bekleme(6);

        BekleVeKapat();

    }
}
