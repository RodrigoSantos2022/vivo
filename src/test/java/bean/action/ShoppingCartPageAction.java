package bean.action;

import bean.dsl.Commands;
import bean.pages.ShoppingCartPageElement;
import com.rafaffs.dados.model.Bdd_massas;
import com.rafaffs.dados.model.ConexaoBancoDados;



import java.util.List;

import static org.junit.Assert.assertEquals;

public class ShoppingCartPageAction extends Commands {

    ShoppingCartPageElement shoppingCartPageElement = new ShoppingCartPageElement();


    public void verificarCorProduto() {
        ConexaoBancoDados conexao = new ConexaoBancoDados();
        conexao.conectar();

        List<Bdd_massas> massasList = conexao.buscarMassas();

        try {
            Thread.sleep(3000);
            System.out.println("Exp" + massasList.get(0).getCOLOR());
            System.out.println("Atual" + getTextFromLabel(shoppingCartPageElement.corProduto));
            assertEquals(massasList.get(0).getCOLOR(), getTextFromLabel(shoppingCartPageElement.corProduto));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        conexao.fecharConexao();
    }



    public void removerProduto(){
        isVisible(shoppingCartPageElement.linkRemove);
        click(shoppingCartPageElement.linkRemove);
    }

    public void validarCarrinhoVazio(){
        isVisible(shoppingCartPageElement.txtCarrinhoVazio);
    }

    public void validarValorTotalDoCarrinho(){
        isVisible(shoppingCartPageElement.txtValorSomaTotal);
        assertEquals(getTextFromLabel(shoppingCartPageElement.txtValorSomaTotal),"$899.98");
    }

}

