import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num1:");
        int num1 = sc.nextInt();
        System.out.println("Enter num2:");
        int num2 = sc.nextInt();
        System.out.println("1.Addition\n" +
                "2.Substraction\n" +
                "3.Multiplication\n" +
                "4.Division\n" +
                "5.Modulo\n");
        System.out.println("Enter your choice:");
        int ch = sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Addition of two number is " + (num1 + num2));
                break;
            case 2:
                System.out.println("Substraction of two Number is:" + (num1 - num2));
                break;
            case 3:
                System.out.println("Multiplication of two Number is" + (num1 * num2));
            case 4:
                System.out.println("Division of two Number is:"+(num1/num2));
                break;
            case 5:
                System.out.println("Modulo of two Number is:"+(num1 % num2));
                break;
            default:
                System.out.println("Enetr Valid Choice");
        }
    }
}