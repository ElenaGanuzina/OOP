package Project.terminal.executable;
import java.util.ArrayList;

public class Command {
    private static final String ADD = "/add";
    private static final String DEL = "/del";
    private static final String DELFIO = "/delfio";
    private ArrayList<String> arguments;
    private String firstCommand;

    public Command(ArrayList<String> arguments){
        this.arguments = arguments;
        this.firstCommand = arguments.get(0);
    }

    public String getFirstArgument(){
        return arguments.get(0);
    }

    public boolean isCreateCommand(){
        return firstCommand.equals(ADD);
    }

    public boolean isDeleteCommand(){
        return firstCommand.equals(DEL);
    }

    public boolean isDelFioCommand(){
        return firstCommand.equals(DELFIO);
    }
}
