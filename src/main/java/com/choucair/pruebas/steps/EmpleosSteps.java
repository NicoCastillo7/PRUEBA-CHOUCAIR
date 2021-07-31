package com.choucair.pruebas.steps;

import com.choucair.pruebas.pagesobjects.EmpleosPageObject;

import net.thucydides.core.annotations.Step;

public class EmpleosSteps {

	EmpleosPageObject empleosObj = new EmpleosPageObject();

	@Step
	public void abrirAplicacion() {
		empleosObj.open();
	}

	@Step("ingreso a la seccion de Empleos")
	public void clicbtnEmpleados() throws InterruptedException {
		empleosObj.clicbtnEmpleados();
	}

	@Step("clic en Que es ser Choucair")
	public void clicbtnQueEsSerChoucair() throws InterruptedException {
		empleosObj.clicbtnQueEsSerChoucair();
	}

	@Step("Validacion de redireccion de Que es ser choucair")
	public void validarRedireccionQueEsSerCoucair() throws InterruptedException {
		empleosObj.validarRedireccionQueEsSerCoucair();
	}

	@Step("clic en Preparase para aplicar")
	public void clicbtnPreparaseParaAplicar() throws InterruptedException {
		empleosObj.clicbtnPreparaseParaAplicar();
	}

	@Step("Validacion de redireccion de Preparase para aplicar")
	public void validarRedireccionPreparase() throws InterruptedException {
		empleosObj.validarRedireccionPreparase();
	}

}
