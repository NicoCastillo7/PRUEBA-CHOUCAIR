package com.choucair.pruebas.pagesobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.choucairtesting.com/")
public class EmpleosPageObject extends PageObject {

	By btnEmpleados = By.xpath("//a[contains(text(),'Empleos')]");
	By btnQueEsSerChoucair = By.xpath("(//a[@href='#ser'])[2]");
	By btnPreparaseParaAplicar = By.xpath("//a[contains(text(),'Prepararse para aplicar')]");
	By titleSerChoucair = By.xpath("//h2[contains(text(),'SER CHOUCAIR')]");
	By titlePrepararse = By.xpath("//h2[contains(text(),'PREPARARSE PARA APLICAR')]");

	public void clicbtnEmpleados() throws InterruptedException {
		getDriver().findElement(btnEmpleados).click();
		ScrollDouwn();
		Thread.sleep(3000);
	}

	public void clicbtnQueEsSerChoucair() throws InterruptedException {
		getDriver().findElement(btnQueEsSerChoucair).click();
		Thread.sleep(3000);
	}

	public void clicbtnPreparaseParaAplicar() throws InterruptedException {
		getDriver().findElement(btnPreparaseParaAplicar).click();
		ScrollDouwn();
		Thread.sleep(3000);
	}

	public void validarRedireccionQueEsSerCoucair() throws InterruptedException {

		if (getDriver().findElement(titleSerChoucair).getText().equals("SER CHOUCAIR")) {
			System.out.println("Redireccion Exitosa de Que es ser choucair");
		} else {
			System.out.println("Error en la redireccion");
		}
	}

	public void validarRedireccionPreparase() throws InterruptedException {

		if (getDriver().findElement(titlePrepararse).getText().equals("PREPARARSE PARA APLICAR")) {
			System.out.println("Redireccion Exitosa de prepararse para aplicar");
		} else {
			System.out.println("Error en la redireccion");
		}
	}

	public void ScrollDouwn() {
		JavascriptExecutor js = (JavascriptExecutor) getDriver();
		js.executeScript("window.scrollBy(0,350)", "");

	}
}
