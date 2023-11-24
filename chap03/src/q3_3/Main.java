package q3_3;

public class Main {

	public static void main(String[] args) {
		int isHungry;
		isHungry = 0;
		String food = "apple";
//		System.out.println(isHungry == 0 ? "お腹いっぱい" : "はらぺこ");
		if (isHungry == 0) {
			System.out.println("お腹いっぱい");
		} else {
			System.out.println("はらぺこ");
			System.out.println(food + "をいただきます");
			System.out.println("ごちそうさま");
		}
	}

}
