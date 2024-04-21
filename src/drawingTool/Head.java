package drawingTool;

import java.awt.Color;

public class Head {
	private int size;
	private Eye leftEye, rightEye;
	private Ear leftEar, rightEar;
	private Nose nose;
	private Whiskers whiskers;
	
	public Head(int size) {
		this.size = size;
		leftEye = new Eye(size / 5, Color.BLACK);
		rightEye = new Eye(size / 5, Color.BLACK);
		leftEar = new Ear(size / 5);
		rightEar = new Ear(size / 5);
		nose = new Nose(size / 12, Color.DARK_GRAY);
		whiskers = new Whiskers(size / 3);
	}
	
	public int getSize() {
		return size;
	}
	
	public void drawAt(int left, int bottom) {
		rightEar.drawAt(left + size / 2, bottom - size * 8 / 9);
		Drawing.pen().fillOval(left, bottom - size, size, size / 3 * 2);
		//right eye isn't visible
		leftEar.drawAt(left + size / 10 * 6, bottom - size * 7 / 8);
		leftEye.drawAt(left + size / 4, bottom - size / 3 * 2);
		nose.drawAt(left, bottom - size / 2);
		whiskers.drawAt(left + size / 8, bottom - size / 2);
	}
}
