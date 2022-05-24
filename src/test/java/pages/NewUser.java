package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewUser {
    WebDriver navegador;

    public NewUser(WebDriver navegador) {
        this.navegador = navegador;
    }

    public NewUser typeEmailCreate(String emailCreate){
        navegador.findElement(By.xpath("//input[@id='email_create']")).sendKeys(emailCreate);
        return this;
    }

    public NewUserForm clickCreate(){
        navegador.findElement(By.xpath("//i[contains(@class, 'icon-user left')]")).click();
        return new NewUserForm(navegador);
    }
}


