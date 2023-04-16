package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageScooter {

    private WebDriver driver;

    //локатор первой кнопки заказа
    private By buttonOrderTop = By.className("Button_Button__ra12g");
    //локатор второй кнопки заказа
    private By buttonOrderBottom = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");
    //локатор кнопки куки
    private By buttonCookie = By.id("rcc-confirm-button");

    public HomePageScooter(WebDriver driver) {
        this.driver = driver;
    }
    //клик по кнопке куки
    public void clickButtonCookie(){
        driver.findElement(buttonCookie).click();
    }
    //клик по первой кнопке заказа
    public void clickButtonOrderTop() {
        driver.findElement(buttonOrderTop).click();
    }
    //скролл до второй кнопки оформления заказа
    public void scrollForButtonOrderBottom() {
        WebElement element = driver.findElement(buttonOrderBottom);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView();", element);
    }
    //клик по второй кнопке заказа
    public void clickButtonOrderBottom() {
        driver.findElement(buttonOrderBottom).click();
    }


}
