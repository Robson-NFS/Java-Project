package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		
		Function<Produto, Double>precoFinal =
				p -> p.preco * (1 - p.desconto);
			
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
				
		UnaryOperator<Double> frete =
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
		
		UnaryOperator<Double> arrendondar =
				preco -> Double.parseDouble(String.format("%.2f", preco));
		
		Function<Double, String> formatar = 
				preco -> ("R$" + preco).replace(".", ",");
		
		Produto p = new Produto ("Ipad", 3235.89, 0.0);
		
		
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arrendondar)
				.andThen(formatar)
				.apply(p);
		
		System.out.println("O pre�o final �" + preco);
	
	}

}
