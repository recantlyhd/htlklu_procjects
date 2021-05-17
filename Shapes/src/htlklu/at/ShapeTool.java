package htlklu.at;

import java.util.ArrayList;
import java.util.List;

public class ShapeTool {
	public static void main(String[] args) {

	}
	public static List<Shape> generateRandomShapes(int count){
		ArrayList<Shape> shapes = new ArrayList<>();
        int oneThird = count / 3;

        for (int i = 0; i < oneThird; i++) {
            shapes.add(new Rectangle(Math.random() *100, Math.random() * 100));
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
