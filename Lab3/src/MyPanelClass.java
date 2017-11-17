import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.JPanel;
import java.awt.Polygon;
 
public class MyPanelClass extends JPanel {
            /**
	 * 
	 */
	private static final long serialVersionUID = 7057541440811488699L;

			public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        //g.setColor(Color.GREEN);
                        //g.fillRect(x1, y1, width + 1, height + 1);
                      //Draw a border
//                        g.setColor(Color.YELLOW);
//                        g.drawRect(x1, y1, width, height);
//                      //Draw other border  
//                        g.setColor(Color.BLACK);
//                        g.drawRect(x1+10, y1+10, width-20, height-20);
//                        
//                        g.setColor(Color.WHITE);
//                        g.drawLine(x1, y1, x2, y2);
//                        
//                        g.setColor(Color.red);
//                        g.drawLine(x1, y1+height, x2, y2-height);
                        
//                        g.setColor(Color.LIGHT_GRAY);
//                        g.fillOval(width/2 - 55/2, height/2 - 55/2, 55, 55);
                        
//                        Polygon p = new Polygon();
//                        p.addPoint(x1 + 5, y1 + 25);
//                        p.addPoint(x1 + 20, y1 + 10);
//                        p.addPoint(x1 + 35, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 25);
//                        p.addPoint(x1 + 25, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 45);
//                        p.addPoint(x1 + 15, y1 + 25);
//                        g.setColor(Color.YELLOW);
//                        g.fillPolygon(p);
                        
                        //Red Stripes
                        g.setColor(Color.red);
                        g.fillRect(x1, y1, width, height);
                        
                        //White Stripes
                        g.setColor(Color.WHITE);
                        g.fillRect(x1, height/5, width, height/5);
                        g.fillRect(x1, height/5 + 2*height/5, width, height/5);                      
                        
                        //Blue Triangle
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1, y1);
                        p3.addPoint(x1, height);
                        p3.addPoint(width/3, height/2);
                        g.setColor(Color.blue);
                        g.fillPolygon(p3);
                        
                        //White Star
                        Polygon p2 = new Polygon();
                        p2.addPoint((width/6)-22 + 0, (height/2)-20 + 15);
                        p2.addPoint((width/6)-22 + 16, (height/2)-20 + 15);
                        p2.addPoint((width/6)-22 + 22, (height/2)-20 + 0);
                        p2.addPoint((width/6)-22 + 28, (height/2)-20 + 15);
                        p2.addPoint((width/6)-22 + 44, (height/2)-20 + 15);
                        p2.addPoint((width/6)-22 + 31, (height/2)-20 + 25);
                        p2.addPoint((width/6)-22 + 36, (height/2)-20 + 40);
                        p2.addPoint((width/6)-22 + 22, (height/2)-20 + 30);
                        p2.addPoint((width/6)-22 + 9, (height/2)-20 + 40);
                        p2.addPoint((width/6)-22 + 13, (height/2)-20 + 25);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        
            }
}
