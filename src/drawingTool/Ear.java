package drawingTool;

import java.awt.Color;

public class Ear {
	private int height;
	
	public Ear(int height) {
		this.height = height;
	}
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().fillArc(left, bottom - height, height / 2, height, 0, 180);		
	}
}
