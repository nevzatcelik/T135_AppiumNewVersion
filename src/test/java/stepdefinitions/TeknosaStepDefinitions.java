package stepdefinitions;

import io.cucumber.java.en.Given;
import utils.Driver;

public class TeknosaStepDefinitions {
    @Given("kullanici uygulamayi yukler")
    public void kullanici_uygulamayi_yukler() {
        Driver.getAndroidDriver();
    }

}
