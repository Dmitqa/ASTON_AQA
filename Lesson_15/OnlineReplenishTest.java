import org.junit.*;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

public class OnlineReplenishTest {
    private WebDriver driver;
    private OnlineReplenish onlineReplenish;

    @Before
    public void start() {
        System.setProperty("WebDriver.chrome.driver", "D:\\Files\\IntelliJ IDEA Community Edition 2024.3\\chromedriver-win64-v133\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://www.mts.by");
        try {
            onlineReplenish = new OnlineReplenish(driver);
        } catch (ElementNotInteractableException e) {
            WebElement cookie = driver.findElement(By.xpath("//button[@class='btn btn_gray cookie__cancel']"));
            cookie.click();
        }
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("window.scrollBy(0, 2000)");
    }

    @Test
    public void checkDisplayedVisaLogo() {
        Assert.assertTrue("Logo is displayed.", onlineReplenish.displayedVisaLogo());
    }

    @Test
    public void checkDisplayedVerifiedVisaLogo() {
        Assert.assertTrue("Logo is displayed.", onlineReplenish.displayedVerifiedVisaLogo());
    }

    @Test
    public void checkDisplayedMasterCardLogo() {
        Assert.assertTrue("Logo is displayed.", onlineReplenish.displayedMasterCardLogo());
    }

    @Test
    public void checkDisplayedMasterCardSecureCodeLogo() {
        Assert.assertTrue("Logo is displayed.", onlineReplenish.displayedMasterCardSecureCodeLogo());
    }

    @Test
    public void checkDisplayedBelcardLogo() {
        Assert.assertTrue("Logo is displayed.", onlineReplenish.displayedBelcardLogo());
    }

    @Test
    public void checkLinkAboutService() {
        PayOrderSecurity payOrderSecurity = onlineReplenish.clickAboutService();
        String header = payOrderSecurity.getPageTitle();
        Assert.assertEquals("Оплата банковской картой", header);
    }

    @Test
    public void getTabHead() {
        OnlineReplenish replenish = new OnlineReplenish(driver);
        String head = replenish.getReplTabHeader();
        Assert.assertEquals("Онлайн пополнение без комиссии", head.replace("\n", " "));

    }

    @Test
    public void checkServiceType() {
        OnlineReplenish replenish = new OnlineReplenish(driver);
        String type = replenish.pickServiceType();
        Assert.assertEquals("Услуги связи", type);
    }

    @Test
    public void getPayMenu() {
        try {
            OnlineReplenish menu = new OnlineReplenish(driver);
            menu.checkContinueButton("297777777", "100");
        } catch (NoSuchElementException e) {
            Assert.assertTrue(driver.findElement(By.xpath("//div[@class='app-wrapper__content']")).isDisplayed());
        }
    }

    @Test
    public void checkFieldsIfConnectionService() {
        OnlineReplenish replenish = new OnlineReplenish(driver);
        String[] nameField = replenish.getServiceFieldsConnectionService();
        Assert.assertEquals("Услуги связи", nameField[0]);
        Assert.assertEquals("+375", nameField[1]);
        Assert.assertEquals("Номер телефона", nameField[1]);
        Assert.assertEquals("Сумма", nameField[1]);
        Assert.assertEquals("E-mail для отправки чека", nameField[1]);
    }


    @After
    public void end() {
        driver.quit();
    }
}
