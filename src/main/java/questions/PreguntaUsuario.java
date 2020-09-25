package questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import userinterface.ElementosWebDBankRegistrarUsuario;

public class PreguntaUsuario implements Question<Boolean> {


    public String pregunta;
    public PreguntaUsuario(String pregunta){
    this.pregunta=pregunta;
}

    public static PreguntaUsuario seRegistro(String pregunta) {

   return new PreguntaUsuario(pregunta);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
       String respuesta;
       respuesta= Text.of(ElementosWebDBankRegistrarUsuario.respues).viewedBy(actor).asString();
   if(respuesta.equals(pregunta)){
       return true;
   }else
   {
       return false;
   }

    }
}
