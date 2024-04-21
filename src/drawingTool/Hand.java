package drawingTool;

public class Hand {
	private int lenght;
	
	public Hand(int lenght) {
		this.lenght = lenght;
	}
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().fillRect(left, bottom - lenght / 6, lenght, lenght / 6);
	}
}
