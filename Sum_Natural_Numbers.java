import java.util.Scanner;

public class Sum_Natural_Numbers {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      int n;
      System.out.print("Enter natural number: ");
      n= obj.nextInt(); 
      int sum=0;
      for(int i =1;i<=n;i++){
         sum+=i;
      }
      System.err.println("Sum of natural numbers upto "+n+" is "+sum);
    }
}
