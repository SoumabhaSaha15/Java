import java.applet.Applet;
import java.awt.Graphics;

public class AddNumbersApplet extends Applet {
    int num1 = 10; // First number
    int num2 = 20; // Second number
    int sum = num1 + num2; // Compute the sum

    public void paint(Graphics g) {
        g.drawString("First Number: " + num1, 50, 50);
        g.drawString("Second Number: " + num2, 50, 70);
        g.drawString("Sum: " + sum, 50, 90);
    }
}
