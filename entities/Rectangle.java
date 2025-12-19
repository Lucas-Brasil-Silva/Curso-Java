package entities;

public class Rectangle {
    
    public static double area(double width, double height) {
        return width * height;
    }

    public static double perimeter(double width, double heigth) {
        return (width + heigth) * 2;
    }

    public static double diagonal(double width, double height) {
        return Math.sqrt(Math.pow(width, 2) + Math.pow(height, 2));
    }
}
