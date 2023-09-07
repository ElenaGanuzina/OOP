package Project.terminal.executable;
import Project.service.StudentService;

public class LogingCommandExecutableFactory extends CommandExecutableFactoryImpl{

    public LogingCommandExecutableFactory(StudentService studentService) {
        super(studentService);
        
    }

    @Override
    public CommandExecutable create(Command input){
        System.out.println(input);
        CommandExecutable result = super.create(input);
        System.out.println("Some info");
        return result;
    }
}
