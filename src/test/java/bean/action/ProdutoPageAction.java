package bean.action;

import bean.dsl.Commands;
import bean.pages.ProdutoPageElement;
import com.rafaffs.dados.model.Bdd_massas;
import com.rafaffs.dados.model.ConexaoBancoDados;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import java.util.List;

import static org.junit.Assert.assertEquals;

public class ProdutoPageAction extends Commands {

    ProdutoPageElement produtoPageElement = new ProdutoPageElement();

    public void nomeProduto() {
        isVisible(produtoPageElement.nomeProduto);
    }

    public void verificarEspecificacoes() {
        ConexaoBancoDados conexao = new ConexaoBancoDados();
        conexao.conectar();

        List<Bdd_massas> massasList = conexao.buscarMassas();

        try {
            Thread.sleep(3000);
            assertEquals(massasList.get(0).getCUSTOMIZATION(), getTextFromLabel(produtoPageElement.customizacaoProduto));
            assertEquals(massasList.get(0).getDISPLAY().replace("\n"," "), getTextFromLabel(produtoPageElement.displayProduto));
            assertEquals(massasList.get(0).getDISPLAY_RESOLUTION(), getTextFromLabel(produtoPageElement.displayResolucao));
            assertEquals(massasList.get(0).getMEMORY(), getTextFromLabel(produtoPageElement.memoriaProduto));
            assertEquals(massasList.get(0).getOPERATING_SYSTEM(), getTextFromLabel(produtoPageElement.sistemaOperacionalProduto));
            assertEquals(massasList.get(0).getPROCESSOR().replace("\n",""), getTextFromLabel(produtoPageElement.processadorProduto));
            assertEquals(massasList.get(0).getTOUCHSCREEN(), getTextFromLabel(produtoPageElement.touchScreenProduto));
            assertEquals(massasList.get(0).getWEIGHT(), getTextFromLabel(produtoPageElement.pesoProduto));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        conexao.fecharConexao();
    }

    public void alterarCorProduto(){
        isVisible(produtoPageElement.seletorCorProduto);
        WebElement corProdutoTitulo = getDriver().findElement(produtoPageElement.seletorCorProduto);
        String cor = corProdutoTitulo.getAttribute("title");
        click(By.xpath("//span[@id='bunny'][@title='"+cor+"']"));
    }

    public void alterarCorProdutoDifBancoDados(){
        isVisible(produtoPageElement.seletorCorProduto);
        WebElement corProdutoTitulo = getDriver().findElement(produtoPageElement.corProdutoRed);
        String cor = corProdutoTitulo.getAttribute("title");
        click(By.xpath("//span[@id='bunny'][@title='"+cor+"']"));
    }

    public void alterarQuantidadeProduto(){
        isVisible(produtoPageElement.btnMais);
        click(produtoPageElement.btnMais);
    }

    public void clicarBtnAddToCart(){
        isVisible(produtoPageElement.btnAddToCart);
        click(produtoPageElement.btnAddToCart);
    }

    public void updateBancoColor(){
        ConexaoBancoDados conexao = new ConexaoBancoDados();
        conexao.conectar();

        List<Bdd_massas> massasList = conexao.buscarMassas();

        try {
            Thread.sleep(3000);
            String color = "RED";
            System.out.println(color);
            massasList.get(0).setCOLOR(color);
            System.out.println(massasList.get(0).getCOLOR());
            System.out.println("Cor Alterada Com Suecesso!!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        conexao.fecharConexao();
    }

    public void validarNomeProduto() {
        isVisible(produtoPageElement.nomeProduto);
    }

    public void verificarCorProduto() {
        ConexaoBancoDados conexao = new ConexaoBancoDados();
        conexao.conectar();

        List<Bdd_massas> massasList = conexao.buscarMassas();

        try {
            Thread.sleep(3000);
            assertEquals(massasList.get(0).getCOLOR(), getTextFromLabel(produtoPageElement.txtCorProduto));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        conexao.fecharConexao();
    }

}
