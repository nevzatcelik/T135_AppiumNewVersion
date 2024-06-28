package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Driver {

    private static AndroidDriver appiumDriver;
    private static IOSDriver iosDriver;

    static final String TELEFONADI="Pixel 4";
    static final String ANDROIDVERSION="11.0";
    static final String PLATFORM="Android";
    static final String OTOMASYON_ISMI="UiAutomator2";



    public static AndroidDriver getAndroidDriver()  {
        URL appiumServerURL = null;
        try {
            appiumServerURL = new URL("http:127.0.0.1:4723/wd/hub");
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

        if (appiumDriver == null) {

            DesiredCapabilities caps =new DesiredCapabilities();
            caps.setCapability(MobileCapabilityType.UDID,"8ec2222704379e34");
            caps.setCapability("appPackage",ConfigReader.getProperty("aileButcemPackage"));
            caps.setCapability("appActivity",ConfigReader.getProperty("aileButcemActivity"));
            caps.setCapability(MobileCapabilityType.NO_RESET,false);
            /* eger bu capability FALSE olarak kullanilirsa,uygulama test edildikten sonra her seferinde kullanici datalari temizlenir ve
            uygulamanin ilk install haline dondurulur
             */
            // eger true olursa kullanicili bilgileri test bittikten sonra sifirlanmaz ve tercihler kaydedilir.Islemlere kaldiginiz yerden devam edilir


            if (ConfigReader.getProperty("platformName").equals("Android")) {

                assert appiumServerURL != null;
                appiumDriver = new AndroidDriver(appiumServerURL,caps);
                appiumDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            }else {

                assert appiumServerURL != null;
                iosDriver = new IOSDriver(appiumServerURL,caps);
                iosDriver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

                throw new UnsupportedOperationException("Dostum Ios kullanmaya calisiyorsun YAPMA!!");

            }

        }

        return appiumDriver;
    }


    public static void quitAppiumDriver(){
        if (appiumDriver != null) {
            appiumDriver.closeApp();
            appiumDriver = null;
        }
    }
}



