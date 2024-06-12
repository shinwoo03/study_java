package video;

public class VideoMain {
	public static void main(String[] args) {
		Thread smi = new SMIThread();
		Thread video = new VideoThread();
		smi.start();
		video.start();
	}

}
