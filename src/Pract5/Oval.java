package Pract5;
import java.awt.*;
public class Oval extends Shape{
    public Oval(int x1, int y1, int x2, int y2, Color color) {
        X1 = x1;
        Y1 = y1;
        X2 = x2;
        Y2 = y2;
        this.color = color;
    }
    protected void paintShape(Graphics g){
        g.drawOval(X1, Y1, X2-X1, Y2-Y1);
    }
}
