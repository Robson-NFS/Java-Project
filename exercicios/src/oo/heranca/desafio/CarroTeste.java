package oo.heranca.desafio;

public class CarroTeste {
	public static void main(String[] args) {
	
	Bmw bmw = new Bmw ();
	System.out.println(bmw.velocidadeAt);

	Civic civic = new Civic ();
	System.out.println(civic.velocidadeAt);
	
	bmw.acelerar();
	civic.acelerar();
	bmw.acelerar();
	civic.acelerar();
	bmw.acelerar();
	civic.acelerar();
	bmw.acelerar();
	civic.acelerar();
	bmw.acelerar();
	civic.acelerar();
	
	System.out.println("A Velocidade Atual da " + bmw.nome + " � de " + bmw.velocidadeAt +"km");
	System.out.println("A Velocidade Atual do " + civic.nome + " � de " + civic.velocidadeAt +"km");
	
	

	}
}
 