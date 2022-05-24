package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Buying{

    WebDriver navegador;

    public Buying(WebDriver navegador) {
        this.navegador = navegador;
    }

    public Buying clickDresses() {
        navegador.findElement(By.xpath("//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']")).click();
        return this;
    }

    public Buying clickSummerDresses() {
        navegador.findElement(By.linkText("SUMMER DRESSES")).click();
        return this;
    }

    public Buying clickChiffon() {
        navegador.findElement(By.linkText("Printed Chiffon Dress")).click();
        return this;
    }

    public Buying clickSizeM() {
        navegador.findElement(By.xpath("//select[@id='group_1']/option[2]")).click();
        return this;
    }

    public Buying clickColorGreen() {
        navegador.findElement(By.xpath("//*[@name='Green']")).click();
        return this;
    }

    public Buying clickAdd() {
        navegador.findElement(By.xpath("//button[@name='Submit']")).click();
        return this;
    }

    public Buying clickContinue() {
        navegador.findElement(By.xpath("//span[@title='Continue shopping']/span")).click();
        return this;
    }

    public Buying clickWomen() {
        navegador.findElement(By.xpath("//div[@id='block_top_menu']/ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Women']")).click();
        return this;
    }

    public Buying clickFaded() {
        navegador.findElement(By.linkText("Faded Short Sleeve T-shirts")).click();
        return this;
    }

    public Buying clickColorBlue() {
        navegador.findElement(By.xpath("//*[@name='Blue']")).click();
        return this;
    }

    public Buying clickBlouse() {
        navegador.findElement(By.linkText("Blouse")).click();
        return this;
    }

    public Buying clickQuantity() {
        navegador.findElement(By.xpath("//i[contains(@class, 'icon-plus')]")).click();
        return this;
    }

    public Buying clickPrintedDress() {
        navegador.findElement(By.linkText("Printed Dress")).click();
        return this;
    }

    public Buying clickCheckout() {
        navegador.findElement(By.linkText("Proceed to checkout")).click();
        return this;
    }

    public Buying clickProcessAddress() {
        navegador.findElement(By.xpath("//*[@name='processAddress']")).click();
        return this;
    }

    public Buying clickProcessCarrier() {
        navegador.findElement(By.xpath("//*[@name='processCarrier']")).click();
        return this;
    }

    public Buying clickTerms() {
        navegador.findElement(By.xpath("//input[@name='cgv']")).click();
        return this;
    }



}
