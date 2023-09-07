package Project.service;
import Project.data.GroupStream;
import Project.data.comparators.GroupStreamComparator;
import java.util.List;
import java.util.Collections;

public class GroupStreamServiceImple implements GroupStreamService{
    
    @Override
    public void streamSort(List<GroupStream> groupStream) {
        Collections.sort(groupStream, new GroupStreamComparator());
    }
}
