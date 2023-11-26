package Obj;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("PLease enter your name.\n enter your \"name\" \"username\" and \"password\"");

        Student student = new Student();
        student.setName(scanner.nextLine());
        student.setUserName(scanner.nextLine());
        student.setPassword(scanner.nextLine());

        System.out.println("Please enter \"subject name\" and \"grade point\" ");
        Exam exam = new Exam(scanner.nextLine(), scanner.nextFloat());
        student.setExam(exam);

        System.out.println();
        System.out.println("your point is " + student.getExamPoint());
        String result = student.getExamPoint() > 10  ? "Passed" : "Failed" ;
        System.out.println(result);

        }
    }


