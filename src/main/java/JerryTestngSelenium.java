import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import org.openqa.selenium.*;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;


public class JerryTestngSelenium {
//    System.setProperty("webdriver.chrome.driver","C:/chromedriver.exe");
    WebDriver driver ;

    @BeforeMethod
    public void beforClass(){
        System.out.printf("\nthis is a before class");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.baidu.com/");

    }

    @Test
    public void test0(){
        System.out.printf("\nthis is test 0");
        driver.findElement(By.partialLinkText("新闻")).click();
    }

    @Test
    public void test1(){
        System.out.printf("\nthis is test 1");
        driver.findElement(By.partialLinkText("地图")).click();
    }

    @Test
    public void test2(){
        System.out.printf("\nthis is test 2");
        driver.findElement(By.partialLinkText("视频")).click();
    }

    @AfterMethod
    public void afterClass() throws IOException {
        System.out.printf("\nthis is after class\n");
        System.out.printf(driver.getCurrentUrl());
        File pic = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat currentTime = new SimpleDateFormat("yyyyMMdd-HHmmss");
        String time = currentTime.format(new Date());
        FileUtils.copyFile(pic, new File("test"+File.separator+time+".jpg"));
        driver.close();
    }
}
