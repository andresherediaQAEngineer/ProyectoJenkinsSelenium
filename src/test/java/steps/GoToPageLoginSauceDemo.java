package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import pages.LoginPageSwagLabs;
import utils.BasePage;
import utils.Logs;

public class GoToPageLoginSauceDemo extends BasePage {


       // private String  urlActual;
        private final LoginPageSwagLabs loginPage = new LoginPageSwagLabs();

        @Given("estoy en la página de inicio de sesión de Login de Sauce Demo {string}")
        public void estoyEnLaPáginaDeInicioDeSesión(String url) {
            Logs.info("Inicio de de test case Navegar a la pagina de Login de Sauce Demo");
            Logs.info("Navego ala pagina Sauce demo %s", url);
            getDriver().get(url);

        }

        @And("verifico que estoy en la pagina Login de Sauce Demo")
        @Override
        public void verifyPage() {
            Logs.info("verifico si estoy en la pagina de login suce demo");
            loginPage.verifyPage();
        }

        @When("ingreso y envio las credenciales de usuario {string} y la contraseña {string}")
        public void ingresoYEnvioElUsuarioYLaContraseña(String username, String password) {
            loginPage.fillForm(username, password);
        }

        @Then("muestra la pagina {string}")
          public void muestraLaPaginaConElTituloDe(String text) {
            Logs.info("Entro a este metodo");
            loginPage.verificarPaginaProduct(text);
         }
}


