package cc.worker;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

@ShellComponent
public class HelloCommand {

    @ShellMethod(key = "hello", value = "Trying Shell scripting")
    public String sayHello(
            @ShellOption(defaultValue = "") String... str) {
        return str.length == 0
                ? "Hello, shell"
                : "Hello, shell " + str[0];
    }

    @ShellMethod(key = "stop", value = "Stop application command")
    public void stop() {
        System.exit(0);
    }

}
