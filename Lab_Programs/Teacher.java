public class Teacher implements Person {

    // here we can implement the speak method which is declare in the person
    // interface

    public void speak() {
        // here is implementation of speak method
        System.out.println("Hello, Speaking Teacher");
    }

    public static void main(String[] args) {
        Teacher t = new Teacher();();// Creating object of Teacher class
        t.speak();// calling speak method using Teacher object
    }

}
