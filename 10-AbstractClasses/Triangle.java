public class Triangle extends Shape {

    private double a;
    private double h;
    public Triangle(double a, double h) {
        this.a = a;
        this.h = h;
    }
    @Override
    public double area() {
        return (0.5) * (this.a * this.h);
    }

    
    
}
