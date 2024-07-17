package co.com.certificacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.certificacion.userinterfaces.LoginPage.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.core.Is.is;

public class Login implements Task {

    private String username;
    private String pasword;

    public Login(String username, String pasword) {
        this.username = username;
        this.pasword = pasword;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(LINK_LOGIN),
                Enter.theValue(username).into(TXT_USERNAME),
                Enter.theValue(pasword).into(TXT_PASSWORD),
                Click.on(BTN_LOGIN)
        );
    }

    public static Login addCredentiasls(String username, String pasword) {
        return Tasks.instrumented(Login.class, username, pasword);
    }

}