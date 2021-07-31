package com.choucair.pruebas.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
		features="src/test/resources/com/choucair/pruebas/features/EmpleosQueEsSerChoucair.feature",
		glue="com.choucair.pruebas.stepdefinitions",
		snippets=SnippetType.CAMELCASE,
		monochrome = true)
public class EmpleoQueEsSerChoucairRunner {

}
