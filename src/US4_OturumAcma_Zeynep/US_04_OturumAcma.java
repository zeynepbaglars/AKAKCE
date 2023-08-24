package US4_OturumAcma_Zeynep;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_04_OturumAcma extends BaseDriver {
    @Test
    public void US_0401() {
        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[2]"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement eposta = driver.findElement(By.xpath("//input[@id='life']"));
        eposta.sendKeys("testuser@example.com");
        MyFunc.Bekle(2);

        WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("Password123");  // Şifre Eşleşmiyor ????
        MyFunc.Bekle(2);

        WebElement girisYap2 = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYap2.click();
        MyFunc.Bekle(2);

        BekleVeKapat();
    }

    @Test
    public void US_0402() {
        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[2]"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement eposta = driver.findElement(By.xpath("//input[@id='life']"));
        eposta.sendKeys("testuser@example.com");
        MyFunc.Bekle(2);

        WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("sifre123");  // Şifre Eşleşmiyor ????
        MyFunc.Bekle(2);

        WebElement girisYap2 = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYap2.click();
        MyFunc.Bekle(2);

        WebElement msg= driver.findElement(By.xpath("//div[@class='alertX t2']/p"));

        Assert.assertTrue("Test Başarısız",msg.getText().contains("Şifre doğru değil. Lütfen kontrol edip yeniden deneyin."));

        BekleVeKapat();
    }

    @Test
    public void US_0403() {
        driver.get("https://www.akakce.com/");

        WebElement girisYap = driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[2]"));
        girisYap.click();
        MyFunc.Bekle(2);

        WebElement girisYap2 = driver.findElement(By.xpath("//input[@id='lfb']"));
        girisYap2.click();
        MyFunc.Bekle(2);

        WebElement msg = driver.findElement(By.xpath("//div[@class='alertX t2']"));

        Assert.assertTrue("Test Başarısız", msg.isDisplayed());


        BekleVeKapat();

    }
}
