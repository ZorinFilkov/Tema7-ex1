import java.util.Arrays;

public class Main {
	public static void main(String[] args) {

		int n = 1 + (int) (Math.random() * 10);
		int a[][] = new int[4][4];
		for (int j = 0, k = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++, k++) {
				a[i][j] = n + k;
			}
		}
		System.out.println(n);
		System.out.println();

		for (int j = 0; j < 4; j++) {
			for (int i = 0; i < 4; i++) {
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}