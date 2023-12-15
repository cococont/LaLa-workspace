package rpg;

import java.util.Random;
import java.util.Scanner;

import main.Const;
import main.Message;

public class Player {
	private int x;
	private int y;

	public Player() {
		this.x = new Random().nextInt(Const.X_SIZR);
		this.y = new Random().nextInt(Const.Y_SIZR);

	}
	
	public void look(Place[][] places) {
		Place here = places[y][x];
		System.out.println(here.getScene());
	}
//	
//	n,s,w,e で東西南北 上下左右へ移動
//	userに入力してもらう
//	x,y に反映
//	
	public void move() {
		boolean inputOK = false;
		do {
			System.out.println(Message.MOVE_MSG);
			String dir = new Scanner(System.in).nextLine().toLowerCase().trim();
			inputOK = true;
			switch (dir) {
			case "n":
				if (this.y > 0) {
					this.y -= 1;
				}
				break;
			case "s":
				if (this.y < Const.Y_SIZR - 1) {
					this.y += 1;
				}
				break;
			case "w":
				if (this.x > 0) {
					this.x -= 1;
				}
				break;
			case "e":
				if (this.x < Const.X_SIZR - 1) {
					this.x += 1;
				}
				break;
			default:
				inputOK = false;
			}
		} while(inputOK == false);
	}
	
	public String getLocation() {
		return "(" + x + "," + y + ")";
	}
}
