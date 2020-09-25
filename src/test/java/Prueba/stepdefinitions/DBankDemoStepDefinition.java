package Prueba.stepdefinitions;

import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import model.DBankUsuarioDataModel;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import questions.PreguntaUsuario;
import tasks.Abrir;
import tasks.Registar;

import java.util.List;

public class DBankDemoStepDefinition {

    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Given("^ingresar al sitio web$")
    public void ingresarAlSitioWeb() {
     OnStage.theActorCalled("jairo").wasAbleTo(Abrir.Lapagina());
    }


    @When("^diligenciar los datos y  registrar un usuario$")
    public void diligenciarLosDatosYRegistrarUnUsuario(List<DBankUsuarioDataModel> datos) {
       OnStage.theActorInTheSpotlight().attemptsTo(Registar.unUsuarioConLos(datos));
    }

    @Then("^Verificar el registro exitoso de un usuario \"([^\"]*)\"$")
    public void verificarElRegistroExitosoDeUnUsuario(String verifico) {
   OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(PreguntaUsuario.seRegistro(verifico)));

    }

    @When("^diligenciar los datos y  registrar una informacion financiera$")
    public void diligenciarLosDatosYRegistrarUnaInformacionFinanciera() {

    }

    @Then("^Verificar el registro exitoso de una informacion financiera$")
    public void verificarElRegistroExitosoDeUnaInformacionFinanciera() {

    }




}
