package bean.pages;

import org.openqa.selenium.By;

public class ProdutoPageElement {

    public final By nomeProduto = By.xpath("//h3[text()='HP PAVILION 15Z TOUCH LAPTOP']/..//h3[contains(@class,'ng-binding')]");
    public final By customizacaoProduto = By.xpath("//label[@class='value ng-binding'][contains(.,'Simplicity')]");
    public final By displayProduto = By.xpath("//label[text()='DISPLAY']/..//label[contains(@class,'value ng-binding')]");
    public final By displayTamanhoProduto = By.xpath("//label[text()='DISPLAY RESOLUTION']/..//label[contains(@class,'value ng-binding')]");
    public final By memoriaProduto = By.xpath("//label[text()='MEMORY']/..//label[contains(@class,'value ng-binding')]");
    public final By sistemaOperacionalProduto = By.xpath("//label[text()='OPERATING SYSTEM']/..//label[contains(@class,'value ng-binding')]");
    public final By processadorProduto = By.xpath("//label[text()='PROCESSOR']/..//label[contains(@class,'value ng-binding')]");
    public final By touchScreenProduto = By.xpath("//label[text()='TOUCHSCREEN']/..//label[contains(@class,'value ng-binding')]");
    public final By pesoProduto = By.xpath("//label[text()='WEIGHT']/..//label[contains(@class,'value ng-binding')]");
    public final By seletorCorProduto = By.xpath("//span[@CLASS='bunny productColor ng-scope GRAY']");
    public final By txtCorProduto = By.xpath("//span[text()='GRAY']/..//span[@class='ng-binding']");
    public final By btnAddToCart = By.xpath("//button[@name='save_to_cart']");
    public final By btnCarrinho = By.id("shoppingCartLink");
    public final By displayResolucao = By.xpath("//label[text()='DISPLAY RESOLUTION']/..//label[contains(@class,'value ng-binding')]");
    public final By btnMais = By.xpath("//div[@class='plus']");
    public final By corProdutoRed = By.xpath("//span[@CLASS='bunny productColor ng-scope RED']");
}
