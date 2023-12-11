package rpg;

import java.util.Random;

public class Player {
	private int x;
	private int y;

	public Player() {
		this.x = new Random().nextInt(5);
		this.y = new Random().nextInt(5);

	}
//	
//	n,s,w,e で東西南北 上下左右へ移動
//	userに入力してもらう
//	x,y に反映
//	
	public void move() {
		
	}
	
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
