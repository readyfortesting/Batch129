package day16_SeleniumExceptions;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import utilities.TestBase;
import java.time.Duration;
public class C02_TimeOutException extends TestBase {
    @Test
    public void TimeOutExceptionTest1() {
        /*
        TimeOutException:
            Sayfada aradığımız elementi wait ile belirlediğimiz max. sürede bulamadığı durumda
        TimeOutException hatası alırız.
         */
        driver.get("https://techproeducation.com");
        bekle(5);
        driver.findElement(By.xpath("//*[@class='eicon-close']")).click();//Reklam kapatmak için
        //TimeOutException alabilmek için visibleofelementlocator methodunu kullanarak yanlis bir locate aldık
        visibleWait((WebElement) By.id("Yanlis Locate"),15);//org.openqa.selenium.TimeoutException:
        //Webelementi beklerlerken o webelemtin locati'ni bulamadığı için max. belirttiğimiz süre kadar bekler ve
        //org.openqa.selenium.TimeoutException hatasını verir
        /*
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@type='ssearch']")));
         */
    }
    @Test
    public void TimeOutExceptionTest2() {
        //https://the-internet.herokuapp.com/dynamic_loading/1 adresine gidelim
        driver.get("https://the-internet.herokuapp.com/dynamic_loading/1");
        //start butonuna tıklayalım
        driver.findElement(By.xpath("//*[.='Start']")).click();
        //Hello World textinin çıktığını doğrulayınız
        WebElement helloWorldText = driver.findElement(By.xpath("(//h4)[2]"));
        visibleWait((WebElement) helloWorldText,2);
        Assert.assertTrue(helloWorldText.isDisplayed());
    }
}
