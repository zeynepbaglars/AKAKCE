package US6_MesajKutusuKontrolu_Zeynep;

import Utlity.BaseDriver;
import org.junit.Test;

public class MessageBox extends BaseDriver {
    @Test
    public void Message(){
        driver.get("https://www.akakce.com/");
        ////div[@id='H_rl_v8']/a[@href='/akakcem/giris/']------giriş
        //e posta-----------//input[@id='life']
        ///password---------------//input[@id='lifp']
        ///(//div[@id="HM_v8"]//a)[1]---isme tıklama
        /////a[@href='/akakcem/mesajlarim/']---mesajlarım

        ////div[@class="wbb_v8"]/p---->Listelenecek mesaj bulunamadı. yazısı ]

        System.out.println("merhabalar");

    }
}


