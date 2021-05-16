package htlklu.at;

public class Rectangle extends Shape {

	private double width, height;

	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}

	@Override
	public double getCircumference() {
		// TODO Auto-generated method stub
		return 2 * width * height;
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return super.toString() + "size: [" + getWidth() + "/" + getHeight() + "]";
	}
}
