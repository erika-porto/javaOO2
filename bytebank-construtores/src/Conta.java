
public class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	
//	M�TODO CONSTRUTOR POR DEBAIXO DOS PANOS
	
	public Conta(int agencia, int numero) {
		if(agencia <= 0) {
			System.out.println("N�o � permitido n�meros menores q 0");
			return;
		}
		this.agencia = agencia;
		this.numero = numero;
		System.out.println("estou criando uma conta");
		
	}
	
	void deposita(double valor) {
		saldo += valor;
	}
	
	void saca(double valor) {
		if(valor > saldo) {
			System.out.println("N�o � poss�vel realizar esse saque");
		}else {
			System.out.println("saldo liberado");
		}
		
		saldo-= valor;
	}
	
	void transfere(double valor,Conta destino) {
		if(saldo >= valor) {
			saldo -= valor;
			destino.deposita(valor);   //define a conta a receber o valor
			System.out.println("permitida a transfer�ncia");
			
		}else {
			System.out.println("Valor excede o seu saldo");
		}
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setAgencia(int agencia) {
		
//		definindo que n�o pode ser n�meros negativos
		if(agencia <= 0) {
			System.out.println("N�o � permitido n�meros menores que 0.");
			return;
		}
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return agencia;
	}
	
	public void setNumero(int numero) {
		if(numero <= 0) {
			System.out.println("N�o � permitido n�meros menores que 0");
			return;
		}
		this.numero = numero;
	}
	
	 public int getNumero() {
		return numero;
	}
}
