package com.nttdata.screens;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;
public class MainScreen extends PageObject {

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Cart drop zone\"]/android.view.ViewGroup/android.widget.TextView")
    private WebElement title;

    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc=\"test-Item title\"])[1]")
    private WebElement firstItem;

    public String validateTitle(){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return title.getText();
    }
    public String validateFristItem(){
        getDriver().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        return firstItem.getText();
    }
}
