import java.awt.image.BufferedImage;

public class Texture {
	
	public static BufferedImage player;
	public static BufferedImage ghost;
	
	public Texture(){
		player = Game.spritesheet.getSparite(0, 0);
		ghost = Game.spritesheet.getSparite(0, 16);
	}

}
