package Project.terminal.executable;

public interface CommandExecutableFactory{
    CommandExecutable create(Command command);
    
}