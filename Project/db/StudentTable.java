package Project.db;
import Project.data.Student;

public class StudentTable extends Table<Student>{

    public boolean removeByFio(String fio){
        for(Student student : elements){
            if(student.getFio().equals(fio)){
                elements.remove(student);
                return true;
            }
        }
        return false;
    }

    public Student save(Student student){
        if (!elements.contains(student)){
            elements.add(student);
        }
        return student;
    }

    
}
