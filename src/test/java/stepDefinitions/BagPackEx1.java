package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class BagPackEx1 {
    WebDriver driver;
    @Given("browser is open")
    public void browserIsOpen() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        driver = new ChromeDriver(options);
    }

    @When("user is on the main Page")
    public void userIsOnTheMainPage(){
        driver.get("https://www.saucedemo.com/");
    }

    @And("user enters the Username")
    public void userEntersTheUsername() {
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
    }
    @And("user enters the Password")
    public void userEntersThePassword() {
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
    }
    @And("user clicks the login button")
    public void userClicksTheLoginButton () {
        driver.findElement(By.id("login-button")).click();
    }
    @Then("user selects item")
    public void userSelectsItem () {
        driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
    }
    @Then("user selects shopping Cart")
    public void userSelectsShoppingCart() {
        driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a")).click();
    }
    @Then ("user selects Checkout")
    public void userSelectsCheckout() {
        driver.findElement(By.id("checkout")).click();
    }
    @And("user enters First Name")
    public void userEntersFirstName() {
        driver.findElement(By.id("first-name")).sendKeys("Joe");
    }
    @And("user enters Last Name")
    public void userEntersLastName() {
        driver.findElement(By.id("last-name")).sendKeys("Bloggs");
        }
    @And("user enters Post code")
    public void userEntersPostCode() {
        driver.findElement(By.id("postal-code")).sendKeys("0L7 9AP");
    }
    @And("user clicks continue")
    public void userClicksContinue() {
        driver.findElement(By.id("continue")).click();
    }
    @And("user clicks Finish")
    public void userClicksFinish() {
        driver.findElement(By.id("finish")).click();


}

}
