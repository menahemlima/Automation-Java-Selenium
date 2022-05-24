package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login{

    WebDriver navegador;

    public Login(WebDriver navegador) {

        this.navegador = navegador;
    }

    public LoginFormPage clickSignIn() {
        navegador.findElement(By.linkText("Sign in")).click();

        return new LoginFormPage(navegador);
    }

}
