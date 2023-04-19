package scooter.praktikum;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePageScooter;

import static constants.TestDataFaq.*;
import static org.junit.Assert.*;

public class TestHomeFaq {

    private static WebDriver driver;

    @BeforeClass
    public static void getHomePage() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        homePageScooter.clickButtonCookie();
        homePageScooter.scrollForFaqHomePage();
    }

    @Test
    public void checkTextAccordion() {
        HomePageScooter homePageScooter = new HomePageScooter(driver);
        String[] allFaq = new String[8];
        for (int i = 0; i < allFaq.length; i++) {
            allFaq[i] = homePageScooter.getTextAccordion(i);
        }
        assertArrayEquals("Текст не совпадает", allFaq, TEXT_FAQ);
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }
}
