package SSG;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import utilities.TestBase;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class SSG_FileExists extends TestBase {
    @Test
    public void fileExistsTest1() {
        String dosyaYolu="C:\\Users\\ADMIN\\Desktop\\data.xlsx\"\"";
        //"C:\\Users\\ADMIN\\Desktop\\data.xlsx\"\"";
        Assert.assertTrue(Files.exists(Paths.get("dosyaYolu")));


    }
    @Test
    public void fileExistTest2(){
        System.out.println(System.getProperty("user.home"));//C:\Users\ADMIN
        String farkliYol=System.getProperty("user.home");
        String ortakYol="\"C:\\Users\\ADMIN\\Desktop\\data.xlsx\"";
        String dosyaYolu=farkliYol+ortakYol;
      Assert.assertTrue(Files.exists(Paths.get("dosyaYolu")));


    }
    @Test
    public void fileExistTest3(){
        driver.get("https://bonigarcia.dev/selenium-webdriver-java/download.html");//sayfaya gitti
        String dosya = "//C:\\Users\\ADMIN/Downloads/webdrivermanager.png";//yolu aldı
        File silinecekDosya = new File(dosya);
        silinecekDosya.delete();//önceden aynı isimdeki dosyayı indirdiğimiz için sildik
        driver.findElement(By.xpath("//*[text()='WebDriverManager logo']")).click();
        bekle(5);
        String farkliYol = System.getProperty("user.home");//C:\Users\ADMIN
        String ortakYol = "/Downloads/webdrivermanager.png";
        String dosyaYolu = farkliYol+ortakYol;
        Assert.assertTrue(Files.exists(Paths.get(dosyaYolu)));//inip inmediğini kontrol ettik



    }
}
