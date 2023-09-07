package Project.service;

import Project.data.Student;
import Project.data.Teacher;
import Project.data.User;
import Project.data.comparators.UserComparator;
import Project.repository.StudentRepository;
import Project.util.ReaderFromTxt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class StudentService implements DataService<Student>{

    private final StudentRepository studentRepository;

    public StudentService(StudentRepository studentRepository){
        this.studentRepository = studentRepository;
    }

    @Override
    public Student createUser(Student user){
        return studentRepository.save(user);
    }

    @Override
    public Student findById(Integer id){
        return studentRepository.findById(id);
    }

    @Override
    public Student findByFio(String fio){
        return studentRepository.findByFio(fio);
    }

    @Override
    public void sortUsers(List<Student> users){
        Collections.sort(users);
    }

    @Override
    public void sortUsersByName(List<Student> users){
        Collections.sort(users, new UserComparator());
    }

    @Override
    public List<Student> read(String path) {
        List<Student> students = new ArrayList<>();
        List<Student> users = ReaderFromTxt.getStudentsFromTxt(path);
        for (User user : users) {
            if (user instanceof Student) {
                students.add((Student) user);
            }
        }
        return students;
    }

    public void save(Student entity){
        studentRepository.save(entity);
    }

    public void deleteStudent(Student entity){
    }

    public void write(Student student) {
    }

    @Override
    public Teacher readTeacher(String path) {
        return null;
    }

}
