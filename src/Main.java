import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N = 0, soma = 1;
		
		N = sc.nextInt();
				
		for (int i = 0; i < N; i ++) {
			soma = soma + 1;
			if (soma % 4 != 0) {
			System.out.print(soma + " ");
			}else {
			System.out.println("PUM");
			}
			
		}
		
		
		sc.close();

	}

}
