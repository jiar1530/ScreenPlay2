package co.com.certificacion.question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.targets.Target;

public class ValidarInformacion implements Question<String> {
    Target elemento;

    public ValidarInformacion(Target elemento){

        this.elemento=elemento;

    }

    public static ValidarInformacion ValidarTexto(Target elemento){

        return new ValidarInformacion(elemento);
    }

    @Override
    public String answeredBy(Actor actor) {


        String texto = Text.of(elemento).answeredBy(actor);
        return texto;
    }
}
