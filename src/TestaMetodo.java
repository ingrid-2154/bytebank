
public class TestaMetodo {
	public static void main(String[] args) {
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.saldo = 100;
		contaDoPaulo.deposita(50);
		System.out.println(contaDoPaulo.saldo);
		boolean conseguiuRetirar = contaDoPaulo.saca(50);
		System.out.println(contaDoPaulo.saldo);
		System.out.println(conseguiuRetirar);

		Conta ContaDaMarcela = new Conta();
		ContaDaMarcela.deposita(1000);

		if (ContaDaMarcela.transfere(300, contaDoPaulo)) {
			System.out.println("trasferencia com sucesso");
		} else {
			System.out.println("faltou dinheiro");
		}
		System.out.println(ContaDaMarcela.saldo);
		System.out.println(contaDoPaulo.saldo);
		
		contaDoPaulo.titular ="Paulo Silveira";
		System.out.println(contaDoPaulo.titular);
	}
}
