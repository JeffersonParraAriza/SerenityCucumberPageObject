#Author: Jefferson Parra Ariza
@LoginNewTours
Feature: Inicio de sesion
  Validacion de inicios de sesion en la pagina de NewTours

  @LoginNewToursExitoso
  Scenario: Inicio de sesion Exitoso
    Given que ingreso a la pagina web de Newtours
    When digito usuario "jparr37" y clave "jparr37"
    When selecciono el boton de submit
    Then deberia visualizar el texto "Login Successfully"

  @LoginNewToursFallido
  Scenario: Inicio de sesion fallido
    Given que ingreso a la pagina web de Newtours
    When digito usuario "prueba" y clave incorrectas "prueba"
    When selecciono el boton de submit
    Then deberia visualizar el texto fallido "Enter your userName and password correct"
