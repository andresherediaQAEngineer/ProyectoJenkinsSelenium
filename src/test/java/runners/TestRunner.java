package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features", // Ruta de los archivos .feature
        glue = {"hooks", "steps"}, // Paquetes donde están los Hooks y Steps
        plugin = {"pretty",
                "html:target/cucumber-html-report.html",
                "json:target/cucumber-reports/cucumber.json"}, // Reportes
        monochrome = true // Formato legible en consola
)
public class TestRunner {
}