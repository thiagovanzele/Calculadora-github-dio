import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		Calculadora c1 = new Calculadora();
		Scanner sc = new Scanner(System.in);
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int resultadoSoma = c1.somar(x, y);
		int resultadoSubtrai = c1.subtrair(x, y);
		
		System.out.println(resultadoSoma);
		System.out.println(resultadoSubtrai);
		
		
		
		sc.close();
		
	}

}
