package Project.service;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import Project.data.Student;
import Project.data.Teacher;
import Project.data.StudentGroup;
import Project.util.ReaderFromTxt;

public class StudentGroupServiceImpl implements StudentGroupService{

    @Override
    public StudentGroup getGroup(){
        Teacher teacher = ReaderFromTxt.getTeacherFromTxt(null);
        List<Student> studentList = ReaderFromTxt.getStudentsFromTxt(null);
        return new StudentGroup(studentList, teacher);
    }

    @Override
    public StudentGroup getGroup(int number){
        Teacher teacher = ReaderFromTxt.getUserFromTxt();
        List<Student> studentList = ReaderFromTxt.getStudentsFromTxt(null);
        return new StudentGroup(studentList, teacher, number);
    }

    @Override
    public void removeStudent(String fio){
        Iterator<Student> students = ReaderFromTxt.getStudentsFromTxt(fio).iterator();
        while(students.hasNext()){
            Student student = students.next();
            if(fio.equals(student.getFio())){
                students.remove();
            }
        }
    }

    @Override
    public void sortStudents(StudentGroup studentGroup){
        Collections.sort(studentGroup.getStudentList());
    }

}
