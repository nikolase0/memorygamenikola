package memorygamenikola;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Frame {

    JFrame okvir = new JFrame("Game");  
    JLabel label;
    JMenuBar menuBar;
    JMenu menu, menu2;
    JMenuItem menuItem1, menuItem2, menuItem3;
    GridLayout grid = new GridLayout(4, 3, 25, 25);

    public Frame(){

        DugmePress game = new DugmePress();     
        

        menuBar = new JMenuBar();
        menu = new JMenu("Game");
        menu2 = new JMenu("Exit");
        menuBar.add(menu);
        menuBar.add(menu2);
        menuItem1 = new JMenuItem("Restart", new ImageIcon("src\\resources\\restart.png"));
        menu.add(menuItem1);
        menuItem2 = new JMenuItem("EXIT", new ImageIcon("src\\resources\\exit.png"));
        menuItem3 = new JMenuItem("EXIT", new ImageIcon("src\\resources\\exit.png"));
        menu.add(menuItem2);
        menu2.add(menuItem3);
        okvir.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okvir.setLocation(400, 20);
        label = new JLabel();
        okvir.setContentPane(new JLabel(new ImageIcon("src\\resources\\beachpozadina.jpg")));
        okvir.setSize(1200, 1000);
        okvir.setLayout(grid);        
        okvir.setJMenuBar(menuBar);       
        //okvir.setVisible(true);
      
        

        ActionListener restartal = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getSource() == menuItem1) {
                    try {
                        okvir.setVisible(false);
                        menuItem1.addMouseListener(new Meni());
                    } catch (UnsupportedAudioFileException | IOException | LineUnavailableException | SQLException ex) {
                        Logger.getLogger(Frame.class.getName()).log(Level.SEVERE, null, ex);
                    }

                }
                if (e.getSource() == menuItem2) {
                    System.exit(0);
                }
                if (e.getSource() == menuItem3) {
                    System.exit(0);
                }
            }

        };
        menuItem1.addActionListener(restartal);
        menuItem2.addActionListener(restartal);
        menuItem3.addActionListener(restartal);
    }
    
    
  

}
