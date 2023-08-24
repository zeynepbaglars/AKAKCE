package US2_HesapDogrulamaKontrolu_Salih;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class IlkGunum extends BaseDriver {
    @Test
    public void hesapDogrulama(){

        driver=new ChromeDriver();
        driver.get("https://www.akakce.com"); //rngf
        MyFunc.Bekle(1);

        WebElement HesapAc=driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[1]"));
        HesapAc.click();
        MyFunc.Bekle(2);

        WebElement isim=driver.findElement(By.xpath("//input[@id='rnufn']"));
        isim.sendKeys("testuser123");
        MyFunc.Bekle(2);

        WebElement soyisim=driver.findElement(By.xpath("//input[@id='rnufs']"));
        soyisim.sendKeys("Tester");
        MyFunc.Bekle(2);

        WebElement eMail=driver.findElement(By.xpath("//input[@id='rnufe1']"));
        eMail.sendKeys("testuser@example.com");
        MyFunc.Bekle(2);

        WebElement eMailTekrar=driver.findElement(By.xpath("//input[@id='rnufe2']"));
        eMailTekrar.sendKeys("testuser@example.com");
        MyFunc.Bekle(2);

        WebElement sifre=driver.findElement(By.xpath("//input[@id='rnufp1']"));
        sifre.sendKeys("Password123");
        MyFunc.Bekle(2);

        WebElement sifreTekrar=driver.findElement(By.xpath("//input[@id='rnufp2']"));
        sifreTekrar.sendKeys("Password123");
        MyFunc.Bekle(2);

        WebElement gender=driver.findElement(By.xpath("//input[@id='rngf']"));
        gender.click();
        MyFunc.Bekle(2);

        WebElement day=driver.findElement(By.xpath("//select[@id='bd']"));
        day.sendKeys("1");
        MyFunc.Bekle(2);

       WebElement month=driver.findElement(By.xpath("//select[@id='bm']"));
       month.sendKeys("1");
       MyFunc.Bekle(2);

       WebElement year=driver.findElement(By.xpath("//select[@id='by']"));
       year.sendKeys("1990");
       MyFunc.Bekle(2);

        WebElement create=driver.findElement(By.xpath("//input[@id='rfb']"));
        create.click();
        MyFunc.Bekle(2);






    }

}
