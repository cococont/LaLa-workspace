package ex2_3;

import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("ようこそ占いの館へ");
		System.out.println("あなたの名前を入力してください");
		Scanner scan = new Scanner(System.in);
		String name = scan.nextLine();
		System.out.println("あなたの年齢を入力してください");
		String ageString = scan.nextLine();
		int age = Integer.parseInt(ageString);
		Random rand = new Random();
		int fortuneInt = rand.nextInt(4);
		String[] fortuneArray = { "大吉", "中吉", "吉", "凶" };
		String fortune = fortuneArray[fortuneInt];
		System.out.println("占いの結果が出ました！");
		System.out.println(age + "歳の" + name +
				"さん、あなたの運気番号は" +
				fortune + "です");
	}
}
