import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class OnlineReplenish {
    private final WebDriver driver;

    public OnlineReplenish(WebDriver driver) {
        this.driver = driver;
    }

    private final By onlineReplTabHeader = By.xpath("//div[@class=\"pay__wrapper\"]/h2");
    private final By visaLogo = By.xpath("//div[@class='pay__partners']//li[1]/img");
    private final By verifiedVisaLogo = By.xpath("//div[@class='pay__partners']//li[2]/img");
    private final By masterCardLogo = By.xpath("//div[@class='pay__partners']//li[3]/img");
    private final By masterCardSecureCodeLogo = By.xpath("//div[@class='pay__partners']//li[4]/img");
    private final By belcardLogo = By.xpath("//div[@class='pay__partners']//li[5]/img");
    private final By aboutServiceLink = By.xpath("//a[text()='Подробнее о сервисе']");
    private final By telNumberField = By.xpath("//input[@placeholder='Номер телефона']");
    private final By telLabelField = By.xpath("//label[@for='connection-phone']");
    private final By emailField = By.xpath("//input[@placeholder='E-mail для отправки чека']");
    private final By costField = By.xpath("//input[@placeholder='Сумма']");
    private final By continueButton = By.xpath("//button[text()='Продолжить']");
    private final By payMenu = By.xpath("//div[@class='app-wrapper__content']");

    private final By connectionService = By.xpath("//li/p[text()='Услуги связи']");
    private final By homeInternet = By.xpath("//p[text()='Домашний интернет']");
    private final By installment = By.xpath("//p[text()='Рассрочка']");
    private final By debt = By.xpath("//p[text()='Задолженность']");


    public PayOrderSecurity clickAboutService() {
        driver.findElement(aboutServiceLink).click();
        return new PayOrderSecurity(driver);
    }

    public boolean displayedVisaLogo() {
        return driver.findElement(visaLogo).isDisplayed();
    }

    public boolean displayedVerifiedVisaLogo() {
        return driver.findElement(verifiedVisaLogo).isDisplayed();
    }

    public boolean displayedMasterCardLogo() {
        return driver.findElement(masterCardLogo).isDisplayed();
    }

    public boolean displayedMasterCardSecureCodeLogo() {
        return driver.findElement(masterCardSecureCodeLogo).isDisplayed();
    }

    public boolean displayedBelcardLogo() {
        return driver.findElement(belcardLogo).isDisplayed();
    }

    public PayMenu clickContinueButton() {
        driver.findElement(continueButton).click();
        return new PayMenu(driver);
    }

    public String pickServiceType() {
        WebElement field = driver.findElement(By.xpath("//span[@class='select__now']"));
        return field.getText();
    }

    public OnlineReplenish getTelNumber(String number) {
        driver.findElement(telNumberField).sendKeys(number);
        return this;
    }

    public OnlineReplenish getCost(String cost) {
        driver.findElement(costField).sendKeys(cost);
        return this;
    }

    public PayMenu checkContinueButton(String number, String cost) {
        this.getTelNumber(number);
        this.getCost(cost);
        return clickContinueButton();
    }

    public String getReplTabHeader() {
        return driver.findElement(onlineReplTabHeader).getText();
    }

    public String[] getServiceFieldsConnectionService() {
        String[] service = new String[5];
        WebElement title = driver.findElement(By.xpath("//span[@class=\"select__arrow\"]"));
        //title.click();
        driver.findElement(connectionService).click();
        service [0] = driver.findElement(connectionService).getText();
        service [1] = driver.findElement(telLabelField).getText();
        service [2] = driver.findElement(telNumberField).getText();
        service [3] = driver.findElement(costField).getText();
        service [4] = driver.findElement(emailField).getText();
        return service;
    }

    public String[] getServiceFieldsHomeInternet() {
        String[] service = new String[5];
        WebElement title = driver.findElement(By.xpath("//button[@class='select__header']"));
        title.click();
        driver.findElement(homeInternet).click();
        service [0] = driver.findElement(homeInternet).getText();
        service [1] = driver.findElement(telLabelField).getText();
        service [2] = driver.findElement(By.xpath("//input[@placeholder='Номер абонента']")).getText();
        service [3] = driver.findElement(costField).getText();
        service [4] = driver.findElement(emailField).getText();
        return service;
    }
}
