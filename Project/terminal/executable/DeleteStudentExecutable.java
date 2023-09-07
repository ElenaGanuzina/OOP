package Project.terminal.executable;

import Project.data.Student;
import Project.service.DataService;
import Project.service.StudentService;

public class DeleteStudentExecutable implements CommandExecutable{

    private StudentService studentService;
    private Student student;
    
    public DeleteStudentExecutable(StudentService studentService, Student student){
        this.studentService = studentService;
        this.student = student;
    }

    public DeleteStudentExecutable(DataService<Student> studentService, Student student) {
    }

    @Override
    public void execute() {
        studentService.deleteStudent(student);
    }
    
}
