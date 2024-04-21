package drawingTool;

public class Tail {
	private int lenght;
	
	public Tail(int lenght) {
		this.lenght = lenght;
	}
	
	public void drawAt(int left, int bottom) {
		int pointsX[] = {left, left, left + lenght / 3, left + lenght * 2 / 3, left + lenght / 3, left + lenght / 4};
		int pointsY[] = {bottom, bottom - lenght * 5 / 6, bottom - lenght, bottom - lenght, bottom - lenght * 4 / 6, bottom - lenght / 6};
		
		Drawing.pen().fillPolygon(pointsX, pointsY, 6);
		Drawing.pen().drawPolygon(pointsX, pointsY, 6);
	}
}
