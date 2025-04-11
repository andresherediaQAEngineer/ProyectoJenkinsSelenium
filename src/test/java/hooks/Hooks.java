package hooks;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import utils.Logs;
import utils.WebDriverProvider;


public class Hooks {
    private static WebDriver driver; // Declarar el WebDriver a nivel de clase para usarlo en varios métodos.
    @Before
    public static void before(){
        Logs.debug("Crear una instancia de ChromeDriver");
        driver = new ChromeDriver();
        Logs.debug("Maximizar la ventana del navegador");
        driver.manage().window().maximize();
        Logs.debug("Eliminando cookies");
        driver.manage().deleteAllCookies();
        Logs.debug("Guardando el driver inicializado");
        new WebDriverProvider().set(driver);
    }

    @After
    public static void after(){
        Logs.debug("Matando el driver");
        driver.quit();
    }
}
