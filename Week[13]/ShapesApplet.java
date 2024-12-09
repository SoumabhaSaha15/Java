import java.applet.Applet;
import java.awt.Graphics;

public class ShapesApplet extends Applet {
    public void paint(Graphics g) {
        // Draw a line
        g.drawLine(50, 50, 200, 50);

        // Draw a rectangle
        g.drawRect(50, 70, 150, 100);

        // Draw an oval
        g.drawOval(50, 200, 150, 100);
    }
}
