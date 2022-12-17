package Utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverService;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class GWD {

    // ! Paralel static local anlatmadna önce mikroişlemci gelişimini anlatalık, thread e gelelimki
    // aşağıdaki değişkenler için, thread.Sleep den bahsedilebilir, pipeline, local ama static eğişken olmalı
    // pipeline-thread-tread.sleep selenium dediği explicit kullanın biz böyle yaptık.burada thread bazlı static değişken
    // yaplaıyızı o lokale özel
    // biz burada tüm sistemi static driver üzerine kurduk, bu durumda bize local static lazım thread özel

    //  hem static hemde her thread e özel değişken : static WebDriver1, static Webdriver2
    private static ThreadLocal<WebDriver> threadDriver = new ThreadLocal<>(); // her thread e ozel local static driver olusacak - webDriver1, webDriver2

    private static ThreadLocal<String> threadBrowserName = new ThreadLocal<>(); // chrome, firefox ..

    // threadDriver.get() -> bulunduğum thread deki driverı verecek
    // threadDriver.set(driver) -> bulunduğum thread e driver set ediliyor

    public static WebDriver getDriver() {

        // extend report türkçe bilg çalışmaması sebebiyle kondu- bende spark raporu calisti ama turkce olursa bunu kullan
//        Locale.setDefault(new Locale("EN"));
//        System.setProperty("user.language", "EN");

        Logger.getLogger("").setLevel(Level.SEVERE);
        System.setProperty(org.slf4j.simple.SimpleLogger.DEFAULT_LOG_LEVEL_KEY, "Error");
//      System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");

        if (threadBrowserName.get() == null) // diger testlerimizi direkt calistirirken, XMLden parametre gelmeyecegi icin
            threadBrowserName.set("chrome"); // default olarak chrome atandi

        if (threadDriver.get() == null) { // su andaki yani bu threaddeki driverim bos mu?
            //driver i baslat, doldur, baslat ve gonder

            switch (threadBrowserName.get()) {

                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    threadDriver.set(new FirefoxDriver());
                    break;

//                case "safari" :
//                    WebDriverManager.safaridriver().setup();
//                    threadDriver.set(new SafariDriver());
//                    break;
//
//                case "edge" :
//                    WebDriverManager.edgedriver().setup();
//                    threadDriver.set(new EdgeDriver());
//                    break;
                default: // diğer testlerimizi direk çalıştırırken, XML den parametre gelmeyeceği için default olarak chrome atandı
                    //System.setProperty(ChromeDriverService.CHROME_DRIVER_SILENT_OUTPUT_PROPERTY, "true");
                    WebDriverManager.chromedriver().setup();
                    threadDriver.set(new ChromeDriver()); // bu threade bir webdriver atanıyor
            }
        }
        return threadDriver.get();
    }

    public static void quitDriver() {

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        if (threadDriver.get() != null) { // dolu ise
            threadDriver.get().quit();
            WebDriver driver = threadDriver.get();
            driver = null;             //threadLocaldeki bosaltma icin once al null`a esitle ve tekrar ata
            threadDriver.set(driver);

        }
    }

    public static void setThreadBrowserName(String browserName) {
        GWD.threadBrowserName.set(browserName);
    }


    public static String getThreadBrowserName() {
        return GWD.threadBrowserName.get();
    }
}
//  mikroişlemci
//   8086
//   80286  -> hız artıyor
//   386  -> hız artıyor
//   486  -> hız artıyor
//   586  -> pentium
//   686  -> P1
//  ....
//   P4   -> 6Ghz hız
//   daha fazla hız arttığında içinde
//   ısıya dayanamıyor.
//
//    mikroişlemcinin içerisindeki
//    esas karar verme kısmı olan ALU-Core
//    artırırız.
//    Bu şekilde performans artmış oldu.
//    iş hattına PipeLine dendi, donanımdaki adı
//    yazılımdaki adı : Thread oldu.
//
//    4 çekirdek(Core) 2Ghz.
//    L1 ve L2 Cahch bellek özel çok hızlı
//    (gümüş ve Altın dan yapılır)
//     8GM-4GB
//    L1 ve L2 -> 2MB, 6Mb