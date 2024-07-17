package co.com.certificacion.tasks;

import co.com.certificacion.userinterfaces.Url;
import net.serenitybdd.annotations.Step;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class Navigate implements Task {

    Url url;

    @Step("{0} Navigations to a url ")
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Open.browserOn().the(url)
        );
    }
    public static Navigate openUrl() {

        return instrumented(Navigate.class);
    }
}