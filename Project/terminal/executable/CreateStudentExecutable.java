package Project.terminal.executable;

import Project.service.DataService;
import Project.service.StudentService;
import Project.data.Student;

public class CreateStudentExecutable implements CommandExecutable {

    //private StudentService<Student> studentService;
    private Student student;
    private StudentService studentService;

    public CreateStudentExecutable(StudentService studentService, Student student){
        this.studentService = studentService;
        this.student = student;
    }

    public CreateStudentExecutable(DataService<Student> studentService, Student student) {
    }

    @Override
    public void execute() {
         studentService.save(student);
    }
    
}
