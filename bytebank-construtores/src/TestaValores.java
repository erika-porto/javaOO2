
public class TestaValores {
	public static void main(String[] args) {
		// por baixo dos panos existe aqui um m�todo construtor,
		Conta conta=new Conta(330,2345); // defini que passaria os valores de agencia e numero pelo construtor
		
//		conta.setAgencia(-50);
//		conta.setNumero(-330);
		
		System.out.println(conta.getAgencia()); // me mostra valor 0 , por default pelo m�todo construtor
		System.out.println(conta.getNumero());  // me mostra valor 0 , por default pelo m�todo construtor
	}
}
