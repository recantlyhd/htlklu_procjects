package htlklu.at;

public class Circle extends Shape{
	
	private double radius;
	
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public Circle(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return radius * radius * Math.PI;
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 2 * radius * Math.PI;
	}
	public Circle getCircleFromArea(double area) {
		return new Circle(Math.pow(area, area)/ Math.PI);
	}
	public Circle getCircleFromCircumference(double circumference) {
		return new Circle(circumference/2 * Math.PI);
	}

	@Override
	public String toString() {
		return super.toString() + "radius: [" + getRadius() + "]";
	}
}
