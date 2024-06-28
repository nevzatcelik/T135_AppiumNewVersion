package stepdefinitions;

import io.cucumber.java.en.Given;
import org.junit.Assert;
import org.openqa.selenium.support.PageFactory;
import pages.TeknosaPage;
import utils.Driver;
import utils.ReusableMethods;

public class TeknosaStepDefinitions {
    TeknosaPage page=new TeknosaPage();
    @Given("kullanici uygulamayi yukler")
    public void kullanici_uygulamayi_yukler() {
        Driver.getAndroidDriver();
    }

    @Given("Uygulama baslatilir")
    public void uygulama_baslatilir() {
        Driver.getAndroidDriver();
    }
    @Given("Ilk ekran bolumunden atlaya tiklanir")
    public void ılk_ekran_bolumunden_atlaya_tiklanir() throws InterruptedException {
       page.atlaButonu.click();
       Thread.sleep(2000);
    }
    @Given("footer bolumundeki {string} butonuna tiklanir")
    public void kategoriler_bolumune_tiklanir(String footerSecenek) {
        ReusableMethods.scrollWithUiScrollableAndClick(footerSecenek);

    }
    @Given("kategoriler bolumunden {string} bolumune tiklanir")
    public void kategoriler_bolumunden_telefon_bolumune_tiklanir(String kategorilerSecim) {
     ReusableMethods.scrollWithUiScrollableAndClick(kategorilerSecim);
    }
    @Given("telefon sayfasindan cihaz secimi {string} yapilir")
    public void telefon_sayfasindan_cihaz_secimi_yapilir(String cihazSecimi) {
    ReusableMethods.scrollWithUiScrollableAndClick(cihazSecimi);
    }
    @Given("filtrele bolumune tiklanir")
    public void filtrele_bolumune_tiklanir() {
      page.filtreleButonu.click();
    }
    @Given("Marka bolumunden marka secimi {string} yapilir")
    public void marka_bolumunden_marka_secimi_yapilir(String markaSecimi) {
     page.markaSecmeMethodu(markaSecimi);
    }
    @Given("siralama yapilirak {string} secilir")
    public void siralama_yapilirak_azalan_fiyat_secilir(String siralamaSecenegi) throws InterruptedException {
      Thread.sleep(1500);
        page.siralaButonu.click();
      ReusableMethods.scrollWithUiScrollableAndClick(siralamaSecenegi);
    }
    @Given("fiyatlarin azalan duzende oldugu test edilir")
    public void fiyatlarin_azalan_duzende_oldugu_test_edilir() throws InterruptedException {
         String enpahaloFiyat=page.enPahaliFiyat.getText();
         enpahaloFiyat=enpahaloFiyat.replaceAll("\\D","");
         System.out.println(enpahaloFiyat);
         Thread.sleep(2000);
         ReusableMethods.dikeyKaydirma(Driver.getAndroidDriver(),0.80,0.20,0.50,400);
         String enUcuzFiyat=page.enUcuzCihazFiyati.getText();
         enUcuzFiyat=enpahaloFiyat.replaceAll("\\D","");
         System.out.println(enUcuzFiyat);
         Assert.assertTrue(Integer.parseInt(enpahaloFiyat)>Integer.parseInt(enUcuzFiyat));



    }

}
