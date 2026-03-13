import java.util.Scanner;

public class Switchcaseex2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter your choice:");
        int choice =sc.nextInt();
        switch (choice){
            case 1:
                System.out.println("your so pretty.... ^ ^");
                break;
            case 2:
                System.out.println("Your so brave..#");
                break;
            case 3:
                System.out.println("Your so powerfull..*");
                break;
            case 4:
                System.out.println("chase your dreams...* *");
                break;
            default:
                System.out.println("please enter correct choice..");
        }

    }
}
