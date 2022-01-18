
package memorygamenikola;

import java.awt.Color;
import java.awt.Insets;
import javax.swing.JButton;
import javax.swing.border.LineBorder;


public class Dugme extends JButton {

    private int id;    
    public Dugme d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12;
    
    public Dugme(int id) {
        this.id = id;     
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public Dugme() {
            ImageIcons slike = new ImageIcons();                                
             d1 = new Dugme(1);   d2 = new Dugme(1);
             d3 = new Dugme(2);   d4 = new Dugme(2);                     
             d5 = new Dugme(3);   d6 = new Dugme(3);
             d7 = new Dugme(4);   d8 = new Dugme(4);
             d9 = new Dugme(5);   d10 = new Dugme(5);
             d11 = new Dugme(6);  d12 = new Dugme(6);
            
            d1.setText(""); d1.setBackground(Color.WHITE);    d1.setIcon(slike.pozadinabtn);  //d1.setMargin(new Insets(0,0,0,0)); 
            d2.setText(""); d2.setBackground(Color.WHITE);    d2.setIcon(slike.pozadinabtn);  //d2.setMargin(new Insets(0,0,0,0));  
            d3.setText(""); d3.setBackground(Color.WHITE);    d3.setIcon(slike.pozadinabtn);  //d3.setMargin(new Insets(0,0,0,0));        
            d4.setText(""); d4.setBackground(Color.WHITE);    d4.setIcon(slike.pozadinabtn);  //d4.setMargin(new Insets(0,0,0,0));
            d5.setText(""); d5.setBackground(Color.WHITE);    d5.setIcon(slike.pozadinabtn);  //d5.setMargin(new Insets(0,0,0,0));
            d6.setText(""); d6.setBackground(Color.WHITE);    d6.setIcon(slike.pozadinabtn);  //d6.setMargin(new Insets(0,0,0,0));
            d7.setText(""); d7.setBackground(Color.WHITE);    d7.setIcon(slike.pozadinabtn);  //d7.setMargin(new Insets(0,0,0,0));
            d8.setText(""); d8.setBackground(Color.WHITE);    d8.setIcon(slike.pozadinabtn);  //d8.setMargin(new Insets(0,0,0,0));
            d9.setText(""); d9.setBackground(Color.WHITE);    d9.setIcon(slike.pozadinabtn);  //d9.setMargin(new Insets(0,0,0,0));
            d10.setText(""); d10.setBackground(Color.WHITE); d10.setIcon(slike.pozadinabtn); //d10.setMargin(new Insets(0,0,0,0));
            d11.setText(""); d11.setBackground(Color.WHITE); d11.setIcon(slike.pozadinabtn); //d11.setMargin(new Insets(0,0,0,0));
            d12.setText(""); d12.setBackground(Color.WHITE); d12.setIcon(slike.pozadinabtn); //d12.setMargin(new Insets(0,0,0,0));
            
            
           
            d1.setBorder(null); d1.setBorderPainted(false); d1.setContentAreaFilled(false); d1.setOpaque(false);
            d2.setBorder(null); d2.setBorderPainted(false); d2.setContentAreaFilled(false); d2.setOpaque(false);
            d3.setBorder(null); d3.setBorderPainted(false); d3.setContentAreaFilled(false); d3.setOpaque(false);
            d4.setBorder(null); d4.setBorderPainted(false); d4.setContentAreaFilled(false); d4.setOpaque(false);
            d5.setBorder(null); d5.setBorderPainted(false); d5.setContentAreaFilled(false); d5.setOpaque(false);
            d6.setBorder(null); d6.setBorderPainted(false); d6.setContentAreaFilled(false); d6.setOpaque(false);
            d7.setBorder(null); d7.setBorderPainted(false); d7.setContentAreaFilled(false); d7.setOpaque(false);
            d8.setBorder(null); d8.setBorderPainted(false); d8.setContentAreaFilled(false); d8.setOpaque(false);
            d9.setBorder(null); d9.setBorderPainted(false); d9.setContentAreaFilled(false); d9.setOpaque(false);
            d10.setBorder(null); d10.setBorderPainted(false); d10.setContentAreaFilled(false); d10.setOpaque(false);
            d11.setBorder(null); d11.setBorderPainted(false); d11.setContentAreaFilled(false); d11.setOpaque(false);
            d12.setBorder(null); d12.setBorderPainted(false); d12.setContentAreaFilled(false); d12.setOpaque(false);
       
 
            
             // .setBorder(null);
             // .setBorderPainted(false);
             // .setContentAreaFilled(false);
             // .setOpaque(false);
             //d1.setBorder(new LineBorder(Color.BLACK));
        
    }
 
    
}
