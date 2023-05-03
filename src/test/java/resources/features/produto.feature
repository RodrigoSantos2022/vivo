# language: pt
  @Regressivo
Funcionalidade: Validar as funcionalidades do site https://advantageonlineshopping.com/
  Como cliente do site
  Quero acessar o menu Special Offer
  Para validar suas funcionalidades


  Contexto:
    Dado que estou na page home

  @CT01
  Cenario: [Special Offer] Validar especificações do produto
    E clico no menu Special Offer
    Quando clico no botão See offer
    Então valido as especificações do produto

  @CT02
  Cenario: [Special Offer] Validar alteração de cor do produto no carrinho
    E clico no menu Special Offer
    E clico no botão See offer
    E altero a cor do produto
    Quando clico no botão Add to cart
    Então valido que produto foi adicionado ao carrinho com a cor selecionada

  @CT03
  Cenario: [Checkout] Validar página de checkout
    E Pesquiso o produto clicando no ícone de lupa
    E altero a cor do produto diferente do bando de dados
    E altero a quantidade do produto
    E clico no botão Add to cart
    Quando acesso o carrinho de compras
    E valido o valor total do carrinho
    Então realizo um update no banco de dados ao alterar a cor existente no banco para a cor selecionada no teste

  @CT04
  Cenario: [Carrinho] Remover produto do carrinho de compras
    E clico no menu Special Offer
    E clico no botão See offer
    E clico no botão Add to cart
    E acesso o carrinho de compras
    Quando removo o produto do carrinho de compras
    Então valido que o carrinho esta vazio