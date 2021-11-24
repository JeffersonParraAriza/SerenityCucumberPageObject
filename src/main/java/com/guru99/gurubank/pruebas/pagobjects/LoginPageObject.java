package com.guru99.gurubank.pruebas.pagobjects;

import org.openqa.selenium.By;
import net.serenitybdd.core.pages.PageObject;

public class LoginPageObject extends PageObject{
	
	By TxtUserName = By.name("userName");
	By TxtPassWord = By.name("password");
	By BtnSubmit = By.name("submit");
	By TextLoginSuccesfully = By.xpath("//h3");
	By TextEnterYourUserNameAndPasswordCorrect = By.xpath("//span");
	
	public void escribirUsuarioYClave(String usuarioCorrecto, String claveCorrecta) {
		find(TxtUserName).sendKeys(usuarioCorrecto);
		find(TxtPassWord).sendKeys(claveCorrecta);
	}

	public void seleccionarSubmit() {
		find(BtnSubmit).click();
	}

	public void escribirUsuarioYClaveIncorrectos(String usuarioIncorrecto, String claveIncorrecto) {
		find(TxtUserName).sendKeys(usuarioIncorrecto);
		find(TxtPassWord).sendKeys(claveIncorrecto);
	}

	public String TextoLoginSuccesfully() {
		return find(TextLoginSuccesfully).getText();
	}

	public String TextoEnterYourUserNameAndPasswordCorrect() {
		return find(TextEnterYourUserNameAndPasswordCorrect).getText();
	}
}
