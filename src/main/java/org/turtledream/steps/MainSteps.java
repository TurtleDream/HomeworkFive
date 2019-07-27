package org.turtledream.steps;

import cucumber.api.java.ru.Когда;
import org.turtledream.pages.MainPage;

public class MainSteps {

    MainPage mainPage = new MainPage();

    @Когда("Перейти в меню - Вклады")
    public void goToContributions () {
        mainPage.click(mainPage.сontributions);
    }
}
