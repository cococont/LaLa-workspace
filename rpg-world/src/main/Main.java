package main;

import java.util.Random;

// ゲームの管理運営を担うクラス

import rpg.Place;
import rpg.character.Hero;
import rpg.monster.Goblin;
import rpg.monster.Matango;
import rpg.monster.Monster;

public class Main {

	private static Place[][] places = new Place[Const.Y_SIZR][Const.X_SIZR];
	public static void main(String[] args) {
		setup();
		Goblin goblin = new Goblin();
		setObject(goblin);
		Matango matango = new Matango('A');
		setObject(matango);
		
		
		Hero hero = new Hero("A");
		System.out.println(hero.getLocation());
		while (true) {
			hero.move();
			System.out.println(hero.getLocation());
			hero.look(places);
//			戦う or 逃げる
//			戦い方
//			負けた場合 hp <= 0
//			勝った場合 m.hp <= 0
//				places[y][x].setObj(null)
		}
	}
	
	public static void setup() {
		for (int y = 0; y < Const.Y_SIZR; y++) {
			for (int x = 0; x < Const.X_SIZR; x++) {
				places[y][x] = new Place();
			}
		}
	}
	
	public static void setObject(Object obj) {
		int x;
		int y;
		do {
			x = new Random().nextInt(Const.X_SIZR);
			y = new Random().nextInt(Const.Y_SIZR);
		} while(places[y][x].getObj() != null);

		places[y][x].setObj(obj);
		if (obj instanceof Monster) {
			Monster m = (Monster) obj;
			places[y][x].setScene(m.getType() + "が出現した");
		}
		
	}

}
