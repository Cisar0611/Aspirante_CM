package com.co.choucair.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class ValidateErrorMessageTask implements Task {

    @Override
    public <T extends Actor> void performAs(T actor){

    }

    public static String displayed(){
        return new
                ValidateErrorMessageTask();
    }
}
