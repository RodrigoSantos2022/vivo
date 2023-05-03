package stepDefinitions;

import bean.action.HomePageAction;
import bean.action.ProdutoPageAction;
import hooks.DriverLoading;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class ProdutoSteps {

    private static WebDriver driver;

    HomePageAction homePageAction = new HomePageAction();
    ProdutoPageAction produtoPageAction = new ProdutoPageAction();

    @Before
    public void setUp() {
        driver = DriverLoading.getDriver();
        driver.get("https://advantageonlineshopping.com/");
    }

    @After
    public void tearDown() {
        DriverLoading.closeDriver();
    }

    @Então("valido as especificações do produto")
    public void validoAsEspecificacoesDoProduto() {
        produtoPageAction.verificarEspecificacoes();
    }

    @E("altero a cor do produto")
    public void alteroACorDoProduto() {
        produtoPageAction.alterarCorProduto();

    }
    @E("altero a cor do produto diferente do bando de dados")
    public void alteroACorDoProdutoDiferenteDoBancoDeDados() {
        produtoPageAction.alterarCorProdutoDifBancoDados();

    }

    @Quando("clico no botão Add to cart")
    public void clicoNoBotãoAddToCart() {
        produtoPageAction.clicarBtnAddToCart();
    }

    @E("acesso o carrinho de compras")
    public void acessoOCarrinhoDeCompras(){
        homePageAction.clicarMenuCarrinho();
    }


    @E("altero a quantidade do produto")
    public void alteroAQuantidadeDoProduto() {
        produtoPageAction.alterarQuantidadeProduto();

    }

    @Então("realizo um update no banco de dados ao alterar a cor existente no banco para a cor selecionada no teste")
    public void realizoUmUpdateNoBancoDeDadosAoAlterarACorExistenteNoBancoParaACorSelecionadaNoTeste(){
        produtoPageAction.updateBancoColor();
    }

    @Então("valido que produto foi adicionado ao carrinho com a cor selecionada")
    public void validoQueProdutoFoiAdicionadoAoCarrinhoComACorSelecionada() {
        produtoPageAction.validarNomeProduto();
        produtoPageAction.verificarCorProduto();
    }
}
