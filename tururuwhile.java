package FINAL;
import java.util.Scanner;
public class tururuwhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int vav = 1,valor =0,entre= 0, cem=0,duz = 0;
		while (vav <= 20) {

			System.out.println("Insira um valor");
			valor = ler.nextInt();
			vav++;
			if (valor>=0 && valor<=100) {
				entre++;
			}
			if (valor>=101 && valor<=200) {
				cem++;
			}
			if (valor>200) {
				duz++;
			}
		}
		System.out.println(entre + "é dos numeros de 0 e 100.");
		System.out.println(cem + "é dos numeros de 101 e 200.");
		System.out.println(duz + "é dos numeros maiores que 200.");
	}

}
