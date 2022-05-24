#language: pt
  Funcionalidade: Cadastrar novo cliente
    Cenário: Cadastrar um novo cliente no site Automation Practice
      Dado que o cliente tenha acessado o site de compras
      Quando o cliente desejar criar um cadastro no site
      Então o cliente deve inserir todos as informações cadastrais
      E o cliente deve ser cadastrado com sucesso


    Cenário: Simular compra quatro produtos
      Dado que o cliente tenha logado no site
      Quando adicionar na sacola de compras os quatro produtos
      E as informações de pagamento são inseridas
      Então a compra pode ser finalizada com sucesso