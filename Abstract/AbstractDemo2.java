package Abstract;
abstract class MediaPlayer
{
	void playAudio() {System.out.println("can play audio");};
	abstract void playVideo();
}

class VlcPlayer extends MediaPlayer
{
	public void playVideo()
	{
		System.out.println("can play video");
	}
}

class SoundRecorder extends MediaPlayer
{
	public void playVideo()
	{
		System.out.println("can't play video");
	}
}

public class AbstractDemo2 {

	public static void main(String[] args) {
		
		VlcPlayer ob=new VlcPlayer();
		ob.playVideo();
		ob.playAudio();
		
		SoundRecorder ob1=new SoundRecorder();
		ob1.playVideo();
		ob1.playAudio();
	    }
}
