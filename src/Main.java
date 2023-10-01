public class Main
{
    public static void main(String[] args)
    {
        Shape circle = new Circle(4);
        System.out.println("Circle area: " + circle.getArea() );
        System.out.println("Circle perimeter: " + circle.getPerimeter());
        Shape rectangle = new Rectangle(8, 16);
        System.out.println("Rectangle area: " + rectangle.getArea());
        System.out.println("Rectangle area: " + rectangle.getPerimeter());
    }
}
