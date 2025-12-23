import java.util.*;

public class Soal2 {

	public static void main(final String[] args) {
		Scanner sc = new Scanner(System.in);

		String kalimat = sc.nextLine();

		String[] aktivitas = kalimat.split("\\s+");

		int meminjam = 0;
		int membaca = 0;
		int bertanya = 0;
		int mengembalikan = 0;
		int mendaftar = 0;

		for (int i = 0; i < aktivitas.length; i++) {
			switch (aktivitas[i]) {
				case "Meminjam":
					meminjam++;
					break;
				case "Membaca":
					membaca++;
					break;
				case "Bertanya":
					bertanya++;
					break;
				case "Mengembalikan":
					mengembalikan++;
					break;
				case "Mendaftar":
					mendaftar++;
					break;
			}
		}

		System.out.println("Meminjam: " + meminjam);
		System.out.println("Membaca: " + membaca);
		System.out.println("Bertanya: " + bertanya);
		System.out.println("Mengembalikan: " + mengembalikan);
		System.out.println("Mendaftar: " + mendaftar);
	}
}