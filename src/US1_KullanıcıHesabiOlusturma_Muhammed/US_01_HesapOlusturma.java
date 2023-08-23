package US1_KullanıcıHesabiOlusturma_Muhammed;

import Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class US_01_HesapOlusturma extends BaseDriver {
    @Test
    public void US_0101(){
        driver.get("https://www.akakce.com/");

        WebElement hesapAc= driver.findElement(By.xpath("//div[@id='H_rl_v8']/a[1]"));
        hesapAc.click();





    }

}
