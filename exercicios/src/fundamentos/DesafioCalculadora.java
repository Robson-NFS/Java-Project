package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {

	public static void main(String[] args) {
				
		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro valor: ");
		Double num1 = entrada.nextDouble();
		
		System.out.println("Digite a opera��o desejada: ");
		String op = entrada.next();
		
		System.out.println("Digite o segundo valor: ");
		Double num2 = entrada.nextDouble();
		
		
		//L�gica
		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op)? num1 - num2 : resultado ;
		resultado = "*".equals(op)? num1 * num2 : resultado;
		resultado = "/".equals(op)? num1 / num2 : resultado;
		 
		
		System.out.printf("%.2f %s %.2f = %.2f" , num1 , op, num2 , resultado);
		
		entrada.close();		
		
		
	}

}
  