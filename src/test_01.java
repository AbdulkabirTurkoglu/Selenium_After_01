import Repository.BaseDriver;
import Repository.Function;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class test_01 extends BaseDriver {
    @Test
    public void soru_01(){
        driver.get("http://demo.nopcommerce.com/");//yapildi

        WebElement registerLink = driver.findElement(By.linkText("Register"));
        registerLink.click();

        WebElement genderMale = driver.findElement(By.id("gender-male"));
        genderMale.click();

        WebElement firstName = driver.findElement(By.id("FirstName"));
        firstName.sendKeys("First Name");

        WebElement lastName = driver.findElement(By.name("LastName"));
        lastName.sendKeys("Last Name");

        WebElement eMail = driver.findElement(By.id("Email"));
        eMail.sendKeys("testing" + ((int) (Math.random() * 10000)) + "@testing.com");

        WebElement companyName = driver.findElement(By.name("Company"));
        companyName.sendKeys("Company");

        WebElement password = driver.findElement(By.id("Password"));
        password.sendKeys("password");

        WebElement passwordConfirm = driver.findElement(By.id("ConfirmPassword"));
        passwordConfirm.sendKeys("password");

        WebElement registerButton = driver.findElement(By.className("register-next-step-button"));
        registerButton.click();

        WaitAndClose();

    }

}
