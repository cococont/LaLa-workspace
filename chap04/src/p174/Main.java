package p174;

public class Main {

	public static void main(String[] args) {
		int[][] scores = new int[2][3];
		scores[0][0] = 40;
		scores[0][1] = 50;
		scores[0][2] = 70;
		scores[1][0] = 80;
		scores[1][1] = 70;
		scores[1][2] = 60;
		for (int[] array : scores) {
			for (int v : array) {
				System.out.println(v);
			}
		}
	}

}
