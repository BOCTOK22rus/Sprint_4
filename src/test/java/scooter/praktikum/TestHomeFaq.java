package scooter.praktikum;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import pages.HomePageFaqScooter;
import pages.HomePageScooter;

import static org.junit.Assert.assertEquals;

public class TestHomeFaq {

    private static WebDriver driver;

    @BeforeClass
    public static void getHomePage() {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://qa-scooter.praktikum-services.ru/");

        HomePageScooter homePageScooter = new HomePageScooter(driver);
        HomePageFaqScooter homePageFaqScooter = new HomePageFaqScooter(driver);
        homePageScooter.clickButtonCookie();
        homePageFaqScooter.scrollForFaqHomePage();
    }

    @Test
    public void checkTextAccordion0() {
        HomePageFaqScooter homePageFaqScooter = new HomePageFaqScooter(driver);

        String expectedTextOfFaq = homePageFaqScooter.getTextAccordion0();
        String actualTextOfFaq = "Сутки — 400 рублей. Оплата курьеру — наличными или картой.";

        assertEquals("Текст не совпадает", expectedTextOfFaq, actualTextOfFaq);
    }

    @Test
    public void checkTextAccordion1() {
        HomePageFaqScooter homePageFaqScooter = new HomePageFaqScooter(driver);

        String expectedTextOfFaq = homePageFaqScooter.getTextAccordion1();
        String actualTextOfFaq = "Пока что у нас так: один заказ — один самокат. Если хотите покататься с друзьями, можете просто сделать несколько заказов — один за другим.";

        assertEquals("Текст не совпадает", expectedTextOfFaq, actualTextOfFaq);
    }

    @Test
    public void checkTextAccordion2() {
        HomePageFaqScooter homePageFaqScooter = new HomePageFaqScooter(driver);

        String expectedTextOfFaq = homePageFaqScooter.getTextAccordion2();
        String actualTextOfFaq = "Допустим, вы оформляете заказ на 8 мая. Мы привозим самокат 8 мая в течение дня. Отсчёт времени аренды начинается с момента, когда вы оплатите заказ курьеру. Если мы привезли самокат 8 мая в 20:30, суточная аренда закончится 9 мая в 20:30.";

        assertEquals("Текст не совпадает", expectedTextOfFaq, actualTextOfFaq);
    }

    @Test
    public void checkTextAccordion3() {
        HomePageFaqScooter homePageFaqScooter = new HomePageFaqScooter(driver);

        String expectedTextOfFaq = homePageFaqScooter.getTextAccordion3();
        String actualTextOfFaq = "Только начиная с завтрашнего дня. Но скоро станем расторопнее.";

        assertEquals("Текст не совпадает", expectedTextOfFaq, actualTextOfFaq);
    }

    @Test
    public void checkTextAccordion4() {
        HomePageFaqScooter homePageFaqScooter = new HomePageFaqScooter(driver);

        String expectedTextOfFaq = homePageFaqScooter.getTextAccordion4();
        String actualTextOfFaq = "Пока что нет! Но если что-то срочное — всегда можно позвонить в поддержку по красивому номеру 1010.";

        assertEquals("Текст не совпадает", expectedTextOfFaq, actualTextOfFaq);
    }

    @Test
    public void checkTextAccordion5() {
        HomePageFaqScooter homePageFaqScooter = new HomePageFaqScooter(driver);

        String expectedTextOfFaq = homePageFaqScooter.getTextAccordion5();
        String actualTextOfFaq = "Самокат приезжает к вам с полной зарядкой. Этого хватает на восемь суток — даже если будете кататься без передышек и во сне. Зарядка не понадобится.";

        assertEquals("Текст не совпадает", expectedTextOfFaq, actualTextOfFaq);
    }

    @Test
    public void checkTextAccordion6() {
        HomePageFaqScooter homePageFaqScooter = new HomePageFaqScooter(driver);

        String expectedTextOfFaq = homePageFaqScooter.getTextAccordion6();
        String actualTextOfFaq = "Да, пока самокат не привезли. Штрафа не будет, объяснительной записки тоже не попросим. Все же свои.";

        assertEquals("Текст не совпадает", expectedTextOfFaq, actualTextOfFaq);
    }

    @Test
    public void checkTextAccordion7() {
        HomePageFaqScooter homePageFaqScooter = new HomePageFaqScooter(driver);

        String expectedTextOfFaq = homePageFaqScooter.getTextAccordion7();
        String actualTextOfFaq = "Да, обязательно. Всем самокатов! И Москве, и Московской области.";

        assertEquals("Текст не совпадает", expectedTextOfFaq, actualTextOfFaq);
    }

    @AfterClass
    public static void closeBrowser() {
        driver.quit();
    }
}
