package FINAL;
import java.util.Scanner;
public class ISwhile {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int pessoa=0,idade;
		String nome;
		while (pessoa<10) {
			pessoa ++;
			System.out.println("me diga seu nome: ");
			nome = ler.next();
			System.out.println("e sua idade: ");
			idade = ler.nextInt();
			System.out.println("==============");
			if (idade < idade) {
				System.out.println(idade+"é o mais novo");
			}
		}
	}
}
