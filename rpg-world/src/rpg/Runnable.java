package rpg;

public interface Runnable {
	default void run() {
		System.out.println("トコトコ走って逃げる");
	}
}
