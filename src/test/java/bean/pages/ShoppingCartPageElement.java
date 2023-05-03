package bean.pages;

import org.openqa.selenium.By;

public class ShoppingCartPageElement {

    public final By corProduto = By.xpath("//span[@class='ng-binding']");
    public final By linkRemove = By.xpath("//a[@class='remove red ng-scope']");
    public final By txtCarrinhoVazio = By.xpath("//label[@class='roboto-bold ng-scope'][contains(.,'Your shopping cart is empty')]");
    public final By txtValorSomaTotal = By.xpath("//span[text()='$899.98']/..//span[contains(@class, 'roboto-medium ng-binding')]");
}
