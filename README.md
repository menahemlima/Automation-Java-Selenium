# Automation practice - web tests

Foi desenvolvido dois cenários de testes de acordo com as instruções abaixo:

Desenvolva, uma automação de testes para o e-commerce: [automationpractice.com](http://automationpractice.com/).
O projeto deve conter, pelo menos, um cenário de teste para a seguinte História do Usuário:

## História do Usuário #1:
* Como um cliente cadastrado no [automationpractice.com](http://automationpractice.com/)
* Eu quero fazer a compra de ao menos três produtos
* Para que eu possa estar bem vestida

Os seguintes produtos do e-commerce devem ser utilizados, no tamanho e cor informada:
1. Printed Chiffon Dress na cor verde e tamanho "M"
2. Faded Short Sleeve T-shirts na cor azul
3. Blouse na quantidade 2
4. Printed Dress

Cenário Bônus: Desenvolva um novo cenário para a anteriormente citada no qual é realizado o cadastro de um novo usuário.

## Planejamento dos testes

### Ferramentas utilizadas

As ferramentas utilizadas foram:
1. Intellij IDE.
2. Linguagem de programação JAVA.
3. Selenium Webdriver, Cucumber, Maven e JUnit.
4. Foi utilizado o padrão de projetos Page Objects.


### Cenários para automação

Após o levantamento das prioridades de testes foi realizado um mapa mental dos fluxos do sistema

**CA1 - Cliente já cadastrado consegue comprar 4 produtos**
* **DADO**: um cliente;
* **QUANDO** o cliente já estiver com seus dados cadastrados;
* **ENTÃO** o cliente é capaz de comprar 4 produtos no site;
* **E** finaliza o pedido de compra;
* **E** redireciona o cliente para tela de pagamento.

**CA2 - Cliente não cadastrado no site**
* **DADO**: um cliente;
* **QUANDO** o cliente não possui nenhum cadastro com email informado;
* **ENTÃO** o cliente é capaz de informar seus dados pessoais;
* **E** submete um novo cadastro;
* **E** redireciona o cliente para a página My account.


## Resultado dos testes

Todos os testes que cobertos foram: **PASSED**.

Os resultados esperados estão de acordo com o que foi planejado.

**Web:** Executar > (web/src/test/tests/RunnerTests.java)
