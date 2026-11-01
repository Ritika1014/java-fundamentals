import java.util.Scanner;
public class Greatest_number {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      int num1;
      System.out.print("Enter First number: ");
      num1 = obj.nextInt();
      int num2;
      System.err.print("Enter Second Number: ");
      num2 = obj.nextInt();
      if(num1<num2){
        System.err.println(num2+" is greatest number");
      }
      else if(num1==num2){
        System.out.println(num1 + " and " + num2 + " are equal");
      }
      else{
        System.out.println(num1+" is greatest number");
      }
      obj.close();
    }
}
