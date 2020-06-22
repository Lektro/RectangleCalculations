public class Rectangle {

    // Class Variables
    double width = 1;
    double height = 3;
    double area;
    double perimeter;

    // Main
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea();
        r.getPerimeter();
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
