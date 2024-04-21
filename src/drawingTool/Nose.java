package drawingTool;

import java.awt.Color;

public class Nose {
	private int size;
	private Color color;
	
	public Nose(int size, Color color) {
		this.size = size;
		this.color = color;
	}
	
	public void drawAt(int left, int bottom) {
		Color savedColor = Drawing.pen().getColor();
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(left, bottom - size, size, size);
		Drawing.pen().setColor(savedColor);
	}
}
