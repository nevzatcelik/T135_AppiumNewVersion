package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"pretty",
                "json:target/cucumber.json",},
        features = "src/test/resources/Features",
        glue = "stepdefinitions",
        tags = "@ab",
        dryRun =false

        // eger dry run true ise: features dosyalarinda tanimlanmayan dosyalari tanimlamak icin dry run true olacak
        // eger test failed ise eksik adimlari verir eger test passed ise eksik adim yok demektir
        // eksik adim yok demek true icin test passed anlamina gelmez sadece eksik adim olmadigini belirtir


        // eger false ise eksik adimlar tamamlanmissa yazilan kod bloklarini kosmaya baslar
        // burada test failed olursa kodda da hata olabilir eksik adim da olabilir
        // testin passed olmasi kosturmus oldugunuz testlerin passed oldugu anlamina gelir!
)

public class Runner {

}
