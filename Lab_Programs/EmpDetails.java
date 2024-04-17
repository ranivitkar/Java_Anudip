package Lab;

public class EmpDetails {

    static int eid;
    static String ename;
    static String companyname;

    public void setDetails(int id, String name, String com) {
        this.eid = id;
        this.ename = name;
        this.companyname = com;
    }

    public static void main(String[] args) {
        EmpDetails e = new EmpDetails();
        e.setDetails(111, "Rani", "Google");
        System.out.println("***** Employee Details *****");
        System.out.println("Emp_id: " + eid + "\nEmp_Name: " + ename + "\nCompany Name: " + companyname);
    }

}
