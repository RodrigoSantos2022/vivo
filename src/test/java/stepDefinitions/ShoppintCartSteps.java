package stepDefinitions;

import bean.action.ShoppingCartPageAction;
import hooks.DriverLoading;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Então;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class ShoppintCartSteps {

    private static WebDriver driver;

    ShoppingCartPageAction shoppingCartPageAction = new ShoppingCartPageAction();


    @Before
    public void setUp() {
        driver = DriverLoading.getDriver();
        driver.get("https://advantageonlineshopping.com/");
    }

    @After
    public void tearDown() {
        DriverLoading.closeDriver();
    }

    @Quando("removo o produto do carrinho de compras")
    public void removoOProdutoDoCarrinhoDeCompras(){
        shoppingCartPageAction.removerProduto();

    }

    @Então("valido que o carrinho esta vazio")
    public void validoQueOCarrinhoEstaVazio(){
        shoppingCartPageAction.validarCarrinhoVazio();
    }

    @Então("valido o valor total do carrinho")
    public void validoOValorTotalDoCarrinho() {
        shoppingCartPageAction.validarValorTotalDoCarrinho();

    }
}
