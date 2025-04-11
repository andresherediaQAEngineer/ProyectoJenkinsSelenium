package pages;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import utils.BasePage;
import utils.Logs;


public class LoginPageSwagLabs extends BasePage {
    private final By usernameLocator = By.id("user-name");
    private final By passwordLocator = By.id("password");
    private final By buttonLocator = By.id("login-button");
    private  final By tituloLocator = By.cssSelector(".title");


    @Override
    public void verifyPage() {

        Assertions.assertAll(
                () -> Assertions.assertTrue(find(usernameLocator).isDisplayed(),  "username no visible"),
                () -> Assertions.assertTrue(find(passwordLocator).isDisplayed(),  "password no visible"),
                () -> Assertions.assertTrue(find(buttonLocator).isDisplayed(), "Login button no visible")
        );
    }
    public void fillForm(String username,String password){
        Logs.info("Ingreso el nombre de usuario");
        find(usernameLocator).sendKeys(username);
        Logs.info("Ingreso el password");
        find(passwordLocator).sendKeys(password);
        Logs.info("Hago click en el boton de login");
        find(buttonLocator).click();
    }
    public void verificarPaginaProduct(String text){
        Logs.info("Verificando si inicio pagina de Products");
        final var tituloProduct = find(tituloLocator);

        sleep(2000);

        Assertions.assertAll(
                ()-> Assertions.assertTrue(tituloProduct.isDisplayed(), "no es visible el titulo Product"),
                ()-> Assertions.assertEquals(tituloProduct.getText(), text)
        );

    }

}
