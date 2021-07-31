package com.choucair.pruebas.stepdefinitions;

import com.choucair.pruebas.steps.EmpleosSteps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class EmpleosQueEsSerChoucairStepDefinitions {
	@Steps
	EmpleosSteps empleoSteps;

	@Given("^que ingrese a la pagina de choucair$")
	public void queIngreseALaPaginaDeChoucair() {
		empleoSteps.abrirAplicacion();
	}

	@Given("^de clic en la seccion de empleados$")
	public void deClicEnLaSeccionDeEmpleados() throws InterruptedException {
		empleoSteps.clicbtnEmpleados();
	}

	@When("^de clic en el enlace de que es ser coucair$")
	public void deClicEnElEnlaceDeQueEsSerCoucair() throws InterruptedException {
		empleoSteps.clicbtnQueEsSerChoucair();
	}

	@Then("^valido la redireccion de que es ser choucair$")
	public void validoLaRedireccionDeQueEsSerChoucair() throws InterruptedException {
		empleoSteps.validarRedireccionQueEsSerCoucair();
	}

}
