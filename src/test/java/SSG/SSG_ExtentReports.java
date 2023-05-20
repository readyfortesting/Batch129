package SSG;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SSG_ExtentReports extends TestBase {
    @Test
    public void extentReports(){
        ExtentReports extentReports=new ExtentReports();
        String tarih=new SimpleDateFormat("_hh_mm_ss_ddMMyyy").format(new Date());
        String dosyaYolu="TestOutput/extentReport/reports"+tarih+".html";//reports.html dosyasi olarak kaydet diye biz ekledik
        ExtentHtmlReporter extentHtmlReporter=new ExtentHtmlReporter(dosyaYolu);
        extentReports.attachReporter(extentHtmlReporter);
        extentReports.setSystemInfo("Browser","Chrome");
        extentReports.setSystemInfo("Tester","Burak Akyuz");
        extentHtmlReporter.config().setDocumentTitle("Extent Report");
        extentHtmlReporter.config().setReportName("Test Raporu");
        ExtentTest extentTest=extentReports.createTest("ExtentTest","Test Raporu");
        driver.get("https://amazon.com");
        extentTest.info("Amazon Sayfasina gidildi");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone", Keys.ENTER);
        extentTest.info("Amazon sayfasinda iphone aratildi");
        driver.close();
        extentTest.pass("Test basarili sekilde sonlandirildi");
        extentReports.flush();






    }
}
