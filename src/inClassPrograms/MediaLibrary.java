import javax.media.Player;
import javax.media.Manager;
import java.io.File;

class MediaLibrary
{
	static public void main(String...ar)throws Exception
	{
		Player play = Manager.createRealizedPlayer(new File("C:\\Users\\deshp\\Downloads\\fur_elise.wav").toURI().toURL());

		play.start();
		Thread.sleep(8000);
		play.stop();
		System.out.println("Song finished!");
		System.exit(0);
	}
}