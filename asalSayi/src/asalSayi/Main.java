package asalSayi;

public class Main {

	public static void main(String[] args) {
		int asal = 0;
		for (int k = 2; k <= 100; k++) {
			asal = 0;
			for (int i = 2; i < k; i++) {
				if (k % i == 0) {
					asal++;
				}
			}
			if (asal == 0) {
				System.out.print(k+" ");
			}
		}

	}

}
