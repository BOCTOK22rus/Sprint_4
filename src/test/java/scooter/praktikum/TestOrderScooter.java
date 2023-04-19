package scooter.praktikum;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePageScooter;
import pages.OrderPageCustomerDetailsScooter;
import pages.OrderPageRentalDetailsScooter;

import static junit.framework.Assert.assertTrue;

@RunWith(Parameterized.class)
public class TestOrderScooter {

    private WebDriver driver;

    private final int iteration;

    public TestOrderScooter(int iteration) {
        this.iteration = iteration;
    }

    @Parameterized.Parameters
    public static Object[][] getIteration() {
        return new Object[][] {
                {0},
                {1},
        };
    }

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
        homePageScooter.clickButtonOrder(iteration);
        orderPageCustomerDetailsScooter.customerDataEntry();
        orderPageCustomerDetailsScooter.clickButtonNext();
        orderPageRentalDetailsScooter.orderDataEntry(iteration);
        assertTrue("Нет подтверждения заказа", orderPageRentalDetailsScooter.isVisibleModalWindowOrderProcessed());
    }

    @After
    public void closeBrowser() {
        driver.quit();
    }
}
