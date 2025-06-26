import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PayMenu {
    private WebDriver driver;

    public PayMenu(WebDriver driver) {
        this.driver = driver;
    }

    private By payMenu = By.xpath("//div[@class='app-wrapper__content']");
}
