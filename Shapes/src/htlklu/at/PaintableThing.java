package htlklu.at;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;

public abstract class PaintableThing implements Paintable{
	
	private Color color;
	private Point point;
	
	public PaintableThing() {
		this.color = color.BLACK;
		this.point = new Point(0,0);
	}

	@Override
	public abstract void paint(Graphics g);
	
	@Override
	public void setColor(Color color) {
		// TODO Auto-generated method stub
		this.color = color;
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void setPosition(Point point) {
		// TODO Auto-generated method stub
		
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
}	
