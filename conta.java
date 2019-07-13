//ARQUIVO DEL WILLIAM
public class Conta{
	double saldo;
	int agencia;
	int numero;
	String titular;
	
	void deposita(double valor){
		//this.saldo = this.saldo + valor; 	modo menos enxuto  *1choice*
		this.saldo += valor;  // += valor *2choice* " adiciona valor a ele mesmo	 mais enxuto
	}
	
	public boolean saca(double valor) {

		if(this.saldo >= valor) {
			//this.saldo = this.saldo - valor;	 modo menos enxuto *1choice*
			this.saldo -= valor;  // -= valor *2choice* "tire valor dele mesmo"	 mais enxuto
			return true;
		} else {
			return false;
		}
	}
	
	public boolean transfere(double valor, Conta destino) {
		
		if(this.saldo >= valor) {
			this.saldo -=valor;
			//destino.saldo += valor;	//*1 choice*
			destino.deposita(valor);	//*2 choice*
			return true;
		} //podemos ter o else ou ñ, mas geralmente os codigos parecem- 
		  //sem o else, nesse caso nao e necessario
		return false;
		
		
		
	}
	
	
}