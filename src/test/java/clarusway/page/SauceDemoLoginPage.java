package clarusway.page;

import clarusway.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class SauceDemoLoginPage {

    //initElemenets metohdu Page class ı initialize etmek için kullanılır
    public SauceDemoLoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user-name")
    public WebElement txtUsername;
    @FindBy(id = "password")
    public WebElement txtPassword;
    @FindBy(id = "login-button")
    public WebElement btnLogin;

    //FindAll kullanımı için örnek-->

    @FindAll(
            {
                    @FindBy(id = "user-name"),
                    @FindBy(id = "password"),
                    @FindBy(id = "login-button")
            }
    )
    public List<WebElement> inputElements;


}
