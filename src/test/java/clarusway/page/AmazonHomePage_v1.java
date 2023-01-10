package clarusway.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class AmazonHomePage_v1 {

    private WebDriver lDriver;

    public AmazonHomePage_v1(WebDriver lDriver) {
        this.lDriver = lDriver;

        PageFactory.initElements(lDriver,this);
    }
    @FindBy(id = "twotabsearchtextbox")
    WebElement txtSearch;

    @FindBy(id = "nav-link-accountList")
    WebElement accountAndList;

    @FindBy(id = "nav_prefetch_yourorders")
    WebElement orders;


    public void searchFor(String key){
        txtSearch.sendKeys(key + Keys.ENTER);
    }

    public void navigateToOrders(){
        Actions actions = new Actions(lDriver);
        actions.moveToElement(accountAndList)
                .perform();

        WebDriverWait wait = new WebDriverWait(lDriver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(orders)).click();

    }




}
