package drawingTool;

import java.awt.Color;

public class Whiskers {
	private int lenght;
	
	public Whiskers(int lenght) {
		this.lenght = lenght;
	}
	
	public void drawAt(int left, int bottom) {
		Color savedColor = Drawing.pen().getColor();
		Drawing.pen().setColor(Color.DARK_GRAY);
		for (int i = 0; i < 3; i++) {
			Drawing.pen().drawLine(left, bottom - lenght / 8, left + lenght, bottom - lenght / 8 * i);
		}
		Drawing.pen().setColor(savedColor);
	}
}
