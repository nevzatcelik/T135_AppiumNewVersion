package pages;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

import javax.swing.plaf.PanelUI;

public class TeknosaPage {
    public TeknosaPage(){
        PageFactory.initElements(new AppiumFieldDecorator(Driver.getAndroidDriver()),this);
    }


    @FindBy(xpath = "//android.widget.TextView[@text=\"Atla\"]")
    public WebElement atlaButonu;

    @FindBy(xpath = "//*[@text='Filtrele']")
    public WebElement filtreleButonu;

    @FindBy(xpath = "//*[@text='Marka']")
    public WebElement markaButonu;

    @FindBy(xpath = "//*[@class='android.widget.EditText']")
    public WebElement markaAramaKutusu;

    @FindBy(xpath = "//*[@bounds='[86,766][131,811]']")
    public WebElement kutucukButonu;

    @FindBy(xpath = "//*[@text='Sonuçları Göster']")
    public WebElement sonuclariGosterButonu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[4]")
    public WebElement siralaButonu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[13]")
    public WebElement enPahaliFiyat;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[13]")
    public WebElement enUcuzCihazFiyati;

    @FindBy(xpath = "(//*[@class='android.widget.ImageView'])[7]")
    public WebElement enUcuzSamsungCihaz;
    //*[@bounds='[32,870][644,1512]']

    @FindBy(xpath = "//*[@text='+']")
    public WebElement artiButonu;

    @FindBy(xpath = "(//*[@class='android.widget.TextView'])[7]")
    public WebElement sepetimUrunFiyati;




    public void markaSecmeMethodu(String markaSecimi){
        markaButonu.click();
        markaAramaKutusu.sendKeys(markaSecimi);
        kutucukButonu.click();
        sonuclariGosterButonu.click();
    }
}
