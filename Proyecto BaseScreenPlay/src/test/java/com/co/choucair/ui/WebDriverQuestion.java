package com.co.choucair.ui;

import net.serenitybdd.screenplay.Question;
import org.openqa.selenium.WebDriver;
import net.serenitybdd.screenplay.Actor;

public class WebDriverQuestion{

    public static Question<String> aboutTittle(){
        return actor -> {
            WebDriver driver = actor.usingTheBrowser().getDriver();
            return driver.getTitle();
        };
    }
}




