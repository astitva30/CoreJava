import javax.media.Manager;
import javax.media.Player;
import java.io.File;
import javax.swing.JOptionPane;

class PlayerRewind{

    static public void main(String...arg)throws Exception
    {
        Player play = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657865200424-voicemaker.in-speech.wav").toURI().toURL());
        play.start();
	   Thread.sleep(2000);
	   play.stop();

		play = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Desktop\\kbcMedia\\1657865200424-voicemaker.in-speech.wav").toURI().toURL());
	   
		play.start();
		Thread.sleep(2000);
		play.stop();

		System.exit(0);
    }
}