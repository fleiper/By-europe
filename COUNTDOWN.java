package FINAL;
import java.util.Scanner;
public class COUNTDOWN {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int valor =0,cem=0;
		for (int vav=0; vav <= 20; vav++) {

			System.out.println("insira um valor");
			valor = ler.nextInt();
			if (valor>=0 && valor<=100) {

			}
		}
		System.out.println(cem + "está entre numeros de 0 e 100.");
	}
}

