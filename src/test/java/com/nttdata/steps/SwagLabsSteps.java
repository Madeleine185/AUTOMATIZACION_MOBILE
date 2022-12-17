package com.nttdata.steps;

import com.nttdata.screens.LoginScreen;
import com.nttdata.screens.MainScreen;
import net.thucydides.core.annotations.Step;

public class SwagLabsSteps {

    LoginScreen loginScreen;
    MainScreen mainScreen;

    @Step("logearse")
    public void login(String Usuario, String Password){
        loginScreen.userLogin(Usuario,Password);
    }

    @Step("compara el titulo")
    public String getValidTitle(){
        return mainScreen.validateTitle();
    }
    @Step("valida el primer elemento")
    public String getValidFirstItem(){
        return mainScreen.validateFristItem();
    }
}
