package drawingTool;

import java.awt.Color;

public class Squirrel {
	private Body body;
	private Head head;
	private Tail tail;
	private Leg leftLeg, rightLeg;
	private Hand leftHand, rightHand;
	private Color color;
	
	public Squirrel() {
		body = new Body(600, 350);
		head = new Head(400);
		tail = new Tail(750);
		leftHand = new Hand(300);
		rightHand = new Hand(300);
		leftLeg = new Leg(500);
		rightLeg = new Leg(500);
		color = new Color(192, 92, 40);
	}
	
	public Color getColor() {
		return color;
	}
	
	public void drawAt(int left, int bottom) {
		Drawing.pen().setColor(color);
		rightHand.drawAt(left + head.getSize() / 3, bottom - body.getLenght() * 2 / 3);
		rightLeg.drawAt(left + head.getSize() * 2 / 3, bottom - head.getSize() / 6);
		body.drawAt(left + head.getSize() / 2, bottom);
		leftHand.drawAt(left + head.getSize() / 2, bottom - body.getLenght() * 3 / 5);
		leftLeg.drawAt(left + head.getSize(), bottom);
		head.drawAt(left, bottom - body.getLenght() / 4 * 3);
		tail.drawAt(left + body.getLenght() + body.getHeight(), bottom - body.getHeight() / 3);
	}
}
