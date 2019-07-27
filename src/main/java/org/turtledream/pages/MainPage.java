package org.turtledream.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.turtledream.annotations.FieldName;

public class MainPage extends BasePage{

    @FieldName(name = "Вклады")
    @FindBy(xpath = "//div[@class='service__title']//child::div[contains(text(), 'Вклады')]//parent::div")
    public WebElement сontributions;

    @Override
    public WebElement getField(String name) throws Exception {
        return getField(name, "org.turtledream.pages.MainPage");
    }
}
