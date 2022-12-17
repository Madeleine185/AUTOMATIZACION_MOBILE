package com.nttdata.stepsdefinitions;

import com.nttdata.steps.SwagLabsSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

public class swaglabsStepsDefs {
    @Steps
    SwagLabsSteps swagLabsSteps;

    @Given("accedo a la aplicacion")
    public void accedoALaAplicacion() {}

    @When("inicio sesion con las credenciales  usuario {string} y contraseña {string}")
    public void inicioSesionConLasCredencialesUsuarioYContraseña(String Usuario, String Password) {
        swagLabsSteps.login(Usuario,Password);
    }

    @Then("valido que deberia aparecer el titulo {string}")
    public void validoQueDeberiaAparecerElTitulo(String titulo) {
        Assert.assertEquals(swagLabsSteps.getValidTitle(), titulo);
    }

    @And("también valido que al menos exista un item llamado {string}")
    public void tambiénValidoQueAlMenosExistaUnItemLlamado(String itemName) {
        Assert.assertEquals(swagLabsSteps.getValidFirstItem(), itemName);
    }
}
