package invaders.graphics;

import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import javax.imageio.ImageIO;

public class ImageLoader {
	private static HashMap<String, BufferedImage> cache = new HashMap<>();
	
	public static Image load(String key, String filename) {
		Image image = cache.get(key);
		if (image == null) {

		}
		return image;
	}
	
	public static BufferedImage load(String filename) {
		try (InputStream inputStream = ImageLoader.class.getResourceAsStream(filename)) {
			return ImageIO.read(inputStream);
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static Image get(String filename) {
		BufferedImage image = cache.get(filename);
		if (image == null) {
			image = load(filename);
			cache.put(filename, image);
		}
		return image;
	}
	
	public static Image load(String filename, int x, int y, int width, int height) {
		String key = String.format("%s(%d,%d,%d,%d)", filename, x, y, width, height);
		BufferedImage image = cache.get(key);
		if (image == null) {
			image = new BufferedImage(width, height, BufferedImage.TYPE_4BYTE_ABGR);
			Graphics2D graphics = image.createGraphics();
			graphics.drawImage(get(filename), -x, -y, null);
			graphics.dispose();
			cache.put(key, image);
		}
		return image;
	}
}
