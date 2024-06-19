package FINAL;
import java.util.Scanner;
public class THEwhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int var=0,rav;
		while(var<20) {
			var++;
			System.out.println("digite alguns numeros: ");
			rav= ler.nextInt();

			if (rav<8) {
				System.out.println("Este é um numero inferior a oito");
			}
		}
	}
}
