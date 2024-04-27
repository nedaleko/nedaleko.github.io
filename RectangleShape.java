/*
 *	===============================================================================
 *	RectangleShape.java : A shape that is a rectangle.
 *  YOUR UPI: hche697
 *	=============================================================================== */
import java.awt.*;
class RectangleShape extends Shape {
    public RectangleShape() {}
	public RectangleShape(int x, int y, int w, int h, int pw, int ph, Color c, Color bc, PathType pt) {
		super(x ,y ,w, h ,pw ,ph, c, bc, pt);
	}
	public void draw(Graphics g) {
        g.setColor(super.color);
        g.fillRect(super.x, super.y, super.width, super.height);
        g.setColor(super.borderColor);
        g.drawRect(super.x, super.y, super.width, super.height);
	}
}