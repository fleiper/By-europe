package FINAL;
import java.util.Scanner;
public class FINAL {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int par;
		for (int vav=0; vav<2000; vav++) {
			System.out.println("e sua idade: ");
			par = ler.nextInt();
			System.out.println("==============");

			if (par%2 ==1) {
				System.out.println("ele é numero imprar");
			}
			else {
				System.out.println("ele é um numero par");
			}
		}
	}
}
