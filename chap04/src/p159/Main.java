package p159;

public class Main {

	public static void main(String[] args) {
		int[] scores = {20, 30, 40, 50, 60};
		int count = 0;
		for (int i = 0; i < scores.length; i++) {
			if (scores[i] >= 50)
			count += 1;
		}
		System.out.println("50点以上の数は: " + count);
	}

}
