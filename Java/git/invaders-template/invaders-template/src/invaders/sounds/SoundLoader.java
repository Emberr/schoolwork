package invaders.sounds;

import java.io.InputStream;
import java.util.HashMap;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class SoundLoader {
	private static final HashMap<String, Clip> cache = new HashMap<>();
	
	public static void play(String filename) {
		Clip clip = cache.get(filename);
		if (clip == null) {
			try (InputStream inputStream = SoundLoader.class.getResourceAsStream(filename)) {
				AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(inputStream);
				clip = AudioSystem.getClip();
				clip.open(audioInputStream);
				cache.put(filename, clip);
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
		}
        clip.setFramePosition(0);
        clip.loop(0);
        clip.start();
	}
}
