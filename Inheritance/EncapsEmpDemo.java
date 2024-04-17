package Inheritance;

public class EncapsEmpDemo {

    public static void main(String[] args) {

        EncapsulationEmp e = new EncapsulationEmp();

        e.setId(111);
        e.setName("Rani Vitkar");
        e.setSalary(500000);

        System.out.println("Emp ID: " + e.getId());
        System.out.println("Emp name: " + e.getName());
        System.out.println("Salary: " + e.getSalary());
    }
}
