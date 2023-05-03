package bean.action;

import bean.dsl.Commands;
import bean.pages.HomePageElement;
import com.rafaffs.dados.model.Bdd_massas;
import com.rafaffs.dados.model.ConexaoBancoDados;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HomePageAction extends Commands {

    HomePageElement homePageElement = new HomePageElement();

    public void validarTextoAdvantageDemo() {
        isVisible(homePageElement.textAdvantageDemo);
    }

    public void clicarMenuSpecialOffer() throws InterruptedException {
        Thread.sleep(3000);
        isVisible(homePageElement.menuSpecialOffer);
        click(homePageElement.menuSpecialOffer);
    }

    public void validarTextoSpecialOffer() {
        isVisible(homePageElement.textSpecialOffer);
    }

    public void clicarBtnSeeOffer() {
        waitElement(homePageElement.btnSeeOffer);
        isVisible(homePageElement.btnSeeOffer);
        click(homePageElement.btnSeeOffer);
    }

    public void clicarMenuCarrinho(){
        isVisible(homePageElement.menuCarrinho);
        click(homePageElement.menuCarrinho);
    }


    public void pesquisarProduto(){
        ConexaoBancoDados conexao = new ConexaoBancoDados();
        conexao.conectar();

        List<Bdd_massas> massasList = conexao.buscarMassas();

        try {
            Thread.sleep(3000);
            isVisible(homePageElement.menuPesquisar);
            click(homePageElement.menuPesquisar);
            isVisible(homePageElement.inputTexto);
            String expected = massasList.get(0).setNAME_PRODUCT("HP PAVILION 15Z TOUCH");
            WebElement element = getDriver().findElement(By.id("autoComplete"));
            element.sendKeys(expected);
            click(homePageElement.imgLaptop);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
