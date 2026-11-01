import java.util.Scanner;
class Add_Numbers {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      int num1;
      System.out.print("Enter First number: ");
      num1 = obj.nextInt();
      int num2;
      System.err.print("Enter Second Number: ");
      num2 = obj.nextInt();
      int sum = num1+num2;
      System.err.println("Sum of "+num1 + " and " +num2+ " is "+sum);
      obj.close();
    }
}
