package day18_ScreenShot;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import utilities.TestBase;
public class C03_ScreenShotClassWork extends TestBase {
    @Test
    public void classWork() {
        //Techproeducation sayfasına gidelim
        driver.get("https://techproeducation.com");
        bekle(3);
        driver.findElement(By.xpath("//i[@class='eicon-close']")).click();//Reklamı kapatıyorum
        //sayfanın resmini alalım
        tumSayfaResmi();
        //Arama bölümünde java aratalım
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("java", Keys.ENTER);
        //ve sonuc yazısının resmini alalım
        WebElement sonucYazisi = driver.findElement(By.xpath("//h1"));
        webElementResmi(sonucYazisi);//Method kullanarak Webelementin resmini aldık
        //Yeni bir sekmede amazona gidelim
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://amazon.com");
        //sayfanın resmini alalım
        tumSayfaResmi();
        //arama bölümde iphone aratalım
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        //ve sonuc yazısının resmini alalım
        WebElement sonucYazisi2 = driver.findElement(By.xpath("(//*[@class='sg-col-inner'])[1]"));
        webElementResmi(sonucYazisi2);//Method kullanarak Webelementin resmini aldık
        //tekrar tecpro sayfasına geçelim ve sayfa resmini alalım
        window(0);
        tumSayfaResmi();
    }
}
/*
 EXTENTREPORT kullanabilmemiz icin;
 1-pom.xml dosyasina extentreport dependency'si eklenir
 2-ExtentReport class'indan bir obje olusturulur
 3-HTML formatinda duzenlenecegi icin ExtentHtmlReporter class'indan obje olusturulur.
 4-Rapora test ile ilgili bilgiler girebilmek icin ExtentTest class'indan bir obje olusturulur
  */