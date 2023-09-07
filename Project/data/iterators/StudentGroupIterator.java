package Project.data.iterators;
import java.util.Iterator;
import java.util.List;
import Project.data.Student;
import Project.data.StudentGroup;

public class StudentGroupIterator implements Iterable<Student>, Iterator<Student>{
    //private StudentGroup studentGroup;
    //private Iterator<Student> students;
    private final List<Student> students;
    private int cursor;

    public StudentGroupIterator(StudentGroup studentGroup){
        this.students = studentGroup.getStudentList();
    }

    @Override
    public boolean hasNext(){
        return cursor < students.size();
    }

    @Override
    public Student next(){
        return students.get(cursor++);
    }

    @Override
    public void remove(){
        this.students.remove(cursor);
    }

    @Override
    public Iterator<Student> iterator() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'iterator'");
    }
}
