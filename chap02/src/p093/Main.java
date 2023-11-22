package p093;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("あなたの名前を入力してください");
		String name = scan.nextLine();
		System.out.println("貴方の年齢を入力してください");
		int age = scan.nextInt();
		System.out.println
			("ようこそ、" + age + "歳の" + name + "さん");
	}

}
