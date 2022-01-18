package memorygamenikola;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;

public class Meni extends MouseAdapter {

    JFrame okvirmeni, okvirp;  
    JTextField tf;
    JPanel titleNamePanel, startButtonPanel, namePanel;
    JLabel titleNameLabel, nameLabel,porukaLabel;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 80);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 50);
    Font normalFont1 = new Font("Times New Roman", Font.PLAIN, 25);
    JButton startButton , exitButton, restartButton, exitButton1 ;   
    int skor=0;   
    String poruka;

    
    
    public Meni() throws UnsupportedAudioFileException, IOException, LineUnavailableException, SQLException{
        Clips zvuk = new Clips(); 
        ImageIcons slike = new ImageIcons();       
        tf = new JTextField(10);       
        nameLabel = new JLabel("Username");       
        tf.setBounds(250, 100, 700, 100); 
        poruka = "Igrac " +tf.getText()+" je napravio skor: " +skor;
        okvirmeni = new JFrame("Welcome");            
        okvirmeni.setSize(1200, 1000);
        okvirmeni.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okvirmeni.add(tf); //OVDE      
        okvirmeni.setLocation(400, 20);            
        okvirmeni.setContentPane(new JLabel(new ImageIcon("src\\resources\\beachpozadina.jpg")));
        okvirmeni.setLayout(null);
       
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(250, 100, 700, 150); //VELICINA NASLOVA
        titleNamePanel.setBackground(Color.gray); // POZADINA NASLOVA
        
        okvirp = new JFrame("Game is over");
        okvirp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        okvirp.setContentPane(new JLabel(new ImageIcon("src\\resources\\beachpozadina.jpg")));
        okvirp.setSize(1200, 1000);
        okvirp.setLocation(400, 20);
       
               
        titleNameLabel = new JLabel("Memory Game");
        titleNameLabel.setForeground(Color.white); //BOJA SLOVA
        titleNameLabel.setFont(titleFont); // FONT NASLOVA       
        titleNameLabel.setBounds(350, 50, 700, 150);
        
        nameLabel.setForeground(Color.white);
        nameLabel.setFont(normalFont1);
        nameLabel.setBounds(530, 310, 500, 50);
      
        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(450, 500, 300, 500);
        startButtonPanel.setBackground(Color.gray); //POZADINSKA BOJA PANELA 
        
        namePanel = new JPanel();
        namePanel.setBounds(520,350,120,30);
        namePanel.setBackground(Color.white);
        namePanel.add(tf); //OVDE
        
        startButton = new JButton("Start");      
        startButton.setForeground(Color.white); //BOJA BUTTON SLOVA
        startButton.setFont(normalFont);
        startButton.setBounds(450, 400, 250, 80);       
        
        startButton.setBorder(null);
        startButton.setBorderPainted(false);
        startButton.setContentAreaFilled(false);
        startButton.setOpaque(false);
        
        restartButton = new JButton("Play Again");      
        restartButton.setForeground(Color.white); //BOJA BUTTON SLOVA
        restartButton.setFont(normalFont);
        restartButton.setBounds(450, 400, 250, 80);
        
        restartButton.setBorder(null);
        restartButton.setBorderPainted(false);
        restartButton.setContentAreaFilled(false);
        restartButton.setOpaque(false);
                  
        exitButton = new JButton("Exit");   exitButton1 = new JButton("Exit");      
        exitButton.setForeground(Color.white); exitButton1.setForeground(Color.white);
        exitButton.setFont(normalFont);   exitButton1.setFont(normalFont);
        exitButton.setBounds(450, 500, 250, 80); exitButton1.setBounds(450, 500, 250, 80);
        
        exitButton.setBorder(null);
        exitButton.setBorderPainted(false);
        exitButton.setContentAreaFilled(false);
        exitButton.setOpaque(false);
        
        exitButton1.setBorder(null);
        exitButton1.setBorderPainted(false);
        exitButton1.setContentAreaFilled(false);
        exitButton1.setOpaque(false);
       
        okvirmeni.add(titleNameLabel);
        okvirmeni.add(startButton);
        okvirmeni.add(exitButton);
        okvirmeni.add(namePanel);
        okvirmeni.add(nameLabel);
        okvirp.add(restartButton);
        okvirp.add(exitButton1);
              
        startButton.addMouseListener(this);
        exitButton.addMouseListener(new ExitListener());
        restartButton.addMouseListener(this);
        exitButton1.addMouseListener(new ExitListener());
        okvirmeni.setVisible(true); 
        //zvuk.clip3.loop(1);           
    }
            @Override
            public void mouseClicked(MouseEvent e) {                             
            super.mouseClicked(e);
 
            Dugme dugme = new Dugme();
            Frame frame = new Frame(); 
            DugmePress game = new DugmePress();
            ImageIcons slike = new ImageIcons();                     
            okvirmeni.dispose();           
                                    
            List l = new ArrayList();
            l.add(dugme.d1);l.add(dugme.d2);l.add(dugme.d3);l.add(dugme.d4);l.add(dugme.d5);l.add(dugme.d6);l.add(dugme.d7);
            l.add(dugme.d8);l.add(dugme.d9);l.add(dugme.d10);l.add(dugme.d11);l.add(dugme.d12);
            Collections.shuffle(l);
            for (int i = 0; i < 12; i++) {
                frame.okvir.add((Component) l.get(i));
            }               
            frame.okvir.setVisible(true);
                       
            Timer timer = new Timer(700, new ActionListener() {                         
                @Override
                public void actionPerformed(ActionEvent e) {
                    try {
                        Clips zvuk = new Clips();                       
                        if (game.getDugmepress1().getId() == game.getDugmepress2().getId()) {
                            skor++;
                            zvuk.clip1.start();
                            game.getDugmepress1().setVisible(false);
                            game.getDugmepress2().setVisible(false);
                            game.setPogodak(game.getPogodak() + 1 );                                                 
                            if (game.getPogodak() == 6) {                              
                                zvuk.clip2.start(); 
                                frame.okvir.setVisible(false);                                                                                                                                
                                try {
                                    ispisi();
                                    upis();                                                                     
                                } catch (SQLException ex) {
                                    Logger.getLogger(Meni.class.getName()).log(Level.SEVERE, null, ex);
                                }                               
                            }
                        } else {
                            zvuk.clip4.start();
                            game.getDugmepress1().setIcon(slike.pozadinabtn);
                            game.getDugmepress2().setIcon(slike.pozadinabtn);
                        }
                        game.setDugmepress1(null);
                        game.setDugmepress2(null);
                    } catch (UnsupportedAudioFileException ex) {
                        Logger.getLogger(Meni.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(Meni.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (LineUnavailableException ex) {
                        Logger.getLogger(Meni.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }                    
            });  
            
            ActionListener actionlistener = new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    game.setDugme((Dugme) e.getSource());
                    if (game.getDugmepress1() == null && game.getDugmepress2() == null) {
                        game.setDugmepress1(game.getDugme());
                        if (game.getDugmepress1().getId()==1) {
                            game.getDugmepress1().setIcon(slike.jagoda);
                        }
                        if (game.getDugmepress1().getId() == 2) {                           
                            game.getDugmepress1().setIcon(slike.jabuka);
                        }
                        if (game.getDugmepress1().getId() == 3) {                            
                            game.getDugmepress1().setIcon(slike.ananas);
                        }
                        if (game.getDugmepress1().getId() == 4) {                           
                            game.getDugmepress1().setIcon(slike.narandza);
                        }
                        if (game.getDugmepress1().getId() == 5) {
                            game.getDugmepress1().setIcon(slike.grozdje);
                        }
                        if (game.getDugmepress1().getId() == 6) {
                            game.getDugmepress1().setIcon(slike.lubenica);
                        }
                    }

                    if (game.getDugmepress1() != null && game.getDugmepress1() != game.getDugme() && game.getDugmepress2() == null) {
                        game.setDugmepress2(game.getDugme());
                        if (game.getDugmepress2().getId() == 1) {                           
                            game.getDugmepress2().setIcon(slike.jagoda);
                        }
                        if (game.getDugmepress2().getId() == 2) {
                            game.getDugmepress2().setIcon(slike.jabuka);
                        }
                        if (game.getDugmepress2().getId() == 3) {
                            game.getDugmepress2().setIcon(slike.ananas);
                        }
                        if (game.getDugmepress2().getId() == 4) {
                            game.getDugmepress2().setIcon(slike.narandza);
                        }
                        if (game.getDugmepress2().getId() == 5) {
                            game.getDugmepress2().setIcon(slike.grozdje);
                        }
                        if (game.getDugmepress2().getId() == 6) {
                            game.getDugmepress2().setIcon(slike.lubenica);
                        }
                        timer.start();                       
                    }
                    timer.setRepeats(false);                                                             
                }    
            };   
            dugme.d1.addActionListener(actionlistener); dugme.d1.addMouseListener(new KlikSlusac());
            dugme.d2.addActionListener(actionlistener); dugme.d2.addMouseListener(new KlikSlusac());
            dugme.d3.addActionListener(actionlistener); dugme.d3.addMouseListener(new KlikSlusac());
            dugme.d4.addActionListener(actionlistener); dugme.d4.addMouseListener(new KlikSlusac());
            dugme.d5.addActionListener(actionlistener); dugme.d5.addMouseListener(new KlikSlusac());
            dugme.d6.addActionListener(actionlistener); dugme.d6.addMouseListener(new KlikSlusac());
            dugme.d7.addActionListener(actionlistener); dugme.d7.addMouseListener(new KlikSlusac());
            dugme.d8.addActionListener(actionlistener); dugme.d8.addMouseListener(new KlikSlusac());
            dugme.d9.addActionListener(actionlistener); dugme.d9.addMouseListener(new KlikSlusac());
            dugme.d10.addActionListener(actionlistener); dugme.d10.addMouseListener(new KlikSlusac());
            dugme.d11.addActionListener(actionlistener); dugme.d11.addMouseListener(new KlikSlusac());
            dugme.d12.addActionListener(actionlistener); dugme.d12.addMouseListener(new KlikSlusac());                     
    }                                
                public void upis() throws SQLException{
                Connection baza = DBConnection.getConn();                     
                String query="Insert into korisnici(username,skor) values (?,?);";    
                PreparedStatement ps=baza.prepareStatement(query);                  
                ps.setString(1, tf.getText());
                ps.setInt(2, skor);          
                ps.executeUpdate();
}                   
                
                public void ispisi(){                                     
                     porukaLabel = new JLabel("Igrac "+tf.getText()+" je napravio skor: "+skor);
                     porukaLabel.setForeground(Color.white); //BOJA SLOVA
                     porukaLabel.setFont(normalFont); // FONT NASLOVA       
                     porukaLabel.setBounds(280, 150, 700, 150);
                     okvirp.add(porukaLabel);                                      
                     okvirp.setVisible(true);
                     
                }
                   
         //DRUGI NIVO IGRE!   
                                  
}



