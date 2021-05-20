package htlklu.at;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.List;

import javax.swing.JPanel;

public class ShapePanel extends JPanel implements MouseListener {

	private List<Shape> shapes;

	/**
	 * Create the panel.
	 */
	public ShapePanel() {
		this.addMouseListener(this);
	}

	@Override
	protected void paintComponent(Graphics g) {
		// TODO Auto-generated method stub
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D)g;
		g2d.clearRect(0, 0, getWidth(), getHeight());
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (MouseEvent.BUTTON1 == e.getButton()) {
			shapes = ShapeTool.generateRandomShapes(30);
		}
		repaint();
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub

	}
}
