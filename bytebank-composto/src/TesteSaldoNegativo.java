
public class TesteSaldoNegativo {
	public static void main(String[] args) {
		Conta conta = new Conta();
		
		conta.deposita(100);
		
//		ser� que vai consegui sacar mais do q tem ? n�o , vai dar false
//		System.out.println(conta.saca(200));
		
//		mas se eu fizer 
//		conta.saldo= conta.saldo -101;
//		System.out.println(conta.saldo); // vai mostrar -1 
		
//		existe uma maneira de eu impedir que isso aconte�a , tornando o saldo private ,por�m depois disso ,
//		eu preciso criar um m�todo que me retorne o saldo para que eu possa acess�-lo.
		
		System.out.println(conta.saca(101));
		System.out.println(conta.getSaldo());
	}

}
