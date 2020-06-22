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
        r.getArea();
        r.getPerimeter();

        Rectangle r1 = new Rectangle();
        r1.setUserInput();
        r1.getArea();
        r1.getPerimeter();

    }
    private void setUserInput(){
        Scanner sc = new Scanner(System.in);                        // Create a Scanner object

        // Code herhaling, gaat er een belletje rinkelen?
        System.out.println("Enter a width for the Rectangle");      // Prompt the user to enter String
        String userWidth = sc.nextLine();                           // Read user input
        this.width = Double.parseDouble((userWidth));

        System.out.println("Enter a height for the Rectangle");      // Prompt the user to enter String
        String userHeight = sc.nextLine();                           // Read user input
        this.height = Double.parseDouble((userHeight));

    }

    // Method to calculate the area of the given rectangle
    private void getArea (){
        area = width * height;
        System.out.println("The total area for value: " + width + " and value: " + height + " equals: " + area);
    }

    // Method to calculate the perimeter of the given rectangle.
    private void getPerimeter(){
        perimeter = (width * 2) + (height * 2);
        System.out.println("The perimeter for value: " + width + " and value: " + height + " equals: " + perimeter);
    }
}
