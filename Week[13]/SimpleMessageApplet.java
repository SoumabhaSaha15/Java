import java.applet.Applet;
import java.awt.Graphics;

public class SimpleMessageApplet extends Applet {
  public void paint(Graphics g) {
    g.drawString("Hello! Welcome to Java Applets!", 50, 50);
  }
}
