package US3_OturumuKapatma_Feyza;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class oturumkapatma extends BaseDriver {
    @Test
    public void Test(){
        driver.get("https://www.akakce.com/");

        WebElement giris = driver.findElement(By.xpath("//a[@href='/akakcem/giris/']"));
        giris.click();

        WebElement mail = driver.findElement(By.xpath("//input[@id='life']"));
        mail.sendKeys("fey1@gmail.com");

        WebElement sifre = driver.findElement(By.xpath("//input[@id='lifp']"));
        sifre.sendKeys("1234567Fey");

        WebElement sub = driver.findElement(By.xpath("//input[@id='lfb']"));
        sub.click();



        WebElement hesap = driver.findElement(By.xpath("//a[@title='Hesabım']"));
        MyFunc.Bekle(2);
        hesap.click();

        //  WebElement hesapisim = driver.findElement(By.cssSelector("[rel='nofollow'][href='/akakcem/']"));
        // Actions aksiyonlar=new Actions(driver);
        // Action aksiyon= aksiyonlar.moveToElement(hesapisim).build();
        // aksiyon.perform();

        MyFunc.Bekle(2);

        WebElement cikis=driver.findElement(By.xpath("//a[@href='#Çık']"));
        cikis.click();

        Assert.assertTrue("Çıkış işlemi başarısız", driver.getCurrentUrl().equals("https://www.akakce.com/"));

        BekleVeKapat();}}
