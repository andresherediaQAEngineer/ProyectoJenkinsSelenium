package steps;
import io.cucumber.java.en.Then;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Logs;
import utils.WebDriverProvider;


public class TopBarBlass {
    private WebDriver getDriver() {
        return new WebDriverProvider().get();
    }

    @Then("Verifico que en el checkout salga el numero {int}")
    public void VerificarCantidadItems(int cantidadEsperada) {
        Logs.info("Verificando la cantidad en el checkout");
        final var cantidadString = getDriver().findElement(By.cssSelector("span[data-test-shopping-cart-badge']")).getText();
        //String -> int usando Integer.parseInt()
        Assertions.assertEquals(Integer.parseInt(cantidadString), cantidadEsperada);
    }

}