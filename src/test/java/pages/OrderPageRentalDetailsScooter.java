package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderPageRentalDetailsScooter {
    private WebDriver driver;

    //локатор поля "Дата доставки"
    private By fieldDeliveryDate = By.cssSelector("[placeholder='* Когда привезти самокат']");
    //локатор выбора даты (28-й день)
    private By datePicker = By.cssSelector("[class='react-datepicker__day react-datepicker__day--028']");
    //локатор поля "Срок аренды"
    private By fieldRentalPeriod = By.cssSelector("[class='Dropdown-placeholder']");
    //локатор меню "Срок аренды" (сутки)
    private By dropdownMenuRentalPeriod = By.xpath(".//div[contains (text(), 'сутки')]");
    //локатор поля "Цвет самоката" (чёрный)
    private By checkBoxScooterColor = By.id("black");
    //локатор поля "Комментарий"
    private By fieldComment = By.cssSelector("[placeholder='Комментарий для курьера']");
    //локатор кнопки "Заказать"
    private By buttonOrder = By.cssSelector("[class='Button_Button__ra12g Button_Middle__1CSJM']");
    //локатор кнопки подтверждения заказа
    private By buttonOrderConfirmation = By.xpath(".//div[@name='edit']/button[text()='Сохранить']");
    //локатор модального окна "Заказ оформлен"
    private By modalWindowOrderProcessed = By.cssSelector("[class='Order_Modal__YZ-d3']");

    public OrderPageRentalDetailsScooter(WebDriver driver) {
        this.driver = driver;
    }

    //ввод даты доставки
    public void inputInFieldDeliveryDate(){
        driver.findElement(fieldDeliveryDate).click();
        driver.findElement(datePicker).click();
    }
    //ввод периода аренды
    public void inputInFieldRentalPeriod(){
        driver.findElement(fieldRentalPeriod).click();
        driver.findElement(dropdownMenuRentalPeriod).click();
    }
    //выбор цвета самоката
    public void clickCheckBoxScooterColor(){
        driver.findElement(checkBoxScooterColor).click();
    }
    //ввод комментария
    public void inputInFieldComment(){
        driver.findElement(fieldComment).click();
        driver.findElement(fieldComment).sendKeys("Комментарий");
    }
    //подтверждение заказа
    public void clickButtonOrderConfirmation(){
        driver.findElement(buttonOrder).click();
        driver.findElement(buttonOrderConfirmation).click();
    }
    //проверка отображения модального окна "Заказ оформлен"
    public boolean isVisibleModalWindowOrderProcessed(){
        driver.findElement(modalWindowOrderProcessed).isDisplayed();
        return true;
    }

}
