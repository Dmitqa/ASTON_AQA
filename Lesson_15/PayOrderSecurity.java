import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayOrderSecurity {
    private final WebDriver driver;

    public PayOrderSecurity(WebDriver driver) {
        this.driver = driver;
    }

    private final By pageTitle = By.xpath("//div[@class='container-fluid']/h3");

    public String getPageTitle() {
        return driver.findElement(pageTitle).getText();
    }
}
