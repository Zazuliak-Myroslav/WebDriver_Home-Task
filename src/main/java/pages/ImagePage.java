package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class ImagePage extends BasePage{

    @FindBy(xpath = "//div[@class='k1zIA rSk4se']//span")
    private WebElement textImageOnImagePage;

    public ImagePage(WebDriver driver) {
        super(driver);
    }

    public String textImageOnImagePage() {
        explicitWait(DEFAULT_TIMEOUT).until(ExpectedConditions.visibilityOf(textImageOnImagePage));
        return textImageOnImagePage.getText();
    }
}
