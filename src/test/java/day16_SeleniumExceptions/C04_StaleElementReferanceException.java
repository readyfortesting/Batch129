package day16_SeleniumExceptions;
import org.junit.Test;
import utilities.TestBase;
public class C04_StaleElementReferanceException extends TestBase {
    /*
        StaleElementReferanceException:
               Bir web sayfasındaki bir webelementin geçerliliğinin kaybolduğu durumlarda oluşur.
            Yani bir webelementi locate ettikten sonra sayfada refresh yada back-forward kullanıyorsak
            yeniden o elemente ulaşmak istediğimizde bu hatayı alırız. Bunu handle edebilmek için
            webelemente yeniden aynı locate'i atamalıyız.(Webelementin locate'ini hatırlatma gibi diyebiliriz)
     */
    @Test
    public void StaleElementReferanceExceptionTest1() {
        //techpro sayfasına gidelim
        driver.get("https://techproeducation.com");
        //Sayfaya gittikten sonra sayfayı yenileyelim
        //login butonuna tıklayalım
    }
}