package Project.controller;

import java.util.List;

import Project.data.Student;
import Project.data.Teacher;

//import Project.data.Teacher;

public interface Controller<E, I> {
    E create(E entity);
    E findById(I id);
    void write(E entity);
    List<Student> readStudents(String path);
    Teacher read(String path);
}

