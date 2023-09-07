package Project.terminal;
import java.util.ArrayList;
import java.util.List;
import Project.terminal.executable.Command;

public class CommandParser {

    public Command parseCommand(String input){
        return new Command(new ArrayList<>(List.of(input.split(" "))));
    }
}
