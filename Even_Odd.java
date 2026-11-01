import java.util.Scanner;
class Even_Odd {
    public static void main(String[] args) {
      Scanner obj=new Scanner(System.in);
      int num;
      System.out.print("Enter number: ");
      num= obj.nextInt();
      if(num%2==0){
        System.out.println("Entered Number is Even");
      }
      else{
        System.out.println("Entered Number is Odd");
      }
      obj.close();
    }
}
