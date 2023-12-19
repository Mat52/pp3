
public class Test1 {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        System.out.println(circle.area());

        Rectangle rectangle = new Rectangle(2,3);
        System.out.println(rectangle.area());

        Triangle triangle = new Triangle(1,2);
        System.out.println(triangle.area());
    }
}
