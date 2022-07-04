import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;

public class MyPanel extends JPanel {

    Image image;
    MyPanel(){

        image = new ImageIcon("rick.png").getImage(); // this creates Image out of ImageIcon
        this.setPreferredSize(new Dimension(500,500));

    }

    public void paint(Graphics g) {

        Graphics2D g2D = (Graphics2D) g; //we're casting g as g2D (Graphics2D has more options)

        g2D.drawImage(image,50,50,null);

        g2D.setPaint(Color.GREEN);
        g2D.setStroke(new BasicStroke(5));
//        g2D.drawLine(0,0,500,500);
//        g2D.drawRect(10,10,100,200);
//        g2D.setPaint(Color.RED);
//        g2D.fillRect(300,10,50,100);
        g2D.setPaint(Color.BLACK);
        g2D.fillOval(205,180,60,70);
        g2D.fillOval(275,180,60,70);
        g2D.drawArc(260,200,20,20,0,180);

        g2D.setPaint(Color.RED);
        int[] xPoints = {170,260,350};
        int[] yPoints = {140,20,140};
        g2D.fillPolygon(xPoints,yPoints,3);

        g2D.setPaint(Color.RED);
        g2D.setFont(new Font(null, Font.BOLD,40));
        g2D.drawString("Nice shades gramps",10,450);



    }
}
