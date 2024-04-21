package drawingTool;

import java.awt.Color;

public class Body {
	private int lenght, height;
	
	public Body(int lenght, int height) {
		if (lenght > height && lenght > 0 && height > 0) {
			this.lenght = lenght;
			this.height = height;
		}
	}
	
	public int getLenght() {
		return lenght;
	}
	
	public int getHeight() {
		return height;
	}
	
	public void drawAt(int left, int bottom) {
		int pointsX[] = {left + lenght, left, left + height / 2, left + height / 2 + lenght};
		int pointsY[] = {bottom, bottom - lenght, bottom - lenght - height / 2, bottom - height / 2};
		
		Drawing.pen().fillArc(left + lenght - height, bottom - height * 2, height * 9 / 5, height * 9 / 5, -75, 220);
		Drawing.pen().fillPolygon(pointsX, pointsY, 4);
		Drawing.pen().drawPolygon(pointsX, pointsY, 4);
	}
}
