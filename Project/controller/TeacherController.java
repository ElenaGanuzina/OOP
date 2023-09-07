package Project.controller;

import java.util.List;

import Project.data.Student;
import Project.data.Teacher;
import Project.service.TeacherService;
import Project.util.ReaderFromTxt;

public class TeacherController implements UserController<Teacher, Integer> {
    private final TeacherService teacherService;

    public TeacherController(TeacherService teacherService) {
        this.teacherService = teacherService;
    }

    @Override
    public Teacher create(Teacher teacher) {
        return teacherService.createUser(teacher);
    }

    @Override
    public Teacher findById(Integer id) {
        return teacherService.findById(id);
    }

    @Override
    public Teacher findByFio(String fio) {
        return teacherService.findByFio(fio);
    }

    @Override
    public void write(Teacher entity) {
        
    }

    @Override
    public Teacher read(String path) {
        Teacher teacher = ReaderFromTxt.getTeacherFromTxt(path); 
        return teacher;
    }

    @Override
    public List<Student> readStudents(String path) {
        return null;
    }

}
