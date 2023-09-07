package Project.repository;

import Project.data.User;

public interface UserRepository<E extends User, I> extends Repository<E, I>{
    
    E findByFio (String fio);
    void delete(E entity);
}
