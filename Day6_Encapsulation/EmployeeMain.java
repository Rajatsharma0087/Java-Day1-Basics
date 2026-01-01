package Day6_Encapsulation;

public class EmployeeMain {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setName("Rajat");
        emp.setSalary(45000);

        System.out.println(emp.getName());
        System.out.println(emp.getSalary());
    }
}
