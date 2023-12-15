package rpg;

import rpg.character.Hero;
import rpg.monster.WalkingMonster;

public class Goblin extends WalkingMonster {

	public void run() {
		System.out.println("ゴブリンは、腕をふって逃げ出した");
	}
	public void attack(Hero h) {
		System.out.println("ナイフで斬りつける");
	}

}
