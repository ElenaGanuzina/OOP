package Project.repository;
import Project.data.Teacher;


public class TeacherRepository implements UserRepository<Teacher, Integer> {
    
    @Override
    public Teacher save(Teacher entity){
        return null;
    }

    @Override
    public Teacher findById(Integer id){
        return null;
    }

    @Override
    public Teacher findByFio(String fio){
        return null;
    }

    @Override
    public void delete(Teacher entity) {
        
    }

}
