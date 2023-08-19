package US5_SiparisListesiKontrolü_Ferit;

import Utlity.BaseDriver;
import Utlity.MyFunc;
import driver.B_Driver;
import driver.Func;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.junit.Test;

import static Utlity.BaseDriver.driver;

public class order_ctrl extends BaseDriver {
@Test
    public void Test() {
        driver.get("https://www.akakce.com/");
        MyFunc.Bekle(1);


        //Giris butonuna tikla.
         clicklog = driver.findElement(By.xpath("//*[@id=\"H_rl_v8\"]/a[2]"));
        clicklog.click();

         MyFunc.Bekle(1);
        //E-mail'i yaz.
        WebElement email = driver.findElement(By.xpath("//*[@id=\"life\"]"));
        email.sendKeys("fd@gmail.com");

        Func.Bekle(1);
        //sifreni yaz.
        WebElement password = driver.findElement(By.xpath("//*[@id=\"lifp\"]"));
        password.sendKeys("ABC123abc");

        Func.Bekle(1);
        //oturum acma tuşuna tikla.
        WebElement buttonlog = driver.findElement(By.xpath("//*[@id=\"lfb\"]"));
        buttonlog.click();

        Func.Bekle(1);

        //sağ üst kullanici ismine tikla.(altinda 'siparislerim' yazan bir tus cıkacak.)
        WebElement m = driver.findElement(By.xpath("//*[@id=\"HM_v8\"]/i/a"));
        m.click();

        Func.Bekle(2);
        //'siparislerim'e tikla.
        WebElement orders = driver.findElement(By.xpath("//*[@id=\"AL\"]/li[1]/a[1]"));
        orders.click();
        Func.Bekle(2);

        //siparis varligi denetimi
        WebElement orderctrl = driver.findElement(By.xpath("//*[@id=\"user-order-info\"]/div"));
        if (orderctrl.equals("")) {
            System.out.println("siparis yok");
        } else System.out.println("siparis var");


    }
}
