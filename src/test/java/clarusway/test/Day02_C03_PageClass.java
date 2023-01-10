package clarusway.test;

import clarusway.page.HtmlGoodiesHomePage;
import clarusway.page.SauceDemoHomePage;
import clarusway.page.SauceDemoLoginPage;
import clarusway.utilities.Driver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Day02_C03_PageClass {
    /*
    Go to URL : http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html
 Fill in capitals by country.
     */
    @Test
    public void pageClassTest() {
        Driver.getDriver().get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        HtmlGoodiesHomePage homePage = new HtmlGoodiesHomePage();

        Actions actions = new Actions(Driver.getDriver());

        actions
                .dragAndDrop(homePage.copenhag, homePage.denmark)
                .dragAndDrop(homePage.madrid, homePage.spain)
                .dragAndDrop(homePage.seoul, homePage.sKorea)
                .dragAndDrop(homePage.washington, homePage.us)
                .dragAndDrop(homePage.rome, homePage.italy)
                .dragAndDrop(homePage.oslo, homePage.norway)
                .dragAndDrop(homePage.stockholm, homePage.sweden)
                .perform();

        Driver.closeDriver();
    }
}
