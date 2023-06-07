package tests.berke_US_031_035_036_040;

import org.testng.annotations.Test;

public class US_036 {

    @Test
    public void TC_01(){

        //1. Webdriver çalıştırılarak "https://qa.tripandway.com/admin" sayfasına gidilir ve admin hesap bilgileri ile giriş yapılır
        //2. Admin ana sayfasında sol panelde bulunan listede "Subscribers" a tıklanır ve açılan drop down menüde "Send Email to Subscribers" butonuna tıklanır
        //3. Açılan sayfada ilgili tüm alanları doldurulur ve ardından sayfanın alt kısmında bulunan "Submit" butonuna tıklanır
        //4. Gönderme işleminin ardından sağ üstte çıkan alert yardımı ile mail gönderme işleminin gerçeleştiği doğrulanır
    }
}
