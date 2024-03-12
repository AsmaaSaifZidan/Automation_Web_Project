package TestSuites;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TC1_Login {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(By.name("FirstName")).sendKeys(new CharSequence[]{"Asmaa"});
        driver.findElement(By.name("LastName")).sendKeys(new CharSequence[]{"Saif"});
        Thread.sleep(1000L);
       /* Select day= new Select(driver.findElement(By.name("DateOfBirthDay")));
         day.deselectByValue("5");
         Select month=new Select(driver.findElement(By.name("DateOfBirthMonth")));
         month.deselectByValue("5");
        Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.deselectByValue("1996");
       */
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test11@test.com"});
        Thread.sleep(1000L);
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).sendKeys(new CharSequence[]{"ITI Company"});
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa123"});
        Thread.sleep(1000L);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(new CharSequence[]{"Asmaa123"});
        Thread.sleep(1000L);
        driver.findElement(By.name("register-button")).submit();
        Thread.sleep(5000L);
        driver.quit();
    }

    }
