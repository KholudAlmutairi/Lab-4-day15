public class Main {
    public static void main(String[] args) {

        //---------------------------------Circle Class---------------------------

        Shape c1 = new Circle(0, 0, 10);
        System.out.println("Circle Area: " + c1.calculateArea());
        System.out.println("Circle Circumference: " + c1.calculateCircumference());

        //---------------------------------Rectangle Class---------------------------

        Shape r1 = new Rectangle(0, 0, 6, 10);
        System.out.println("Rectangle Area: " + r1.calculateArea());
        System.out.println("Rectangle Circumference: " + r1.calculateCircumference());

        //---------------------------------Triangle Class---------------------------

        Shape t1 = new Triangle(0, 0, 8, 7);
        System.out.println("Triangle Area: " + t1.calculateArea());
        System.out.println("Triangle Circumference: " + t1.calculateCircumference());





    }
}
