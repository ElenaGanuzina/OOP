package Project.repository;
import Project.data.Student;
import Project.db.StudentTable;

public class StudentRepository implements UserRepository<Student, Integer>{
    private StudentTable studentTable;

    public StudentRepository(StudentTable studentTable){
        this.studentTable = studentTable;
    }

    public StudentRepository(){

    }

    @Override
    public Student save(Student student){
        studentTable.save(student);
        return student;
    }

    @Override
    public void delete(Student entity){
        studentTable.removeByFio(entity.getFio());
    }

    @Override
    public Student findById(Integer id){
        return null;
    }
    
    @Override
    public Student findByFio(String fio){
        return null;
    }
    
}