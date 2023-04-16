package scooter.praktikum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePageScooter;
import pages.OrderPageCustomerDetailsScooter;
import pages.OrderPageRentalDetailsScooter;

import static junit.framework.Assert.assertTrue;

public class TestOrderScooter {

    private WebDriver driver;

    @Before
    public void getHomePage() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooter homePageScooter = new HomePageScooter(driver);

        homePageScooter.clickButtonCookie();
    }

    @Test
    public void checkOrderScooterButtonTop() {
        HomePageScooter homePageScooter = new HomePageScooter(driver);
        OrderPageCustomerDetailsScooter orderPageCustomerDetailsScooter = new OrderPageCustomerDetailsScooter(driver);
        OrderPageRentalDetailsScooter orderPageRentalDetailsScooter = new OrderPageRentalDetailsScooter(driver);

        homePageScooter.clickButtonOrderTop();
        //заполнение данных о заказчике
        orderPageCustomerDetailsScooter.inputInFieldName();
        orderPageCustomerDetailsScooter.inputInFieldSurname();
        orderPageCustomerDetailsScooter.inputInFieldAddress();
        orderPageCustomerDetailsScooter.inputInFieldMetro();
        orderPageCustomerDetailsScooter.inputInFieldTelephone();
        orderPageCustomerDetailsScooter.clickButtonNext();
        //заполнение деталей заказа
        orderPageRentalDetailsScooter.inputInFieldDeliveryDate();
        orderPageRentalDetailsScooter.inputInFieldRentalPeriod();
        orderPageRentalDetailsScooter.clickCheckBoxScooterColor();
        orderPageRentalDetailsScooter.inputInFieldComment();
        orderPageRentalDetailsScooter.clickButtonOrderConfirmation();
        //проверка отображения модального окна "Заказ оформлен"
        assertTrue("Нет подтверждения заказа", orderPageRentalDetailsScooter.isVisibleModalWindowOrderProcessed());
    }

    @Test
    public void checkOrderScooterButtonBottom() {
        HomePageScooter homePageScooter = new HomePageScooter(driver);
        OrderPageCustomerDetailsScooter orderPageCustomerDetailsScooter = new OrderPageCustomerDetailsScooter(driver);
        OrderPageRentalDetailsScooter orderPageRentalDetailsScooter = new OrderPageRentalDetailsScooter(driver);

        homePageScooter.scrollForButtonOrderBottom();
        homePageScooter.clickButtonOrderBottom();
        //заполнение данных о заказчике
        orderPageCustomerDetailsScooter.inputInFieldName();
        orderPageCustomerDetailsScooter.inputInFieldSurname();
        orderPageCustomerDetailsScooter.inputInFieldAddress();
        orderPageCustomerDetailsScooter.inputInFieldMetro();
        orderPageCustomerDetailsScooter.inputInFieldTelephone();
        orderPageCustomerDetailsScooter.clickButtonNext();
        //заполнение деталей заказа
        orderPageRentalDetailsScooter.inputInFieldDeliveryDate();
        orderPageRentalDetailsScooter.inputInFieldRentalPeriod();
        orderPageRentalDetailsScooter.clickCheckBoxScooterColor();
        orderPageRentalDetailsScooter.inputInFieldComment();
        orderPageRentalDetailsScooter.clickButtonOrderConfirmation();
        //проверка отображения модального окна "Заказ оформлен"
        assertTrue("Нет подтверждения заказа", orderPageRentalDetailsScooter.isVisibleModalWindowOrderProcessed());
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }

}
