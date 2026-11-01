import java.util.Scanner;
class find_Area {
    int area;
    int Area(int length, int breadth){
        area = length * breadth;
        return area;
    }
}
public class Area_Rectangle_ParameterizedMethods {
    public static void main(String[] args) {
        find_Area obj = new find_Area();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter length of the rectangle: ");
        int length = scanner.nextInt();
        System.out.print("Enter breadth of the rectangle: ");
        int breadth = scanner.nextInt();
        int area = obj.Area(length, breadth);
        System.out.println("Area of the rectangle is: " + area);
        scanner.close();
    }
}