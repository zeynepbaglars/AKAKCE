package US1_KullanıcıHesabiOlusturma_Zeynep;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.Base64;

public class TC_0702 extends BaseDriver {
    @Test
    public void Test1() {
        Giris();
        WebElement logo=driver.findElement(By.cssSelector("[id='H_a_v8']"));
        logo.click();
        Bekleme(2);
        WebElement hesabim=driver.findElement(By.cssSelector("//*[text()='Hesabım']"));
        logo.click();
        Bekleme(2);
        WebElement hesabiSil=driver.findElement(By.cssSelector("[href='/akakcem/kullanici-bilgilerim/uyelik-iptali/']"));
        logo.click();
        Bekleme(2);




//FAKE MAİL AÇTIM!!!!!
//      Ac.123456        // ŞİFRE
//  asudebaykal123@gmail.com       //MAİL



    }
}
