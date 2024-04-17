class Address {
    String city;
    String state;

    Address(String city, String state) {
        this.city = city;

        this.state = state;
    }
}

public class Student_Has {

    String name;
    String college;

    Address add;

    Student_Has(String n, String cname, Address add) {
        this.name = n;
        this.college = cname;
        this.add = add;
    }

    public static void main(String[] args) {

        Address add = new Address("Solapur", "Maharashtra");

        Student_Has s = new Student_Has("Rani", "SSWCOE", add);

        System.out.println("Student name: " + s.name);
        System.out.println("College: " + s.college);

        System.out.println("-----Address------");
        System.out.println("City: " + s.add.city);
        System.out.println("State:" + s.add.state);
    }

}
