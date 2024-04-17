
public class EmployeeBean {
    int eid;
    String ename;
    double esalary;

    public EmployeeBean() {// constructor for
        // TODO Auto-generated constructor stub
        this.eid = eid;
        this.ename = ename;
        this.esalary = esalary;
    }

    public int getEid() {// getter method for getting emp_id
        return eid;
    }

    public void setEid(int eid) {// setter method for setting emp_id
        this.eid = eid;
    }

    public String getEname() {// getter method for getting emp_name
        return ename;
    }

    public void setEname(String ename) {// setter method for setting emp_name
        this.ename = ename;
    }

    public double getEsalary() {// getter method for getting emp_salary
        return esalary;
    }

    public void setEsalary(double esalary) {// setter method for setting emp_salary
        this.esalary = esalary;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        EmployeeBean e = new EmployeeBean();

        // setting the variable using setter method
        e.setEid(55);
        e.setEname("Rani Vitkar");
        e.setEsalary(60000);

        // getting the details
        System.out.println("Employee Id : " + e.getEid());
        System.out.println("Employee name is : " + e.getEname());
        System.out.println("Employee Salary : " + e.getEsalary());

    }

}