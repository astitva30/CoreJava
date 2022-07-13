import javax.media.Player;
import javax.media.Manager;
import java.io.File;

class MediaLibrary
{
	static public void main(String...ar)
	{
		Player play = Manager.createRealizedPlayer(new File("C:\\java\\fur_elise.mp3").toURI().toURL());

		play.start();
		Thread.sleep(8000);
	}
}