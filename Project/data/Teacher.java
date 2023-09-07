package Project.data;

public class Teacher extends User {
    private String department;

    public Teacher(String fio, int birthdate, int passport, String department){
        super(fio, birthdate, passport);
        this.department = department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return String.format("Teacher %s", fio);
    }
}
