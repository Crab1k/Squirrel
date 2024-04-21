package drawingTool;

import java.awt.Color;

public class Claws {
	private int size;
	
	public Claws(int size) {
		this.size = size;
	}
	
	public void drawAt(int left, int bottom) {
		Color savedColor = Drawing.pen().getColor();
		Drawing.pen().setColor(Color.BLACK);
		Drawing.pen().fillArc(left, bottom - size, size, size, 90, 180);
		Drawing.pen().setColor(Color.LIGHT_GRAY);
		Drawing.pen().fillOval(left + size / 8, bottom - size / 4 * 3, size / 4, size / 2);
		Drawing.pen().setColor(savedColor);
	}
}
