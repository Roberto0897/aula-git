
import java.util.ArrayList;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// ENTRADA
		Scanner entrada = new Scanner(System.in);
		int valorn = entrada.nextInt();
		int[] valorx = new int[valorn];
		ArrayList<Integer> somain = new ArrayList<>();
		ArrayList<Integer> somaout = new ArrayList<>();

		// PROCESSAMENTO
		for (int i = 0; i < valorn; i++) {
			valorx[i] = entrada.nextInt();

			if (valorx[i] >= 10 && valorx[i] <= 20) {
				somain.add(valorx[i]);
			} else {
				somaout.add(valorx[i]);
			}
		}
		entrada.close();
		//SAIDA
		System.out.println(somain.size()+ " in:");
		for (int somin : somain) {
			System.out.println(somin);
		}
		System.out.println(somaout.size()+ " out:");
		for (int somout : somaout) {
			System.out.println(somout);
		}

	}
}