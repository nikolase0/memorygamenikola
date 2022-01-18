package memorygamenikola;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineListener;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class KlikSlusac extends MouseAdapter {

    @Override
    public void mouseClicked(MouseEvent e) {
        super.mouseClicked(e);
        File file = new File("src\\resources\\bubbleclick.wav");
        try {
            AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
            Clip clip = AudioSystem.getClip();
            clip.open(audioStream);
            clip.start();

        } catch (IOException e1) {
            e1.printStackTrace();
        } catch (UnsupportedAudioFileException ex) {
            Logger.getLogger(KlikSlusac.class.getName()).log(Level.SEVERE, null, ex);
        } catch (LineUnavailableException ex) {
            Logger.getLogger(KlikSlusac.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
