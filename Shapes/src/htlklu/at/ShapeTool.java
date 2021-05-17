package htlklu.at;

import java.awt.Color;
import java.awt.Point;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeTool {
	public static void main(String[] args) {
		List<Shape> shapes = generateRandomShapes(9);
		writeShapesToFile(shapes, "sorted_shapes.txt");
	}

	public static void setPositionsAndColors(List<Shape> shapes, int maxX, int maxY) {
		for (Shape s : shapes) {
			final int x = (int) Math.random() * maxX;
			final int y = (int) Math.random() * maxY;

			s.setPoint(new Point(x, y));
			if (s instanceof Circle) {
				s.setColor(Color.BLUE);
			} else if (s instanceof Rectangle) {
				s.setColor(Color.RED);
			} else if (s instanceof Square) {
				s.setColor(Color.GREEN);
			}
		}
	}

	public static void writeShapesToFile(List<Shape> shapes, String filename) {
		try {
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			Collections.sort(shapes);
			for (Shape s : shapes) {
				bw.write(s.toString() + "\n");
			}
			bw.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static List<Shape> generateRandomShapes(int count) {
		ArrayList<Shape> shapes = new ArrayList<>();
		int oneThird = count / 3;

		for (int i = 0; i < oneThird; i++) {
			shapes.add(new Rectangle(Math.random() * 100, Math.random() * 100));
		}

		for (int i = oneThird; i < oneThird * 2; i++) {
			shapes.add(new Square(Math.random() * 100));
		}

		for (int i = oneThird * 2; i < count; i++) {
			shapes.add(new Circle(Math.random() * 100));
		}

		return shapes;
	}
}
