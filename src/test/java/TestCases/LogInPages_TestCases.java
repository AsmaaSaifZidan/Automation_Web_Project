package TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.name;

public class LogInPages_TestCases {
    @Test // Test1 Valid all data for log in
    public void TestCase1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(name("FirstName")).sendKeys(new CharSequence[]{"Asmaa"});
        driver.findElement(name("LastName")).sendKeys(new CharSequence[]{"Saif"});
        Thread.sleep(1000L);
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test12@test.com"});
        Thread.sleep(1000L);
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).sendKeys(new CharSequence[]{"ITI Company"});
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa123"});
        Thread.sleep(1000L);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(new CharSequence[]{"Asmaa123"});
        Thread.sleep(1000L);
        driver.findElement(name("register-button")).submit();
        String TC1_Reg = driver.findElement(By.className("result")).getText();
        System.out.println("TC1_Reg=" + TC1_Reg);
        Thread.sleep(5000L);
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).sendKeys(new CharSequence[]{"Asmaa Saif"});
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test12@test.com"});
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa123"});
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).submit();
        String TC2_LogIn=driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).getText();
        System.out.println("TC2_LogIn="+TC2_LogIn);
        driver.quit();
    }
    @Test // Test1 Valid all data for log in
    public void TestCase3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).sendKeys(new CharSequence[]{"Asmaa Saif"});
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test12@test.com"});
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa123"});
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).submit();
       // String TC3_LogIn=driver.findElement(By.xpath("//*[@id=\"bar-notification\"]/div/p")).getText();
       // System.out.println("TC3_LogIn="+TC3_LogIn);
        //driver.quit();
    }
    @Test // Test1 inValid Password data for log in first times
    public void TestCase4() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");

        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).sendKeys(new CharSequence[]{"Asmaa Saif"});
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test12@test.com"});
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa1234"});
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).submit();
        String TC3_LogIn=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
        System.out.println("TC3_LogIn="+TC3_LogIn);
        driver.quit();
    }
    @Test // Test1 inValid Password data for log in second times
    public void TestCase5() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("/html/body/div[6]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a")).click();
         driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test12@test.com"});
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa1234"});
        driver.findElement(By.xpath("//*[@id=\"RememberMe\"]")).click();
        driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).submit();
        Thread.sleep(1000L);
        //Try1
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa1234"});
         driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).click();
        Thread.sleep(1000L);
         driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa1234"});
         driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).submit();
         //Try2
        Thread.sleep(1000L);
         driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa1234"});
         driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).submit();
         //Try3
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa1234"});
          driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[3]/button")).submit();
       // String TC5_LogIn=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/div[1]/div[2]/form/div[1]")).getText();
       // System.out.println("TC3_LogIn="+TC5_LogIn);
        Thread.sleep(5000L);

        driver.quit();
    }
}


