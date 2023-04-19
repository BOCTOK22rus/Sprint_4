package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static constants.TestDataCustomer.*;

public class OrderPageCustomerDetailsScooter {

    private final WebDriver driver;

    //локатор поля "Имя"
    private final By fieldName = By.cssSelector("[placeholder='* Имя']");
    //локатор поля "Фамилия"
    private final By fieldSurname = By.cssSelector("[placeholder='* Фамилия']");
    //локатор поля "Адрес"
    private final By fieldAddress = By.cssSelector("[placeholder='* Адрес: куда привезти заказ']");
    //локатор поля "Метро"
    private final By fieldMetro = By.cssSelector("[placeholder='* Станция метро']");
    //локатор станции метро
    private final By valueMetro = By.xpath(".//button[@value='29']");
    //локатор поля "Телефон"
    private final By fieldTelephone = By.cssSelector("[placeholder='* Телефон: на него позвонит курьер']");
    //локатор кнопки "Далее"
    private final By buttonNext = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");

    public OrderPageCustomerDetailsScooter(WebDriver driver) {
        this.driver = driver;
    }
    //ввод данных заказчика
    public void customerDataEntry(){
        driver.findElement(fieldName).sendKeys(CUSTOMER_NAME);
        driver.findElement(fieldSurname).sendKeys(CUSTOMER_SURNAME);
        driver.findElement(fieldAddress).sendKeys(CUSTOMER_ADDRESS);
        driver.findElement(fieldMetro).click();
        driver.findElement(valueMetro).click();
        driver.findElement(fieldTelephone).sendKeys(CUSTOMER_TELEPHONE);
    }
    //клик по кнопке "далее"
    public void clickButtonNext(){
        driver.findElement(buttonNext).click();
    }
}
