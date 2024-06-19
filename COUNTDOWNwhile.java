package FINAL;
import java.util.Scanner;
public class COUNTDOWNwhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int vav=0,valor =0;
		while (vav <20) {
			vav++;
			System.out.println("insira um valor");
			valor = ler.nextInt();
			if (valor>=0 && valor<=100) {

			}
		}
		System.out.println(valor + "está entre numeros de 0 e 100.");
	}
}

