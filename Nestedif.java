public class Nestedif {
    public static void main(String[] args) {
        int a=15;
        int b=12;
        if(a<=b) {
            System.out.println("Condition 1 is true..");
            if (a >= b) {
                System.out.println("Condition 2 is true");
            } else {
                System.out.println("Condition 2 is false");
            }
        }else {
            System.out.print("Condition all are  false");
        }
    }
}
