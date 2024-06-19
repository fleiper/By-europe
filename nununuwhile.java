package FINAL;
import java.util.Scanner;
public class nununuwhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int inf=0,valor,soma=0;
		while (inf<=1000) {
			inf ++;
			System.out.println("digite um valor a ser somado");
			valor = ler.nextInt();
			soma = soma + valor;

			if (valor <0){
				System.out.println("negativo não pode ser somado a conta, somatoria encerrada em: "+soma);
			}

		}

	}

}
