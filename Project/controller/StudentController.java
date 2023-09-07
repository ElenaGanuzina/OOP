package Project.controller;

import java.util.List;

import Project.data.Student;
import Project.data.Teacher;
import Project.service.StudentService;

public class StudentController implements UserController<Student, Integer> {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @Override
    public void write(Student student){
        studentService.write(student);
    }

    @Override
    public Student create(Student student) {
        return studentService.createUser(student);
    }

    @Override
    public Student findById(Integer id) {
        return studentService.findById(id);
    }

    @Override
    public Student findByFio(String Fio) {
        return studentService.findByFio(Fio);
    }

    @Override
    public List<Student> readStudents(String path) {
        return studentService.read(path);
    }

    @Override
    public Teacher read(String path) {
        return null;
    }

}

