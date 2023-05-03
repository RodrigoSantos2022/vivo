package bean.pages;

import org.openqa.selenium.By;

public class HomePageElement {

    public final By textAdvantageDemo = By.xpath("//a[@role='link']/..//a[@ng-click='go_up()']");
    public final By menuSpecialOffer = By.xpath("//a[text()='SPECIAL OFFER']/..//a[@class='menu navLinks roboto-regular ng-scope']");
    public final By textSpecialOffer = By.xpath("//h3[text()='SPECIAL OFFER']/..//h3[@class='roboto-regular center ng-scope']");
    public final By btnSeeOffer = By.id("see_offer_btn");
    public final By menuCarrinho = By.id("menuCart");
    public final By menuPesquisar = By.id("menuSearch");
    public final By inputTexto = By.id("autoComplete");
    public final By imgLaptop = By.xpath("//p[text()='HP PAVILION 15Z TOUCH LAPTOP']/..//p[contains(@class,'roboto-regular ng-binding')]");




}
