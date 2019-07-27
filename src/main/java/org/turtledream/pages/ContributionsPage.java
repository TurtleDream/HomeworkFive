package org.turtledream.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.turtledream.annotations.FieldName;

import java.util.List;

public class ContributionsPage extends BasePage {

    @FieldName(name = "Рубли")
    @FindBy(xpath = "//input[@value='RUB']//parent::label")
    public WebElement currency;

    @FieldName(name = "Сумма вклада")
    @FindBy(xpath = "//input[@name='amount']")
    public WebElement amount;

    @FieldName(name = "На срок")
    @FindBy(xpath = "//select[@name='period']")
    public WebElement period;

    @FieldName(name = "Ежемесячное пополнение")
    @FindBy(xpath = "//input[@name='replenish']")
    public WebElement replenish;

    @FieldName(name = "Ежемесячная капитализация")
    @FindBy(xpath = "//span[contains(text(), 'Ежемесячная капитализация')]")
    public WebElement capitalization;

    @FieldName(name = "Ставка")
    @FindBy(xpath = "//span[@class='js-calc-rate']")
    public WebElement rate;

    @FieldName(name = "К снятию")
    @FindBy(xpath = "//span[@class='js-calc-result']")
    public WebElement result;

    @FieldName(name = "Начислено")
    @FindBy(xpath = "//span[@class='js-calc-earned']")
    public WebElement accrued;

    @FieldName(name = "Пополнение")
    @FindBy(xpath = "//span[@class='js-calc-replenish']")
    public WebElement replenishment;

    @FieldName(name = "Частичное снятие")
    @FindBy(xpath = "//span[contains(text(), 'Частичное снятие')]")
    public WebElement withdrawal;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "org.turtledream.pages.ContributionsPage");
    }
}
