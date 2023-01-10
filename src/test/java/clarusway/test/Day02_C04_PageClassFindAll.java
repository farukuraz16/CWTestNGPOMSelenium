package clarusway.test;

import clarusway.page.HtmlGoodiesHomePage;
import clarusway.page.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day02_C04_PageClassFindAll {
    /*
    Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
 Fill in capitals by country.
     */
    @Test
    public void pageClassTest() {
        Driver.getDriver().get("https://www.saucedemo.com/");

        SauceDemoLoginPage lp = new SauceDemoLoginPage();

        Assert.assertEquals(3, lp.inputElements.size());


        Driver.closeDriver();
    }
}
