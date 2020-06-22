public class Rectangle {

    // Class Variables
    // Maak eens constructors, één zonder argumenten (default constructor) en één met argumenten voor width en height.
    // In de declaratie van de class variables gaan we best geen values hardcoden, tenzij het om finals/constanten gaat.
    double width = 1;
    double height = 3;
    double area;
    double perimeter;

    // Main
    // Meestal zetten we de main methode in een aparte klasse, die we dan bijvoorbeeld RectangleApp.java noemen.
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        r.getArea();
        r.getPerimeter();
    }

    // Method to calculate the area of the given rectangle
    // Als je je main methode in een aparte klasse hebt gezet, kan je deze methode dan nog oproepen als hij private is?
    private void getArea (){
        area = width * height;
        // Ik zou van value en value ook width en height maken om het iets duidelijker te maken. Muggengezift.
        System.out.println("The total area for value: " + width + " and value: " + height + " equals: " + area);
    }
    
    // Method to calculate the perimeter of the given rectangle.
    private void getPerimeter(){
        perimeter = (width * 2) + (height * 2);
        // Zelfde opmerking. Muggengezift.
        System.out.println("The perimeter for value: " + width + " and value: " + height + " equals: " + perimeter);
    }
}
