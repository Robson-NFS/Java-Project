package fundamentos;

public class OperadoresTernarios {
	
		public static void main(String[] args) {
			
		double media = 9.6;
		//String resultadorec = media >= 5.0 ? "Em Recupera��o" : "Reprovado";
		String resultadofinal = media >= 7.0 ? 
				"Aprovado" :  media >= 5.0 ? "Em Recupera��o" : "Reprovado";
		
		System.out.println("O aluno est�: " + resultadofinal);
		
		double nota = 9.3;
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		String resultado = temDesconto ? "Sim." : "N�o";
		
		System.out.println("Tem Desconto? " + resultado);	
			 
		
		//teste git
			
			
			
			
		}

}
