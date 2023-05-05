package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageScooter {

    private final WebDriver driver;

    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }
    //локаторы кнопок заказа
    private final By[] buttonOrder = {
            By.cssSelector("[class='Button_Button__ra12g']"),
            By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']")
    };
    //локатор кнопки куки
    private final By buttonCookie = By.id("rcc-confirm-button");
    //локатор FAQ
    private final By homeFaq = By.className("Home_FAQ__3uVm4");
    //локаторы кнопок аккордеонов
    private final By[] accordionButtons = {
            By.id("accordion__heading-0"),
            By.id("accordion__heading-1"),
            By.id("accordion__heading-2"),
            By.id("accordion__heading-3"),
            By.id("accordion__heading-4"),
            By.id("accordion__heading-5"),
            By.id("accordion__heading-6"),
            By.id("accordion__heading-7")
    };
    //локаторы элементов с текстом
    private final By[] textAccordion = {
            By.xpath(".//div[@id = 'accordion__panel-0']/p"),
            By.xpath(".//div[@id = 'accordion__panel-1']/p"),
            By.xpath(".//div[@id = 'accordion__panel-2']/p"),
            By.xpath(".//div[@id = 'accordion__panel-3']/p"),
            By.xpath(".//div[@id = 'accordion__panel-4']/p"),
            By.xpath(".//div[@id = 'accordion__panel-5']/p"),
            By.xpath(".//div[@id = 'accordion__panel-6']/p"),
            By.xpath(".//div[@id = 'accordion__panel-7']/p")
    };
    //клик по кнопке куки
    public void clickButtonCookie(){
        driver.findElement(buttonCookie).click();
    }
    //скролл до FAQ
    public void scrollForFaqHomePage() {
        WebElement element = driver.findElement(homeFaq);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //получение текста из аккордеонов
    public String getTextAccordion(int i) {
        driver.findElement(accordionButtons[i]).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAccordion[i]));
        return driver.findElement(textAccordion[i]).getText();
    }
    //клик по кнопке заказа
    public void clickButtonOrder(int i) {
        WebElement element = driver.findElement(buttonOrder[i]);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
        driver.findElement(buttonOrder[i]).click();
    }
}
