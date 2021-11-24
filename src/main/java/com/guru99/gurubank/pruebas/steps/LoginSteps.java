package com.guru99.gurubank.pruebas.steps;

import com.guru99.gurubank.pruebas.pagobjects.LoginPageObject;

import net.thucydides.core.annotations.Step;

public class LoginSteps {
	LoginPageObject loginPageObject = new LoginPageObject();

	@Step
	public void abrirAplicacionNewtours() {
		loginPageObject.open();
	}

	@Step
	public void escribirUsuarioYClave(String usuarioCorrecto, String claveCorrecta) {
		loginPageObject.escribirUsuarioYClave(usuarioCorrecto, claveCorrecta);
	}

	@Step
	public void seleccionarSubmit() {
		loginPageObject.seleccionarSubmit();
	}

	@Step
	public String TextoLoginSuccesfully() {
		return loginPageObject.TextoLoginSuccesfully();
	}

	@Step
	public void escribirUsuarioYClaveIncorrectos(String usuarioIncorrecto, String claveIncorrecto) {
		loginPageObject.escribirUsuarioYClaveIncorrectos(usuarioIncorrecto, claveIncorrecto);
	}

	@Step
	public String TextoEnterYourUserNameAndPasswordCorrect() {
		return loginPageObject.TextoEnterYourUserNameAndPasswordCorrect();
	}
}
