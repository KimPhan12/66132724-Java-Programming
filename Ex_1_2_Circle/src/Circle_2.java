public class Circle_2 {

    private double radius;

    public Circle_2() {
        radius = 1.0;
    }

    public Circle_2(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = radius * radius * Math.PI;
        return area;
    }

    public double getCircumference() {
        return 2 * Math.PI * radius;
    }

    public String toString() {
        String s = "Circle[radius=" + radius + "]";
        return s;
    }

    public static void main(String[] args) {

        // Test Constructors and toString()
        Circle_2 c1 = new Circle_2(1.1);
        System.out.println(c1);

        Circle_2 c2 = new Circle_2();
        System.out.println(c2);

        // Test setter and getter
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());

        // Test getArea() and getCircumference()
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}