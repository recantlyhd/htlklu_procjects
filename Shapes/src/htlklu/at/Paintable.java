package htlklu.at;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public interface Paintable {
	void paint(Graphics g);
	void setColor(Color color);
	Color getColor();
	void setPosition(Point point);
}
