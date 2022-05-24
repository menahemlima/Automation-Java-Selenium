package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class Web {
    public static WebDriver createChrome() throws Exception, MalformedURLException {
        System.setProperty("webdriver.chrome.driver", "/Users/menahem.lima/chromedriver/chromedriver");
        WebDriver navegador = new ChromeDriver();
        navegador.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        navegador.get("http://automationpractice.com/");
        navegador.manage().window().maximize();

        return navegador;

    }
}
