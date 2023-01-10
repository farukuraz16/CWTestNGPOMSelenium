package clarusway.test;

import clarusway.page.SauceDemoHomePage;
import clarusway.page.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Day02_C01_PageClass_II {


    @Test
    public void pageClassTest() {
        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLoginPage loginPage = new SauceDemoLoginPage();

        loginPage.txtUsername.sendKeys("standard_user");
        loginPage.txtPassword.sendKeys("secret_sauce");
        loginPage.btnLogin.click();

        SauceDemoHomePage homePage = new SauceDemoHomePage();

        Select select = new Select(homePage.filterDropdown);
        select.selectByValue("lohi");

//        homePage.products.forEach(x-> System.out.println(x.getText()));
        Assert.assertTrue(select.getFirstSelectedOption().getText().contains("low to high"));
        Driver.closeDriver();
    }
}
