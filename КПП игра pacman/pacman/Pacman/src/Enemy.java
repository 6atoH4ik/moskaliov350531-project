import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Enemy extends Rectangle{
	
	private static final long serialVersionUID = 1L;	
	
	private int random = 0, smart = 1, findPath = 2;
	
	private int state = random;
	
	private int dir = -1;
	
	private int right = 0, left = 1, up = 2, down = 3;
	
	public Random randomGen;
	
	private int time = 0;
	
	private int targetTime = 60*4;
	
	private int spd = 4;
	
	private int lastDir = -1;

	public Enemy(int x, int y){
		randomGen = new Random();
		setBounds(x,y,32,32);
		dir = randomGen.nextInt(4);
	}
	
	public void tick(){
		///////////////////   ii STARTS HERE   //////////////////////////////////////////////
		if(state == random){
			spd = 2;
			//WE DONT SEE PLAYER AND NEWER SAW
			
			if(dir == right){
				if(canMove(x+spd,y)){
					x+=spd;
					lastDir = right;
				}else{
					dir = randomGen.nextInt(4);
				}
			}else if(dir == left){
				if(canMove(x-spd,y)){
					x-=spd;
					lastDir = left;
				}else{
					dir = randomGen.nextInt(4);
				}
			}else if(dir == up){
				if(canMove(x,y-spd)){
					y-=spd;
					lastDir = up;
				}else{
					dir = randomGen.nextInt(4);
				}
			}else if(dir == down){
				if(canMove(x,y+spd)){
					y+=spd;
					lastDir = down;
				}else{
					dir = randomGen.nextInt(4);
				}
			}
			
			time++;
			if(time == targetTime) {
				state = findPath;
				time = 0;
			}
			
			///// try to find a player////
			if(x < Game.player.x && y == Game.player.y){
				if(canMove(x+spd,y)){
					x+=spd;
					state = smart;
					lastDir = right;
				}
			}
			if(x > Game.player.x && y == Game.player.y){
				if(canMove(x-spd,y)){
					x-=spd;
					state = smart;
					lastDir = left;
				}
			}
			if(y > Game.player.y && x == Game.player.x){
				if(canMove(x,y-spd)){
					y-=spd;
					state = smart;
					lastDir = up;
				}
			}
			if(y < Game.player.y && x == Game.player.x){
				if(canMove(x,y+spd)){
					y+=spd;
					state = smart;
					lastDir = down;
				}
			}			
			
		}else if(state == smart){
	//////////    WE SEE A PLAYER NOW    ////////////////////////
			
			boolean move = false;
			spd = 4;
			
			
			if(x < Game.player.x){
				if(canMove(x+spd,y)){
					x+=spd;
					move = true;
					lastDir = right;
				}
			}
			if(x > Game.player.x){
				if(canMove(x-spd,y)){
					x-=spd;
					move = true;
					lastDir = left;
				}
			}
			if(y > Game.player.y){
				if(canMove(x,y-spd)){
					y-=spd;
					move = true;
					lastDir = up;
				}
			}
			if(y < Game.player.y){
				if(canMove(x,y+spd)){
					y+=spd;
					move = true;
					lastDir = down;
				}
			}
									
			if(!move){
				state = findPath;	
				move = true;
			}

			time++;			
			if(time == targetTime) {
				state = random;
				time = 0;
			}
		
				
		}else if(state == findPath){
		////////////////    WE SAW PLAYER AND TRYING TO FIND A PATH TO HIM  /////////////////////////
			spd = 3;
			if(lastDir == right){
				
				if(y < Game.player.y){
					if(canMove(x,y+spd)){
						y+=spd;
						state = smart;
					}
				}else if(canMove(x,y-spd)){
					y-=spd;
					state = smart;
				}
				
				if(canMove(x+spd,y)){
					x+=spd;
				}
				
			}else if(lastDir == left){
				if(y < Game.player.y){
					if(canMove(x,y+spd)){
						y+=spd;
						state = smart;
					}
				}else if(canMove(x,y-spd)){
					y-=spd;
					state = smart;
				}
				
				if(canMove(x-spd,y)){
					x-=spd;
				}
				
			}else if(lastDir == up){
				if(x < Game.player.x){
					if(canMove(x+spd,y)){
						x+=spd;
						state = smart;
					}
				}else if(canMove(x-spd,y)){
					x-=spd;
					state = smart;
				}
				
				if(canMove(x,y-spd)){
					y-=spd;				
				}
				
			}else if(lastDir == down){
				if(x < Game.player.x){
					if(canMove(x+spd,y)){
						x+=spd;
						state = smart;
					}
				}else if(canMove(x-spd,y)){
					x-=spd;
					state = smart;
				}
				
				if(canMove(x,y+spd)){
					y+=spd;
				}
			}
						
			time++;			
			if(time == targetTime) {
				state = random;
				time = 0;
			}
		
		}	
		
	}
//////////////// NOT RUNNING THROUGH THE WALLS  ////////////////////////	
private boolean canMove(int nextx, int nexty){
		
		Rectangle bounds = new Rectangle(nextx, nexty, width, height);
		Level level = Game.level;
		
		for(int xx = 0; xx < level.tiles.length; xx++){
			for(int yy = 0; yy < level.tiles[0].length; yy++){
				if(level.tiles[xx][yy] != null){
					if (bounds.intersects(level.tiles[xx][yy])){
						return false;
					}
				}
			}
		}
		
		return true; 
	}

	////////////////////image///////////

public void render(Graphics g){
		g.drawImage(Texture.ghost, x, y, width, height, null);
	}

}

