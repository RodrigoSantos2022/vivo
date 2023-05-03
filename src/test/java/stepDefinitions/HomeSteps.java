package stepDefinitions;

import bean.action.HomePageAction;
import hooks.DriverLoading;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Quando;
import org.openqa.selenium.WebDriver;

public class HomeSteps {

    private static WebDriver driver;

    HomePageAction homePageAction = new HomePageAction();

    @Before
    public void setUp() {
        driver = DriverLoading.getDriver();
        driver.get("https://advantageonlineshopping.com/");
    }

    @After
    public void tearDown() {
        DriverLoading.closeDriver();
    }

    @Dado("que estou na page home")
    public void queEstouNaPageHome(){
        homePageAction.validarTextoAdvantageDemo();
    }

    @E("clico no menu Special Offer")
    public void clicoNoMenuSpecialOffer() throws InterruptedException {
        homePageAction.clicarMenuSpecialOffer();
    }

    @Quando("clico no botão See offer")
    public void clicoNoBotaoSeeOffer() {
        homePageAction.clicarBtnSeeOffer();
    }


    @E("Pesquiso o produto clicando no ícone de lupa")
    public void pesquisoOProdutoClicandoNoIconeDeLupa() {
        homePageAction.pesquisarProduto();
    }
}
