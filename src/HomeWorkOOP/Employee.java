package HomeWorkOOP;

public class Employee {
    private String name;
    private String position;
    private String eMail;
    private String phoneNumber;
    private int salary;
    private int age;

    public Employee(String name, String position, String eMail, String phoneNumber, int salary, int age) {
        this.name = name;
        this.position = position;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
        this.salary = salary;
        this.age = age;
    }

    public Employee(String name) {
        this.name = name;
    }

    public Employee(int age) {
        this.age = age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void showInfo() {
        System.out.printf("Employee %s %s %s %s %s %d\n", name, position, eMail, phoneNumber, salary, age);
    }
}

//public void setName(String name);
//public String getName(){return name};
//public String getPosition(){return position};
//public String getEMail(){return eMail};
//public long getPhoneNumber(){return phoneNumber};
//public int getSalary(){return salary};
//public int getAge(){return age};