package Project.service;

import java.util.Collections;
import java.util.List;

import Project.data.Student;
import Project.data.Teacher;
import Project.repository.TeacherRepository;
import Project.util.ReaderFromTxt;
import Project.data.comparators.UserComparator;

public class TeacherService implements DataService<Teacher> {
    private final TeacherRepository teacherRepository;

    public TeacherService(TeacherRepository teacherRepository){
        this.teacherRepository = teacherRepository;
    }

    @Override
    public Teacher createUser(Teacher user) {
        return teacherRepository.save(user);
    }

    @Override
    public Teacher findById(Integer id){
        return teacherRepository.findById(id);
    }

    @Override
    public Teacher findByFio(String fio){
        return teacherRepository.findByFio(fio);
    }

    @Override
    public void sortUsers(List<Teacher> users){
        this.sortUsers(users);
    }

    @Override
    public void sortUsersByName(List<Teacher> users){
        Collections.sort(users, new UserComparator());
    }

    @Override
    public Teacher readTeacher(String path) {
        Teacher teacher = ReaderFromTxt.getTeacherFromTxt(path);
        return teacher;
    }

    @Override
    public List<Student> read(String path) {
        return null;
    }

    

}
