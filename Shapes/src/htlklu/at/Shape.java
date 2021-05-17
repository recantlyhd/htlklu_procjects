package htlklu.at;

public abstract class Shape implements Comparable<Shape> {

	private int id;
	private static int lastId = 0;
	private static final int DEFAULT_SIZE = 100;

	public Shape() {
		id = lastId;
		lastId++;
	}

	public int getId() {
		return id;
	}

	public abstract double getArea();

	public abstract double getCircumference();

	@Override
	public String toString() {
		return getClass().getSimpleName() + "id:" + getId() + "Area:" + getArea() + "Circumference:"
				+ getCircumference();
	}

	@Override
	public int compareTo(Shape o) {
		
		int compareresult = Double.compare(this.getArea(), o.getArea());
		if(compareresult == 0) {
			return Double.compare(this.getCircumference(), o.getCircumference());
		}
		return compareresult;
	}
}
