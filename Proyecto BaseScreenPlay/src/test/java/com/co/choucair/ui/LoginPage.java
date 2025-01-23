package com.co.choucair.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target USERNAME_FIELD = Target.the("usernamefield")
            .located(By.id("txtUsername"));
    public static final Target PASSWORD_FIELD = Target.the("passwordfield")
            .located(By.id("txtPassword"));
    public static final Target LOGIN_BUTTON = Target.the("login button")
            .located(By.id("btnLogin"));
}

