package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePageFaqScooter {
    private WebDriver driver;

    public HomePageFaqScooter(WebDriver driver) {
        this.driver = driver;
    }

    private final By homeFaq = By.className("Home_FAQ__3uVm4");

    private final By buttonAccordion0 = By.id("accordion__heading-0");
    private final By buttonAccordion1 = By.id("accordion__heading-1");
    private final By buttonAccordion2 = By.id("accordion__heading-2");
    private final By buttonAccordion3 = By.id("accordion__heading-3");
    private final By buttonAccordion4 = By.id("accordion__heading-4");
    private final By buttonAccordion5 = By.id("accordion__heading-5");
    private final By buttonAccordion6 = By.id("accordion__heading-6");
    private final By buttonAccordion7 = By.id("accordion__heading-7");
    private final By textAccordion0 = By.xpath(".//div[@id = 'accordion__panel-0']/p");
    private final By textAccordion1 = By.xpath(".//div[@id = 'accordion__panel-1']/p");
    private final By textAccordion2 = By.xpath(".//div[@id = 'accordion__panel-2']/p");
    private final By textAccordion3 = By.xpath(".//div[@id = 'accordion__panel-3']/p");
    private final By textAccordion4 = By.xpath(".//div[@id = 'accordion__panel-4']/p");
    private final By textAccordion5 = By.xpath(".//div[@id = 'accordion__panel-5']/p");
    private final By textAccordion6 = By.xpath(".//div[@id = 'accordion__panel-6']/p");
    private final By textAccordion7 = By.xpath(".//div[@id = 'accordion__panel-7']/p");

    public void scrollForFaqHomePage() {
        WebElement element = driver.findElement(homeFaq);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    // метод для нажатия на кнопку первого вопроса
    public String getTextAccordion0() {
        driver.findElement(buttonAccordion0).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAccordion0));
        return driver.findElement(textAccordion0).getText();
    }

    public String getTextAccordion1() {
        driver.findElement(buttonAccordion1).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAccordion1));
        return driver.findElement(textAccordion1).getText();
    }

    public String getTextAccordion2() {
        driver.findElement(buttonAccordion2).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAccordion2));
        return driver.findElement(textAccordion2).getText();
    }

    public String getTextAccordion3() {
        driver.findElement(buttonAccordion3).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAccordion3));
        return driver.findElement(textAccordion3).getText();
    }

    public String getTextAccordion4() {
        driver.findElement(buttonAccordion4).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAccordion4));
        return driver.findElement(textAccordion4).getText();
    }

    public String getTextAccordion5() {
        driver.findElement(buttonAccordion5).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAccordion5));
        return driver.findElement(textAccordion5).getText();
    }

    public String getTextAccordion6() {
        driver.findElement(buttonAccordion6).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAccordion6));
        return driver.findElement(textAccordion6).getText();
    }

    public String getTextAccordion7() {
        driver.findElement(buttonAccordion7).click();
        new WebDriverWait(driver, Duration.ofSeconds(3))
                .until(ExpectedConditions.visibilityOfElementLocated(textAccordion7));
        return driver.findElement(textAccordion7).getText();
    }

}
