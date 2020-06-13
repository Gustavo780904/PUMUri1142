import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int N = 0, soma = 0;

		N = sc.nextInt();

		for (int i = 0; i < N; i++) {

			for (int x = 0; x < 4; x++) {
				soma = soma + 1;
				if (soma % 4 != 0) {
					System.out.print(soma + " ");
				} else {
					System.out.println("PUM");
				}
			}

		}

		sc.close();

	}

}
