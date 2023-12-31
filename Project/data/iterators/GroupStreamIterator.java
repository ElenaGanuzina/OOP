package Project.data.iterators;
import Project.data.StudentGroup;

import java.util.Iterator;
import java.util.List;

public class GroupStreamIterator implements Iterator<StudentGroup>{
    private int cursor;
    private final List<StudentGroup> studentGroups;

    public GroupStreamIterator(Project.data.GroupStream groupStream) {
        this.studentGroups = groupStream.getStudentGroup();
    }

    @Override
    public boolean hasNext() {
        return cursor < studentGroups.size();
    }

    @Override
    public StudentGroup next() {
        return studentGroups.get(cursor++);
    }

    @Override
    public void remove() {
        this.studentGroups.remove(cursor);
    }
}
