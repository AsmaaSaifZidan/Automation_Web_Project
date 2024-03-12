import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import static org.openqa.selenium.By.name;

public class TestCases {
         @Test // Test1 Valid all data
            public void TestCase1() throws InterruptedException {
            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.linkText("Register")).click();
            driver.findElement(By.id("gender-female")).click();
            driver.findElement(name("FirstName")).sendKeys(new CharSequence[]{"Asmaa"});
            driver.findElement(name("LastName")).sendKeys(new CharSequence[]{"Saif"});
            Thread.sleep(1000L);
         /* Select day= new Select(driver.findElement(name("DateOfBirthDay")));
         day.deselectByValue("5");
         Select month=new Select(driver.findElement(name("DateOfBirthMonth")));
         month.deselectByValue("5");
        Select year=new Select(driver.findElement(name("DateOfBirthYear")));
        year.deselectByValue("1996");
*/
            driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test111@test.com"});
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
            String TC1_Reg=driver.findElement(By.className("result")).getText();
            System.out.println("TC1_Reg="+TC1_Reg);
              Thread.sleep(5000L);
            driver.quit();
        }

        @Test //Test2 this Email Already Exist
        public void TestCase2() throws InterruptedException {

            WebDriver driver = new ChromeDriver();
            driver.manage().window().maximize();
            driver.get("https://demo.nopcommerce.com/");
            driver.findElement(By.linkText("Register")).click();
            driver.findElement(By.id("gender-female")).click();
            driver.findElement(name("FirstName")).sendKeys(new CharSequence[]{"Asmaa"});
            driver.findElement(name("LastName")).sendKeys(new CharSequence[]{"Saif"});
            Thread.sleep(1000L);
       /* Select day= new Select(driver.findElement(By.name("DateOfBirthDay")));
         day.deselectByValue("5");
         Select month=new Select(driver.findElement(By.name("DateOfBirthMonth")));
         month.deselectByValue("5");
        Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.deselectByValue("1996");
       */
           // driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).get(2).click();
            driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test111@test.com"});
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
            String TC2_Reg=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")).getText();
            System.out.println("TC2_Reg="+TC2_Reg);
            Thread.sleep(5000L);
            driver.quit();
        }
    @Test
    public void TestCase3() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(name("FirstName")).sendKeys(new CharSequence[]{"Asmaa"});
        driver.findElement(name("LastName")).sendKeys(new CharSequence[]{"Saif"});
        Thread.sleep(1000L);
       /* Select day= new Select(driver.findElement(By.name("DateOfBirthDay")));
         day.deselectByValue("5");
         Select month=new Select(driver.findElement(By.name("DateOfBirthMonth")));
         month.deselectByValue("5");
        Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.deselectByValue("1996");
       */
        // driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).get(2).click();
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test11111111@com"});
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
        String TC3_Reg=driver.findElement(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/ul/li")).getText();
        System.out.println("TC3_Reg="+TC3_Reg);
        Thread.sleep(5000L);
        driver.quit();
    }
    @Test //Test4( invalid mail syntax)
    public void TestCase4() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(name("FirstName")).sendKeys(new CharSequence[]{"Asmaa"});
        driver.findElement(name("LastName")).sendKeys(new CharSequence[]{"Saif"});
        Thread.sleep(1000L);
       /* Select day= new Select(driver.findElement(By.name("DateOfBirthDay")));
         day.deselectByValue("5");
         Select month=new Select(driver.findElement(By.name("DateOfBirthMonth")));
         month.deselectByValue("5");
        Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.deselectByValue("1996");
       */
        // driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).get(2).click();
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test11111111@com"});
        Thread.sleep(1000L);
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).sendKeys(new CharSequence[]{"ITI Company"});
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"Asmaa123"});
        Thread.sleep(1000L);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(new CharSequence[]{"Asmaa1234"});
        Thread.sleep(1000L);
        driver.findElement(name("register-button")).submit();
        String TC4_Reg=driver.findElement(By.xpath("//*[@id=\"ConfirmPassword-error\"]")).getText();
        System.out.println("TC4_Reg="+TC4_Reg);
        Thread.sleep(5000L);
        driver.quit();
    }
    @Test //Test5(Password least 6 char)
    public void TestCase5() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(name("FirstName")).sendKeys(new CharSequence[]{"Asmaa"});
        driver.findElement(name("LastName")).sendKeys(new CharSequence[]{"Saif"});
        Thread.sleep(1000L);
       /* Select day= new Select(driver.findElement(By.name("DateOfBirthDay")));
         day.deselectByValue("5");
         Select month=new Select(driver.findElement(By.name("DateOfBirthMonth")));
         month.deselectByValue("5");
        Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.deselectByValue("1996");
       */
        // driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).get(2).click();
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test11111111@gmail.com"});
        Thread.sleep(1000L);
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).sendKeys(new CharSequence[]{"ITI Company"});
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"1234"});
        Thread.sleep(1000L);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(new CharSequence[]{"1234"});
        Thread.sleep(1000L);
        driver.findElement(name("register-button")).submit();
        String TC5_Reg1=driver.findElement(By.xpath("//*[@id=\"Password-error\"]/p")).getText();
        String TC5_Reg2=driver.findElement(By.xpath("//*[@id=\"Password-error\"]/ul/li")).getText();

        System.out.println("TC5_Reg="+TC5_Reg1);
        System.out.println("TC5_Reg="+TC5_Reg2);

        Thread.sleep(5000L);
        driver.quit();
    }
    @Test //Test6(Name is number)
    public void TestCase6() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(name("FirstName")).sendKeys(new CharSequence[]{"Asmaa"});
        driver.findElement(name("LastName")).sendKeys(new CharSequence[]{"123"});
        Thread.sleep(1000L);
       /* Select day= new Select(driver.findElement(By.name("DateOfBirthDay")));
         day.deselectByValue("5");
         Select month=new Select(driver.findElement(By.name("DateOfBirthMonth")));
         month.deselectByValue("5");
        Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.deselectByValue("1996");
       */
        // driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).get(2).click();
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test11111111@gmail.com"});
        Thread.sleep(1000L);
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).sendKeys(new CharSequence[]{"ITI Company"});
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"123456"});
        Thread.sleep(1000L);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(new CharSequence[]{"123456"});
        Thread.sleep(1000L);
        driver.findElement(name("register-button")).submit();
        String TC6_Reg=driver.findElement(By.className("result")).getText();

        System.out.println("TC6_Reg="+TC6_Reg);
        Thread.sleep(5000L);
        driver.quit();
    }
    @Test //Test7(Last name not put )
    public void TestCase7() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(name("FirstName")).sendKeys(new CharSequence[]{"Asmaa"});
        driver.findElement(name("LastName")).sendKeys(new CharSequence[]{""});
        Thread.sleep(1000L);
       /* Select day= new Select(driver.findElement(By.name("DateOfBirthDay")));
         day.deselectByValue("5");
         Select month=new Select(driver.findElement(By.name("DateOfBirthMonth")));
         month.deselectByValue("5");
        Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.deselectByValue("1996");
       */
        // driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).get(2).click();
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test11111111@gmail.com"});
        Thread.sleep(1000L);
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).sendKeys(new CharSequence[]{"ITI Company"});
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"123456"});
        Thread.sleep(1000L);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(new CharSequence[]{"123456"});
        Thread.sleep(1000L);
        driver.findElement(name("register-button")).submit();
        String TC7_Reg=driver.findElement(By.xpath("//*[@id=\"LastName-error\"]")).getText();

        System.out.println("TC7_Reg="+TC7_Reg);
        Thread.sleep(5000L);
        driver.quit();
    }
    @Test //Test(First name not put )
    public void TestCase8() throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Register")).click();
        driver.findElement(By.id("gender-female")).click();
        driver.findElement(name("FirstName")).sendKeys(new CharSequence[]{""});
        driver.findElement(name("LastName")).sendKeys(new CharSequence[]{"Saif"});
        Thread.sleep(1000L);
       /* Select day= new Select(driver.findElement(By.name("DateOfBirthDay")));
         day.deselectByValue("5");
         Select month=new Select(driver.findElement(By.name("DateOfBirthMonth")));
         month.deselectByValue("5");
        Select year=new Select(driver.findElement(By.name("DateOfBirthYear")));
        year.deselectByValue("1996");
       */
        // driver.findElements(By.xpath("/html/body/div[6]/div[3]/div/div/div/div[2]/form/div[1]/div[2]/div[4]/div/select[1]")).get(2).click();
        driver.findElement(By.id("Email")).sendKeys(new CharSequence[]{"test11111111@gmail.com"});
        Thread.sleep(1000L);
        driver.findElement(By.cssSelector("input[id=\"Company\"]")).sendKeys(new CharSequence[]{"ITI Company"});
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//*[@id=\"Newsletter\"]")).click();
        Thread.sleep(1000L);
        driver.findElement(By.id("Password")).sendKeys(new CharSequence[]{"123456"});
        Thread.sleep(1000L);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(new CharSequence[]{"123456"});
        Thread.sleep(1000L);
        driver.findElement(name("register-button")).submit();
        String TC8_Reg=driver.findElement(By.xpath("//*[@id=\"FirstName-error\"]")).getText();

        System.out.println("TC8_Reg="+TC8_Reg);
        Thread.sleep(5000L);
        driver.quit();
    }



}


