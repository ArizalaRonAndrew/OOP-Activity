public class Acitivy {
    public static void main(String[] args) {

        Shape circle = new Circle(10.0, "red", true);
        System.out.println("The Area of the Circle is: " + circle.getArea());
        System.out.println("The Perimeter of the Circle is: " + circle.getPerimeter());
        System.out.println(circle.toString() + "\n");

        Shape rectangle = new Rectangle(10.0,20.0,"blue",true);
        System.out.println("The Area of the Rectangle is: " + rectangle.getArea());
        System.out.println("The Perimeter of the Rectangle is: " + rectangle.getPerimeter());
        System.out.println(rectangle.toString() + "\n");

        Shape square = new Square(20.0,20.0,30.0,"green",true);
        System.out.println("The Area of the Square is: " + square.getArea());
        System.out.println("The Perimeter of the Square is: " + square.getPerimeter());
        System.out.println(square.toString() + "\n");

    }
}
