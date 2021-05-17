package htlklu.at;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShapeTool {
	public static void main(String[] args) {
		List <Shape> shapes = generateRandomShapes(9);
		writeShapesToFile(shapes, "sorted_shapes.txt");
	}

	public static void writeShapesToFile(List<Shape> shapes, String filename) {
		try {
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			Collections.sort(shapes);
			for(Shape s : shapes) {
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
