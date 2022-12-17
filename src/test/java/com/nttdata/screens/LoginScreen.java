package com.nttdata.screens;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class
LoginScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private WebElement txtUsuario;

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private WebElement txtPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private WebElement btnLogin;


    public void clickClose(){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        //btnClose.click();
    }



    public void userLogin(String usuario,String password){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        txtUsuario.sendKeys(usuario);
        txtPassword.sendKeys(password);
        btnLogin.click();
    }





}
