/*
 *	===============================================================================
 *	PolygonShape.java : A shape that is a polygon.
 *  YOUR UPI: hche697
 *	=============================================================================== */
import java.awt.*;
import java.util.Arrays;
class PolygonShape extends SquareShape {
	private Point centre = new Point(DEFAULT_HEIGHT/2, DEFAULT_HEIGHT/2);
	private int radius = DEFAULT_HEIGHT/2;
	private int numberOfSides = 6;
    public PolygonShape() {}
	public PolygonShape(int x, int y, int s, int pw, int ph, Color c, Color bc, PathType pt, ShapeType st) {
		super(x ,y ,s, pw ,ph, c, bc, pt);
		this.numberOfSides = st.getNumberOfSides();
		radius = s/2;
		centre  = new Point(x + width/2, y + height/2);
	}
	public void draw(Graphics g) {
        g.setColor(color);
        int[] xPoints = new int[numberOfSides];
        int[] yPoints = new int[numberOfSides];
        centre = new Point(super.x + radius, super.y + radius);
        for (int i = 0; i < numberOfSides; i++) {
            xPoints[i] = (int)(centre.x + (radius * Math.cos((2 * i * Math.PI) / numberOfSides)));
            yPoints[i] = (int)(centre.y + (radius * Math.sin((2 * i * Math.PI) / numberOfSides)));
        }
        Polygon p = new Polygon(xPoints, yPoints, numberOfSides);
        g.fillPolygon(p);
        g.setColor(borderColor);
        g.drawPolygon(p);
    }
}