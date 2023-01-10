package clarusway.test;

import clarusway.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;
import java.util.stream.Collectors;

public class Day02_C01_PageClass_I {

    /*
    Navigate to https://www.saucedemo.com/
Enter the user name as standard_user
Enter the password as secret_sauce
Click on login button.
- Choose price low to high with soft Assert.
- Verify item prices are sorted from low to high with hard Assert.
     */

    @Test
    public void test() {

        Driver.getDriver().get("https://www.saucedemo.com/");
        WebElement username = Driver.getDriver().findElement(By.id("user-name"));
        username.sendKeys("standard_user");

        WebElement password = Driver.getDriver().findElement(By.id("password"));
        password.sendKeys("secret_sauce");

        WebElement loginButton = Driver.getDriver().findElement(By.id("login-button"));
        loginButton.click();

        Select dropdown = new Select(Driver.getDriver().findElement(By.tagName("select")));
        dropdown.selectByValue("lohi");

        List<WebElement> itemPrices = Driver.getDriver().findElements(By.className("inventory_item_price"));
        itemPrices.forEach(x -> System.out.println(x.getText()));



        List <Double> urunFiyatlari = itemPrices.stream()
                .map(x -> x.getText().substring(1))
                .map(x -> Double.parseDouble(x))
                .collect(Collectors.toList());

        System.out.println(urunFiyatlari);

        for (int i = 0; i < urunFiyatlari.size()-1; i++) {
            Assert.assertTrue(urunFiyatlari.get(i) <= urunFiyatlari.get(i+1));
        }

        Driver.closeDriver();
    }


}
