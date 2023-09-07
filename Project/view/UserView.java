import Project.data.User;
import java.util.List;

public abstract class UserView {

    protected abstract User findTheBest(List<User> userList);

    public void show(User user){
        
    }
  
    public void showTheBest(List<User> userList){
        User user = findTheBest(userList);
        System.out.println(user);
    }
}
