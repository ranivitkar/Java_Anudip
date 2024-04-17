
import java.util.*;

import javax.sound.sampled.SourceDataLine;

class Student {
    Scanner c = new Scanner(System.in);
    int roll_no;
    String name;

    void getInfo() {// for taking user input like roll number and name
        System.out.println("Enter your roll number");
        roll_no = c.nextInt();
        c.nextLine();

        System.out.println("Enter your name");
        name = c.nextLine();
    }
}

class Marksdetails extends Student {

    double total_marks = 0, per;

    void getMarks() {
        // this for getting 5 subject marks of user
        for (int i = 1; i <= 5; i++) {

            System.out.println("Enter marks of subject " + i);
            total_marks += c.nextInt();// addition of all subject marks for calculating the result
        }
    }

    void disResult() {
        // here I have calculated the percentage of marks
        per = (total_marks / 500) * 100;
        System.out.println("\n***** Result *****");
        System.out.println("Roll No: " + roll_no);
        System.out.println("Name: " + name);
        System.out.println("Result: " + per + "%");
    }

}

public class Student_info {

    public static void main(String[] args) {
        Marksdetails m = new Marksdetails();
        m.getInfo();// getting inforamtion from user
        m.getMarks();// getting marks
        m.disResult();// calculation of result and diplaying the result
    }

}
