package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageCustomerDetailsScooter {
    private WebDriver driver;

    //локатор поля "Имя"
    private By fieldName = By.cssSelector("[placeholder='* Имя']");
    //локатор поля "Фамилия"
    private By fieldSurname = By.cssSelector("[placeholder='* Фамилия']");
    //локатор поля "Адрес"
    private By fieldAddress = By.cssSelector("[placeholder='* Адрес: куда привезти заказ']");
    //локатор поля "Метро"
    private By fieldMetro = By.cssSelector("[placeholder='* Станция метро']");

    private By valueMetro = By.xpath(".//button[@value='29']");
    //локатор поля "Телефон"
    private By fieldTelephone = By.cssSelector("[placeholder='* Телефон: на него позвонит курьер']");
    //локатор кнопки "Далее"
    private By buttonNext = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");

    public OrderPageCustomerDetailsScooter(WebDriver driver) {
        this.driver = driver;
    }

    public void inputInFieldName(){
        driver.findElement(fieldName).click();
        driver.findElement(fieldName).sendKeys("Иван");
    }

    public void inputInFieldSurname(){
        driver.findElement(fieldSurname).click();
        driver.findElement(fieldSurname).sendKeys("Иванов");
    }

    public void inputInFieldAddress(){
        driver.findElement(fieldAddress).click();
        driver.findElement(fieldAddress).sendKeys("Адрес");
    }

    public void inputInFieldMetro(){
        driver.findElement(fieldMetro).click();
        driver.findElement(valueMetro).click();
    }

    public void inputInFieldTelephone(){
        driver.findElement(fieldTelephone).click();
        driver.findElement(fieldTelephone).sendKeys("89000000000");
    }

    public void clickButtonNext(){
        driver.findElement(buttonNext).click();
    }


}
