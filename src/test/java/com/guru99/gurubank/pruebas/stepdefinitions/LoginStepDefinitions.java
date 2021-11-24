package com.guru99.gurubank.pruebas.stepdefinitions;

import org.junit.Assert;
import com.guru99.gurubank.pruebas.steps.LoginSteps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class LoginStepDefinitions {
	
	@Steps
	LoginSteps loginSteps;

	@Given("que ingreso a la pagina web de Newtours")
	public void que_ingreso_a_la_pagina_web_de_newtours() {
		loginSteps.abrirAplicacionNewtours();
	}

	@When("digito usuario {string} y clave {string}")
	public void digito_usuario_y_clave(String usuarioCorrecto, String claveCorrecta) {
		loginSteps.escribirUsuarioYClave(usuarioCorrecto, claveCorrecta);
	}

	@When("selecciono el boton de submit")
	public void selecciono_el_boton_de_submit() {
		loginSteps.seleccionarSubmit();
	}

	@Then("deberia visualizar el texto {string}")
	public void deberia_visualizar_el_texto(String textoExitoEsperado) {
		String textoExitoActual = loginSteps.TextoLoginSuccesfully();
		Assert.assertEquals(textoExitoEsperado, textoExitoActual);
	}

	@When("digito usuario {string} y clave incorrectas {string}")
	public void digito_usuario_y_clave_incorrectas(String usuarioIncorrecto, String claveIncorrecta) {
		loginSteps.escribirUsuarioYClaveIncorrectos(usuarioIncorrecto, claveIncorrecta);
	}

	@Then("deberia visualizar el texto fallido {string}")
	public void deberia_visualizar_el_texto_fallido(String textoFallidoEsperado) {
		String textFallidoActual = loginSteps.TextoEnterYourUserNameAndPasswordCorrect();
		Assert.assertTrue(textFallidoActual.contains(textoFallidoEsperado));
	}
}
