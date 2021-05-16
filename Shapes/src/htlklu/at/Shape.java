package htlklu.at;

public abstract class Shape {

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
}
