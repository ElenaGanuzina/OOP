package Project.data;
import java.util.Iterator;
import java.util.List;
import Project.data.iterators.StudentGroupIterator;

public class StudentGroup implements Iterable<Student>{
    private List<Student> studentList;
    private Teacher teacher;
    private int groupNumber;

    public StudentGroup(List<Student> studentList, Teacher teacher){
        this.studentList = studentList;
        this.teacher = teacher;
    }

    public StudentGroup(List<Student> studentList, Teacher teacher, int groupNumber){ 
        this.studentList = studentList;
        this.teacher = teacher;
        this.groupNumber = groupNumber;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    } 

    public int getGroupNumber(){
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber){
        this.groupNumber = groupNumber;
    }
    
    @Override
    public Iterator<Student> iterator(){
        return new StudentGroupIterator(this);
    } 
}
