package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NewUserForm {
    WebDriver navegador;

    public NewUserForm(WebDriver navegador) {
        this.navegador = navegador;
        }

    public NewUserForm typeFirstName(String firstName) {
        navegador.findElement(By.xpath("//*[@name='customer_firstname']")).sendKeys(firstName);
        return this;
    }

    public NewUserForm typeLastName(String lastName) {
        navegador.findElement(By.xpath("//*[@name='customer_lastname']")).sendKeys(lastName);
        return this;
    }

    public NewUserForm typePassword(String password) {
        navegador.findElement(By.xpath("//input[@id='passwd']")).sendKeys(password);
        return this;
    }

    public NewUserForm typeCompany(String company) {
        navegador.findElement(By.xpath("//input[@id='company']")).sendKeys(company);
        return this;
    }

    public NewUserForm typeAddress1(String address1) {
        navegador.findElement(By.xpath("//input[@id='address1']")).sendKeys(address1);
        return this;
    }

    public NewUserForm typeAddress2(String address2) {
        navegador.findElement(By.xpath("//input[@id='address2']")).sendKeys(address2);
        return this;
    }

    public NewUserForm typeCity(String city) {
        navegador.findElement(By.xpath("//input[@id='city']")).sendKeys(city);
        return this;
    }

    public NewUserForm typePostCode(String postCode) {
        navegador.findElement(By.xpath("//input[@id='postcode']")).sendKeys(postCode);
        return this;
    }

    public NewUserForm typeInformation(String information) {
        navegador.findElement(By.xpath("//*[@id='other']")).sendKeys(information);
        return this;
    }

    public NewUserForm typePhone(String phone) {
        navegador.findElement(By.xpath("//input[@id='phone']")).sendKeys(phone);
        return this;
    }

    public NewUserForm typeMobile(String mobile) {
        navegador.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys(mobile);
        return this;
    }

    public NewUserForm typeAssign(String assign) {
        navegador.findElement(By.xpath("//input[@id='alias']")).clear();
        navegador.findElement(By.xpath("//input[@id='alias']")).sendKeys(assign);
        return this;
    }
    public NewUserForm clickState() {
        navegador.findElement(By.xpath("//select[@id='id_state']/option[3]")).click();
        return this;
    }

    public NewUserForm clickCountry() {
        navegador.findElement(By.xpath("//select[@id='id_country']/option[2]")).click();
        return this;
    }

    public NewUserForm clickGender() {
        navegador.findElement(By.xpath("//input[@id='id_gender1']")).click();
        return this;
    }

    public NewUserForm clickDay() {
        navegador.findElement(By.xpath("//select[@id='days']/option[14]")).click();
        return this;
    }

    public NewUserForm clickMonth() {
        navegador.findElement(By.xpath("//select[@id='months']/option[9]")).click();
        return this;
    }

    public NewUserForm clickYear() {
        navegador.findElement(By.xpath("//select[@id='years']/option[37]")).click();
        return this;
    }

    public NewUserForm clickNews() {
        navegador.findElement(By.xpath("//*[@name='newsletter']")).click();
        return this;
    }
    public NewUserForm clickSpecial() {
        navegador.findElement(By.xpath("//*[@name='optin']")).click();
        return this;
    }

    public NewUserForm clickSubmitAccount(){
        navegador.findElement(By.xpath("//button[@name='submitAccount']")).click();
        return this;
    }

}
