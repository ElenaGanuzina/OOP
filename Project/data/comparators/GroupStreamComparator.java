package Project.data.comparators;
import Project.data.GroupStream;
import java.util.Comparator;

public class GroupStreamComparator implements Comparator<GroupStream>{
    @Override
    public int compare(GroupStream stream1, GroupStream stream2) {
        int size1=stream1.getStudentGroup().size();
        int size2=stream2.getStudentGroup().size();
        return Integer.compare(size1, size2);
    }
}
