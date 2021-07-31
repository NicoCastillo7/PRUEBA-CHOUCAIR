package com.choucair.pruebas.stepdefinitions;

import com.choucair.pruebas.steps.EmpleosSteps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EmpleosPrepararseStepDefinitions {

	@Steps
	EmpleosSteps empleoSteps;

	@When("^de clic en el enlace de preparase para aplicar$")
	public void deClicEnElEnlaceDePreparaseParaAplicar() throws InterruptedException {
		empleoSteps.clicbtnPreparaseParaAplicar();
	}

	@Then("^valido la redireccion de prepararse para aplicar$")
	public void validoLaRedireccionDePrepararseParaAplicar() throws InterruptedException {
		empleoSteps.validarRedireccionPreparase();
	}

}
