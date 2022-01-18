package memorygamenikola;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

public class Clips {

    File file, file1, file2, file3, file4;
    Clip clip, clip1, clip2, clip3, clip4;

    public Clips() throws UnsupportedAudioFileException, IOException, LineUnavailableException {
        //file = new File("C:\\Users\\nikol\\OneDrive\\Documents\\NetBeansProjects\\memorygamenikola\\src\\resources\\bubble.wav");
        file = new File("src\\resources\\bubbleclick.wav");
        file1 = new File("src\\resources\\pogodakklik.wav");
        file2 = new File("src\\resources\\aplauz1.wav");
        file3 = new File("src\\resources\\menimuzika.wav");
        file4 = new File("src\\resources\\error.wav");
        clip = AudioSystem.getClip();
        clip1 = AudioSystem.getClip();
        clip2 = AudioSystem.getClip();
        clip3 = AudioSystem.getClip();
        clip4 = AudioSystem.getClip();

        AudioInputStream audioStream = AudioSystem.getAudioInputStream(file);
        clip.open(audioStream);
        AudioInputStream audioStream1 = AudioSystem.getAudioInputStream(file1);
        clip1.open(audioStream1);
        AudioInputStream audioStream2 = AudioSystem.getAudioInputStream(file2);
        clip2.open(audioStream2);
        AudioInputStream audioStream3 = AudioSystem.getAudioInputStream(file3);
        clip3.open(audioStream3);
        AudioInputStream audioStream4 = AudioSystem.getAudioInputStream(file4);
        clip4.open(audioStream4);

    }

}
