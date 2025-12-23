import java.util.*;

public class Soal4 {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);

		int angka = sc.nextInt();
		String hasil = "";

		while (angka > 0) {
			int temp = angka%2;
			angka = angka / 2;
			hasil += temp;
		}

		String biner = "";
		char[] chars = hasil.toCharArray();
		for (int i = chars.length - 1; i >= 0; i--) {
			biner += String.valueOf(chars[i]);
		}

		int printHasil = Integer.parseInt(biner);
		System.out.printf("%08d", printHasil);
	}
}