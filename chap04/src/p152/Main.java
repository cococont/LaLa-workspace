package p152;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 60};
		scores[1] = 10;
		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}
	}

}
