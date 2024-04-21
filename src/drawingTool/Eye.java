package drawingTool;

import java.awt.Color;

public class Eye {
	private int diameter;
	private Color color;
	
	public Eye(int diameter, Color color) {
		this.diameter = diameter;
		this.color = color;
	}
	
	public void drawAt(int left, int bottom) {
		Color savedColor = Drawing.pen().getColor();
		Drawing.pen().setColor(color);
		Drawing.pen().fillOval(left, bottom - diameter, diameter, diameter);
		Drawing.pen().setColor(savedColor);
	}
}
