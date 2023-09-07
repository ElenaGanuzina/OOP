package Project.terminal;

import java.util.Scanner;

import Project.terminal.executable.Command;
import Project.terminal.executable.CommandExecutable;
import Project.terminal.executable.CommandExecutableFactory;

public class TerminalReader {

    private static TerminalReader terminalReader;
    private final CommandParser commandParser;
    private final CommandExecutableFactory commandExecutableFactory;

    public static TerminalReader getInstance(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory){
        if (terminalReader == null) {
            terminalReader = new TerminalReader(commandParser, commandExecutableFactory);
        }
        return terminalReader;
    }

    private TerminalReader(CommandParser commandParser, CommandExecutableFactory commandExecutableFactory){
        this.commandParser = commandParser;
        this.commandExecutableFactory = commandExecutableFactory;
    }
    
    public void getCommands(int f){
        Scanner sc = new Scanner(System.in);
        while (true) {
            String input = sc.nextLine();
            Command commands = commandParser.parseCommand(input);
            CommandExecutable commandExecutable = commandExecutableFactory.create(commands); 
            commandExecutable.execute();
            sc.close();
        }
    }

    

}
