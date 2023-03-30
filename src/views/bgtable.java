package views;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
/**
 *
 * @author KKP FOCON UNINDRA
 */
public class bgtable extends JPanel{
    private Image img;
    public bgtable(){
        img = new ImageIcon(getClass().getResource("/images/bgtable.jpg")).getImage();
        
    }
    @Override
    protected void paintComponent(Graphics graph){
        super.paintComponents(graph);
        Graphics2D gd = (Graphics2D) graph.create();
        gd.drawImage(img,0,0, getWidth(), getHeight(), null);
        gd.dispose();
    }    
}
