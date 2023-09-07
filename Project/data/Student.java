package Project.data;

public class Student extends User implements Comparable<Student>{
    private int groupNumber;

    public Student(String fio, int birthdate, int passport, int groupNumber){
        super(fio, birthdate, passport);
        this.groupNumber = groupNumber;
    }

    public Student(String fio){
        super(fio);
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public int compareTo(Student student){
        return Integer.compare(this.getBirthdate(), student.getBirthdate());
    }

    @Override
    public String toString() {
        return String.format("Student", fio);
    }
}
