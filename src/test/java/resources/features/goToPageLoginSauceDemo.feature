Feature: Login Sauce Demo New

  Scenario: Navegar a la pagina de Login de Sauce Demo
    Given estoy en la página de inicio de sesión de Login de Sauce Demo "https://www.saucedemo.com/"
    And verifico que estoy en la pagina Login de Sauce Demo
    When ingreso y envio las credenciales de usuario "standard_user" y la contraseña "secret_sauce"
    Then muestra la pagina "Products"