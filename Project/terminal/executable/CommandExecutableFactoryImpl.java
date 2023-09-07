package Project.terminal.executable;
import Project.data.Student;
import Project.service.StudentService;

public class CommandExecutableFactoryImpl implements CommandExecutableFactory{

    protected StudentService studentService;

    public CommandExecutableFactoryImpl(StudentService studentService){
        this.studentService = studentService;
    }

    @Override
    public CommandExecutable create(Command command){
        
        if (command.isCreateCommand()){
            return new CreateStudentExecutable(studentService, new Student(command.getFirstArgument()));
        }
        else if(command.isDeleteCommand()){
            return new DeleteStudentExecutable(studentService, new Student(command.getFirstArgument()));
        }
        else return null;
    }

    
}