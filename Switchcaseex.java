import java.util.Scanner;

public class Switchcaseex {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your choice:");
        int choice=sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("Fan is on");
                break;
            case 2:
                System.out.println("Light is on");
                break;
            case 3:
                System.out.println("Charging is on");
                break;
            default:
                System.out.println("Nothing is on");

        }
    }
}
