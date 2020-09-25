package tasks;

import model.DBankUsuarioDataModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.waits.WaitUntil;
import userinterface.ElementosWebDBankRegistrarUsuario;
import util.Constantes;

import java.util.List;

import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class Registar implements Task {

    List<DBankUsuarioDataModel>  datos;
    public Registar(List datos){
    this.datos=datos;
    }

    public static Registar unUsuarioConLos(List<DBankUsuarioDataModel> datos) {
        return new Registar(datos);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(ElementosWebDBankRegistrarUsuario.title),
                Click.on(ElementosWebDBankRegistrarUsuario.select),
        Enter.theValue(datos.get(Constantes.posicion).getFirstname()).into(ElementosWebDBankRegistrarUsuario.firtname),
        Enter.theValue(datos.get(Constantes.posicion).getLastname()).into(ElementosWebDBankRegistrarUsuario.lastname)
        );
        if(datos.get(Constantes.posicion).getGender().equals("m")){
            actor.attemptsTo(
                    Click.on(ElementosWebDBankRegistrarUsuario.genderm)
                    );
        }else{
            actor.attemptsTo(
            Click.on(ElementosWebDBankRegistrarUsuario.genderfe)
            );
        }
        actor.attemptsTo(
                Enter.theValue(datos.get(Constantes.posicion).getDateofbirth()).into(ElementosWebDBankRegistrarUsuario.fecha),
                Enter.theValue(datos.get(Constantes.posicion).getSocial()).into(ElementosWebDBankRegistrarUsuario.social),
                Enter.theValue(datos.get(Constantes.posicion).getCorreo()).into(ElementosWebDBankRegistrarUsuario.email),
                Enter.theValue(datos.get(Constantes.posicion).getPassword()).into(ElementosWebDBankRegistrarUsuario.password),
                Enter.theValue(datos.get(Constantes.posicion).getConfirmar()).into(ElementosWebDBankRegistrarUsuario.confirm),
                Click.on(ElementosWebDBankRegistrarUsuario.next),
                WaitUntil.the(ElementosWebDBankRegistrarUsuario.adress,isVisible()).forNoMoreThan(15).seconds(),
                Enter.theValue(datos.get(Constantes.posicion).getAddress()).into(ElementosWebDBankRegistrarUsuario.adress),
                Enter.theValue(datos.get(Constantes.posicion).getLocality()).into(ElementosWebDBankRegistrarUsuario.locali),
                Enter.theValue(datos.get(Constantes.posicion).getRegion()).into(ElementosWebDBankRegistrarUsuario.region),
                Enter.theValue(datos.get(Constantes.posicion).getPostal()).into(ElementosWebDBankRegistrarUsuario.postal),
                Enter.theValue(datos.get(Constantes.posicion).getCountry()).into(ElementosWebDBankRegistrarUsuario.country),
                Enter.theValue(datos.get(Constantes.posicion).getTelefono()).into(ElementosWebDBankRegistrarUsuario.homefone),
                Enter.theValue(datos.get(Constantes.posicion).getCelular()).into(ElementosWebDBankRegistrarUsuario.celular),
                Enter.theValue(datos.get(Constantes.posicion).telefonotrabajo).into(ElementosWebDBankRegistrarUsuario.trabajo),
                Click.on(ElementosWebDBankRegistrarUsuario.check),
                Click.on(ElementosWebDBankRegistrarUsuario.registrar)


        )
        ;

    }
}
