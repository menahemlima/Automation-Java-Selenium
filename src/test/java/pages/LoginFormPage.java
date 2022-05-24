package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginFormPage{
    private WebDriver navegador;

    public LoginFormPage(WebDriver navegador) { // construtor recebe a instancia do navegador
        this.navegador = navegador;
    }

    public LoginFormPage typeLogin(String login){
        navegador.findElement(By.xpath("//input[@id='email']")).sendKeys(login);
        return this;
    }

    public LoginFormPage typePassword(String password){
        navegador.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
        return this;
    }

    public Buying clickSubmit(){
        navegador.findElement(By.xpath("//button[@id='SubmitLogin']")).click();
        return new Buying(navegador);
    }

}
