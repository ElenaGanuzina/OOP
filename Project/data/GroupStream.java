package Project.data;
import Project.data.iterators.GroupStreamIterator;
import java.util.List;
import java.util.Iterator;

public class GroupStream implements Iterable<StudentGroup>{
    private List<StudentGroup> studentGroup;

    public GroupStream(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    public List<StudentGroup> getStudentGroup() {
        return studentGroup;
    }

    public void setStudentGroup(List<StudentGroup> studentGroup) {
        this.studentGroup = studentGroup;
    }

    @Override
    public Iterator<StudentGroup> iterator() {
        return new GroupStreamIterator(this);
    }
}