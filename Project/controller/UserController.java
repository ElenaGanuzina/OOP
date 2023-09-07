package Project.controller;
import Project.data.User;

public interface UserController<E extends User, I> extends Controller<E, I> {
    E findByFio(String Fio);
}
