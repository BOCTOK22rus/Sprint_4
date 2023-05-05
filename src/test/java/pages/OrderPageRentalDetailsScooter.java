package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.text.SimpleDateFormat;
import java.util.Date;

import static constants.TestDataOrder.COMMENT_FOR_COURIER;

public class OrderPageRentalDetailsScooter {

    private final WebDriver driver;
    //получение текущей даты
    SimpleDateFormat formatter = new SimpleDateFormat("dd.MM.yyyy");
    Date date = new Date();
    //локатор поля "Дата доставки"
    private final By fieldDeliveryDate = By.cssSelector("[placeholder='* Когда привезти самокат']");
    //локатор поля "Срок аренды"
    private final By fieldRentalPeriod = By.cssSelector("[class='Dropdown-placeholder']");
    //локатор меню "Срок аренды" (сутки)
    private final By[] rentalPeriod = {
        By.xpath(".//div[contains (text(), 'сутки')]"),
        By.xpath(".//div[contains (text(), 'семеро суток')]"),
    };
    private final By[] checkBoxScooterColor = {
        By.id("black"),
        By.id("grey"),
    };
    //локатор поля "Комментарий"
    private final By fieldComment = By.cssSelector("[placeholder='Комментарий для курьера']");
    //локатор кнопки "Заказать"
    private final By buttonOrder = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");
    //локатор кнопки подтверждения заказа
    private final By buttonOrderConfirmation = By.xpath(".//div[@name='edit']/button[text()='Сохранить']");
    //локатор модального окна "Заказ оформлен"
    private final By modalWindowOrderProcessed = By.cssSelector("[class='Order_Modal__YZ-d3']");

    public OrderPageRentalDetailsScooter(WebDriver driver) {
        this.driver = driver;
    }
    //ввод данных заказа
    public void orderDataEntry(int i){
        driver.findElement(fieldDeliveryDate).sendKeys(formatter.format(date));
        driver.findElement(fieldDeliveryDate).sendKeys(Keys.ENTER);
        driver.findElement(fieldRentalPeriod).click();
        driver.findElement(rentalPeriod[i]).click();
        driver.findElement(checkBoxScooterColor[i]).click();
        driver.findElement(fieldComment).sendKeys(COMMENT_FOR_COURIER);
        driver.findElement(buttonOrder).click();
        driver.findElement(buttonOrderConfirmation).click();
    }
    //проверка отображения модального окна "Заказ оформлен"
    public boolean isVisibleModalWindowOrderProcessed(){
        driver.findElement(modalWindowOrderProcessed).isDisplayed();
        return true;
    }
}
