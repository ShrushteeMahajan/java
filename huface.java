import java.applet.Applet;
import java.awt.*;
public class huface extends Applet
{
public void paint(Graphics g)
{
g.drawOval(40,40,200,200);
g.drawOval(80,80,40,30);
g.drawOval(160,80,40,30);
g.drawLine(140,110,140,160);
g.fillArc(85,160,110,50,180,180);
}
}

