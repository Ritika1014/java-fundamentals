import java.util.Scanner;
class Recursion_using_Classes {
    int factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        Recursion_using_Classes obj = new Recursion_using_Classes();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to compute its factorial: ");
        int number = scanner.nextInt();
        int result = obj.factorial(number);
        System.out.println("Factorial of " + number + " is: " + result);
        scanner.close();
    }
    
}