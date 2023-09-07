package Project.data;

public abstract class User {
    protected String fio;
    protected int birthdate;
    protected int passport;

    public User(String fio, int birthdate, int passport){
        this.fio = fio;
        this.birthdate = birthdate;
        this.passport = passport;
    }

    public User(String fio){
        this.fio = fio;
    }
    
    public String getFio() {
        return fio;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public int getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(int birthdate) {
        this.birthdate = birthdate;
    }

    public int getPassport() {
        return passport;
    }

    public void setPassport(int passport) {
        this.passport = passport;
    }

    @Override
    public abstract String toString();
}
