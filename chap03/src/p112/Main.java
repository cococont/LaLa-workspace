package p112;

public class Main {

	public static void main(String[] args) {
		String str1 = "夕日";
		System.out.println("夕日と入力して");
		String str2 = new java.util.Scanner(System.in).nextLine();
		if (str1.equals(str2)) {
			System.out.println("同じ");
		} else {
			System.out.println("違う");
		}
	}

}
