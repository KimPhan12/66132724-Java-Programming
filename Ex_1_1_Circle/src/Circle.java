public class Circle {
	private double radius;
	private String color;

	public Circle() {
		radius = 1.0;
		color = "red";
	}

	public Circle(double radius) {
		this.radius = radius;
	}

	public Circle(double radius, String color) {
		this.radius = radius;
		this.color = color;
	}

	public double getRadius() {
		return this.radius;
	}

	public String getColor() {
		return this.color;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String ToString() {
		String s = "Hinh tron co ban kinh " + radius + " va co mau " + color;
		return s;
	}

	public double getArea() {
		double area = radius * radius * Math.PI;
		return area;
	}

	public static void main(String[] args) {

		Circle ht1 = new Circle(1.2, "blue");

		ht1.setColor("black");
		System.out.println("mau hien tai la mau " + ht1.getColor());

		ht1.setRadius(5.4);
		System.out.println("ban kinh hien tai la " + ht1.getRadius());

		System.out.println(ht1.ToString());
	}
}