import java.util.Scanner;

public class GradeGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks:");
        int marks = sc.nextInt();
        if (marks >= 65) {
            System.out.println("A+");
        }
        else if (marks >= 60) {
            System.out.println("A");
        } else if (marks >= 55) {
            System.out.println("B");
        } else if (marks >= 50) {
            System.out.println("B+");
        } else if (marks >= 45) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
    }
}
