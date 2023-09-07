package Project.service;
import java.util.List;

import Project.data.Student;
import Project.data.Teacher;
import Project.data.User;


public interface DataService<U extends User> {
    U createUser(U user);
    U findById(Integer id);
    U findByFio(String fio);
    void sortUsers(List<U> users);
    void sortUsersByName(List<U> users);
    List<Student> read(String path);
    Teacher readTeacher(String path);
    
}
