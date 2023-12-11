package rpg.character;

import rpg.monster.Matango;
import rpg.monster.Monster;

public class Hero extends Character {
	
	Sword sword;

	public Hero(String name) {
		super(name, 100);
	}
	
	public Hero(String name, int hp) {
		super(name, hp);
		this.sword = new Sword("炎の剣");
	}
	
//	public final void slip() {
//		this.hp -= 5;
//		System.out.println(this.name + "はころんだ");
//		System.out.println("5のダメージ");
//	}
	
	public void attack(Monster m) {
		if (m instanceof Matango) {
			Matango mm = (Matango) m;
			System.out.println
		    (this.getName() + "の " + mm.getType() + mm.getSuffix() + "への攻撃");
		} else {
			System.out.println
		    (this.getName() + "の " + m.getType() + "への攻撃");
		}
		m.setHp(getHp() - 10);
//		m.hp -= 10;
		System.out.println("10ポイントのダメージを与えた");
	}

}
