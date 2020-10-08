package HomeWorkOOP;

public class HomeWork5 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Sveta","SalerMan","sveta1996@mail.ru", "89999876543", 1000, 31);
        employee1.showInfo();
        Employee employee2 = new Employee("Noname");
        employee2.showInfo();
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(20);
        employees[1] = new Employee(35);
        employees[2] = new Employee(45);
        employees[3] = new Employee(56);
        employees[4] = new Employee(61);
        for (int i = 0; i < employees.length; i++) {
            employees[i].showInfo();
        }
        for (int i = 0; i < employees.length; i++) {
            if (employees[i].getAge() > 40){
                employees[i].showInfo();
            }
        }
   }
}

