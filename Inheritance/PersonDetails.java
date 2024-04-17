package inheritance_examples;
//Define the Person interface
interface Person 
{
 void speak();
}

//Implement the Student class which implements the Person interface
class Students implements Person 
{
 @Override
 public void speak() 
 {
     System.out.println("I am a student.");
 }
}

//Implement the Teacher class which implements the Person interface
class Teacher implements Person 
{
 @Override
 public void speak() 
 {
     System.out.println("I am a teacher.");
 }
}

public class PersonDetails 
{
 public static void main(String[] args) 
 {
     // Create objects of both Student and Teacher classes
     Person students = new Students();
     Person teacher = new Teacher();

     // Call their respective "speak" methods
     students.speak(); // Output: I am a student.
     teacher.speak(); // Output: I am a teacher.
 }
}

 