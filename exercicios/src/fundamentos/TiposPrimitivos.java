package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		//Informa��es do funcionario
		
		//Tipos Numericos inteiros
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		//Tipos numericos reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.1;
		
		//Tipo booleano
		boolean estaDeFerias = false; //true
		
		//Tipo caractere
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//N�mero de viagens
		System.out.println(numeroDeVoos /2);
		
		//Pontos por real
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + "Ganha -> " + salario);
		System.out.println("Ferias? " + estaDeFerias);
		
		System.out.println("Status: " + status);
		
				
		
	}
}
