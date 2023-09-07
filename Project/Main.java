package Project;
import Project.repository.StudentRepository;
import Project.service.StudentService;
import Project.terminal.CommandParser;
import Project.terminal.TerminalReader;
import Project.terminal.executable.CommandExecutableFactoryImpl;


public class Main {
    public static void main(String[] args) {
        TerminalReader.getInstance(new CommandParser(), new CommandExecutableFactoryImpl
        (new StudentService(new StudentRepository()))).getCommands(0);
    }
}