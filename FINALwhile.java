package FINAL;
import java.util.Scanner;
public class FINALwhile {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner (System.in);
		int par,vav=0;
		while (vav<1000) {
			vav++;
			System.out.println("e sua idade: ");
			par = ler.nextInt();
			System.out.println("==============");

			if (par%2 ==1) {
				System.out.println("ele é numero impar");
			}
			else {
				System.out.println("ele é um numero par");
	
			}

		}
	}
}
