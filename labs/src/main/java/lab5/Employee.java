package lab5;

public class Employee {
    private String name;
    private String mail;
    private Integer salary;

    public Employee(String name, String mail, Integer salary) {
        this.name = name;
        this.mail = mail;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }
}
