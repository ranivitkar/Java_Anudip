public class Student implements Person {// implementation of person interface

    // here we can implement the speak method which is declare in the person
    // interface

    public void speak() {
        // here is implementation of speak method
        System.out.println("Hello, Speaking Student");
    }

    public static void main(String[] args) {
        Student s = new Student();// Creating object of student class
        s.speak();// calling speak method using student object
    }
}
