package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.junit.*;
import org.openqa.selenium.WebDriver;
import pages.*;

import java.net.MalformedURLException;

public class BddSteps{
    WebDriver navegador;
    Login login;
    LoginFormPage loginform;
    NewUser user;
    NewUserForm form;
    Buying buying;

    @Before
    public void Before() throws Exception, MalformedURLException {
        navegador = Web.createChrome();

        login = new Login(navegador);
        loginform = new LoginFormPage(navegador);
        user = new NewUser(navegador);
        form = new NewUserForm(navegador);
        buying = new Buying(navegador);
        
    }

    @Dado("que o cliente tenha acessado o site de compras")
    public void que_o_cliente_tenha_acessado_o_site_de_compras() {
        login.clickSignIn();
    }


    @Quando("o cliente desejar criar um cadastro no site")
    public void o_cliente_desejar_criar_um_cadastro_no_site() {
        user.typeEmailCreate("emailteste1111@email.com");
        user.clickCreate();
    }


    @Então("o cliente deve inserir todos as informações cadastrais")
    public void o_cliente_deve_inserir_todos_as_informações_cadastrais() {
        form.clickGender();
        form.typeFirstName("Teste");
        form.typeLastName("Renner");
        form.typePassword("123456");
        form.clickDay();
        form.clickMonth();
        form.clickYear();
        form.clickNews();
        form.clickSpecial();
        form.typeCompany("Triplo X");
        form.typeAddress1("Saint Mary Avenue, 555");
        form.typeAddress2("Next Angel's Hotel");
        form.typeCity("New Jersey");
        form.clickState();
        form.typePostCode("88888");
        form.clickCountry();
        form.typeInformation("The best shopping store in recent times.");
        form.typePhone("99999-8888");
        form.typeMobile("11111-0000");
        form.typeAssign("Tested by Lima");

    }
    @Então("o cliente deve ser cadastrado com sucesso")
    public void o_cliente_deve_ser_cadastrado_com_sucesso() {
        form.clickSubmitAccount();
        Assert.assertEquals("My account - My Store", navegador.getTitle());
    }

    @Dado("que o cliente tenha logado no site")
    public void que_o_cliente_tenha_logado_no_site() {
        login.clickSignIn();
        loginform.typeLogin("teste1234@email.com");
        loginform.typePassword("123456");
        loginform.clickSubmit();
    }
    @Quando("adicionar na sacola de compras os quatro produtos")
    public void adicionar_na_sacola_de_compras_os_quatro_produtos() {
        buying.clickDresses();
        buying.clickSummerDresses();
        buying.clickChiffon();
        buying.clickSizeM();
        buying.clickColorGreen();
        buying.clickAdd();
        buying.clickContinue();
        buying.clickWomen();
        buying.clickFaded();
        buying.clickColorBlue();
        buying.clickAdd();
        buying.clickContinue();
        buying.clickWomen();
        buying.clickBlouse();
        buying.clickQuantity();
        buying.clickAdd();
        buying.clickWomen();
        buying.clickPrintedDress();
        buying.clickAdd();
    }

    @Quando("as informações de pagamento são inseridas")
    public void as_informações_de_pagamento_são_inseridas() {
        buying.clickCheckout();
        buying.clickCheckout();
        buying.clickProcessAddress();
        buying.clickTerms();
        buying.clickProcessCarrier();
    }

    @Então("a compra pode ser finalizada com sucesso")
    public void a_compra_pode_ser_finalizada_com_sucesso() {
        Assert.assertEquals("Order - My Store", navegador.getTitle());

    }

    @After
    public void tearDown(){
        navegador.close();
    }
}
