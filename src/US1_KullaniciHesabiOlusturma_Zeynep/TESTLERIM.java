package US1_KullaniciHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class TESTLERIM {

    public class TC_0101P extends BaseDriver {
        @Test
        public void Test1() {
            driver.get("https://www.akakce.com/");

            WebElement hesapAc = driver.findElement(By.cssSelector("[id='H_rl_v8'] [href='/akakcem/giris/?m=1&s=1']"));//hesap aça tıklandı
            hesapAc.click();
            Bekleme(1);
            WebElement ad = driver.findElement(By.cssSelector("[id='rnufn'][name='rnufn']"));//isim bilgisi bgirildi
            ad.sendKeys("TestUser");
            Bekleme(1);
            WebElement soyad = driver.findElement(By.cssSelector("[id='rnufs'][name='rnufs']"));//soyisimisim bilgisi bgirildi
            soyad.sendKeys("Tester");
            Bekleme(1);
            WebElement email = driver.findElement(By.cssSelector("[id='rnufe1'][name='rnufe1']"));//mail girildi
            email.sendKeys("testuser@example.com");
            Bekleme(1);
            WebElement emailTekrar = driver.findElement(By.cssSelector("[id='rnufe2'][name='rnufe2']"));//mail tekrar girildi
            emailTekrar.sendKeys("testuser@example.com");
            Bekleme(1);
            WebElement sifre = driver.findElement(By.cssSelector("[id='rnufp1'][name='rnufp1']"));//sifre girildi
            sifre.sendKeys("Password123");
            Bekleme(1);
            WebElement sifreTekrar = driver.findElement(By.cssSelector("[id='rnufp2'][name='rnufp2']"));//sifre tekrar girildi
            sifreTekrar.sendKeys("Password123");
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
            Bekleme(6);

            BekleVeKapat();

        }

        @Test
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

        @Test
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

        @Test
        public void Test4() {
            Giris();
            WebElement logo = driver.findElement(By.cssSelector("[id='H_a_v8']"));
            logo.click();
            Bekleme(2);
            WebElement hesabim = driver.findElement(By.cssSelector("//*[text()='Hesabım']"));
            logo.click();
            Bekleme(2);
            WebElement hesabiSil = driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
            logo.click();
            Bekleme(2);


//FAKE MAİL AÇTIM!!!!!
//      Ac.123456        // ŞİFRE
//  asudebaykal123@gmail.com       //MAİL


        }

    }
}