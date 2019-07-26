package org.turtledream.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.turtledream.annotations.FieldName;
import org.turtledream.annotations.TitleName;

import java.util.List;

@TitleName(name = "Вклады")
public class ContributionsPage extends BasePage {


    @FindBy(xpath = "//div[contains(@class,'currency-content')]")
    public List<WebElement> currency;

    @FieldName(name = "Сумма вклада")
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amount;

    @FieldName(name = "На срок")
    @FindBy(xpath = "//select[@name='period']")
    public WebElement period;

    @FieldName(name = "Ежемесячное пополнение")
    @FindBy(xpath = "//input[@name='replenish']")
    public WebElement replenish;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "org.turtledream.pages.MainPage");
    }
}
