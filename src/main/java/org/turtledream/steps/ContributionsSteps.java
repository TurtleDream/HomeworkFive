package org.turtledream.steps;

import cucumber.api.java.ru.Когда;
import org.openqa.selenium.support.ui.Select;
import org.turtledream.pages.ContributionsPage;

public class ContributionsSteps {

    ContributionsPage contributionsPage = null;

    @Когда("Страница 'Вклады' загружена")
    public void pageLoaded() throws Exception {
        contributionsPage = new ContributionsPage();
    }

    @Когда("Нажатие на \"(.*)\"")
    public void click(String name) throws Exception {
        contributionsPage.click(name);
    }

    @Когда("Выбрать период \"(.*)\"")
    public void selectCurrency(String currencyName) throws Exception {
        Select select = new Select(contributionsPage.period);
        select.selectByVisibleText(currencyName);
    }

    @Когда("Заполнить поле \"(.*)\" значением \"(.*)\"")
    public void fillField(String name, String value) throws Exception {
        contributionsPage.fillField(name, value);
    }

    @Когда("Проверка значения \"(.*)\" в поле \"(.*)\"")
    public void checkText(String value, String name) throws Exception {
        Thread.sleep(1000);
        contributionsPage.checkText(contributionsPage.getField(name), value);
    }
}
