public class SumOfDigit {
    public static void main(String[] args) {
        int num=12341;
        int sum=0;
        for(int i=0;i<=4;i++){
            int rem=num%10;
          num=num/10;
          sum=sum+rem;
        }
        System.out.println("Sum of all Number is:"+sum);
    }
}
