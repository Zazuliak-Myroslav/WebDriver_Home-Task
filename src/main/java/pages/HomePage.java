package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class HomePage extends BasePage {

    @FindBy(xpath = "//a[contains(@href,'google.com.ua/img')]")
    private WebElement buttonToImagePage;

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void clickButtonToImagePage() {
        explicitWait(DEFAULT_TIMEOUT).until(ExpectedConditions.elementToBeClickable(buttonToImagePage));
        buttonToImagePage.click();
    }
}
