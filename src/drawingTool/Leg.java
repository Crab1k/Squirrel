package drawingTool;

public class Leg {
	private int lenght;
	private Claws claws;
	
	public Leg(int lenght) {
		this.lenght = lenght;
		claws = new Claws(lenght / 4);
	}
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().fillRect(left, bottom - lenght / 4, lenght, lenght / 4);
		Drawing.pen().fillArc(left + lenght / 2, bottom - lenght, lenght, lenght * 2, 110, -45);
		claws.drawAt(left, bottom);
	}
}
