package US6_MesajKutusuKontrolu_Muhammed;

import Utlity.BaseDriver;
import junit.framework.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MessageBox extends BaseDriver {
    @Test
    public void Test01(){
        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[2]"));
        girisYap.click();
        Bekleme(2);

        WebElement eposta = driver.findElement(By.xpath("//input[@id='life']"));
        eposta.sendKeys("muhammedaliozata@gmail.com");
        Bekleme(2);

        WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("1234567Abc");  // Şifre Eşleşmiyor ????
        Bekleme(2);

        WebElement girisYap2 = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYap2.click();
        Bekleme(2);

        WebElement hesabim= driver.findElement(By.xpath("//a[text()='Muhammed Ali']"));
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


