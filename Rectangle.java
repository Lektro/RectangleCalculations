import java.util.Scanner;

public class Rectangle {

    // Class Variables
    double width;
    double height;
    double area;
    double perimeter;

    // Main
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.setUserInput();
        r.getArea1();
        r.getPerimeter1();

        Rectangle r1 = new Rectangle();
        r1.setUserInput();
        r1.getArea2();
        r1.getPerimeter2();

    }

    private void setUserInput() {
        Scanner sc = new Scanner(System.in);                        // Create a Scanner object

        System.out.println("Enter a width for the Rectangle");      // Prompt the user to enter String
        String userWidth = sc.nextLine();                           // Read user input
        this.width = Double.parseDouble((userWidth));

        System.out.println("Enter a height for the Rectangle");      // Prompt the user to enter String
        String userHeight = sc.nextLine();                           // Read user input
        this.height = Double.parseDouble((userHeight));

    }

    // Method to calculate the area of the given rectangle
    private void getArea1() {
        area = width * height;
        System.out.println("The total area for a rectangle with width: " + width + " and height: " + height + " equals: " + area);
    }

    // Method to calculate the perimeter of the given rectangle.
    private void getPerimeter1() {
        perimeter = (width * 2) + (height * 2);
        System.out.println("The perimeter for a rectangle with width: " + width + " and height: " + height + " equals: " + perimeter);
    }

    // Method to calculate the area of the given rectangle
    private void getArea2() {
        area = width * height;
        System.out.println("The total area for a rectangle with width: " + width + " and height: " + height + " equals: " + area);
    }

    // Method to calculate the perimeter of the given rectangle.
    private void getPerimeter2() {
        perimeter = (width * 2) + (height * 2);
        System.out.println("The perimeter for the rectangle with width: " + width + " and height: " + height + " equals: " + perimeter);
    }
}
