
public class TestaMetodo {

	public static void main(String[] args) {
		Conta contaDoWilliam = new Conta();
		contaDoWilliam.saldo = 150;
		contaDoWilliam.deposita(30);
		System.out.println("A conta do William tem: "+contaDoWilliam.saldo+" Reais.");
		
		Conta contaDaKeila = new Conta();
		contaDaKeila.saldo = 500;
		contaDaKeila.deposita(250);
		System.out.println("A conta da Keila tem: "+contaDaKeila.saldo+" Reais.");
		
		contaDaKeila.saca(10);
		System.out.println("Valor atual, é: "+contaDaKeila.saldo);
		
		System.out.println("PIRATAS DO CARIBE");
		
		boolean sucessoTransferencia = contaDoWilliam.transfere(150, contaDaKeila);
		
		if(sucessoTransferencia) {
			System.out.println("Transferencia com sucesso!");
		}else {
			System.out.println("Faltou dinheiro, transferencia não aceita.");
		}
			
		System.out.println("conta do William agora tem: "+contaDoWilliam.saldo);
		System.out.println("E a conta da Keila tem: "+contaDaKeila.saldo);

	}

}
