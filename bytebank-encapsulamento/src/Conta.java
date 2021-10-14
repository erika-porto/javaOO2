class Conta{
	private double saldo;
	private int agencia=42;
	private int numero;
	private Cliente titular;
	
//	CRIANDO UM M�TODO DEPOSITA
	
	void deposita(double valor) {
//		saldo=saldo + valor
		saldo+=valor;
	}
	
//	M�TODO SACA
	public boolean saca(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
//	M�TODO TRANSFERE
	public boolean transfere(double valor,Conta destino) {
		if(saldo >= valor) {
			saldo -=valor;
			destino.deposita(valor); // o mesmo que destino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
//	M�TODO RETORNA SALDO , PQ EST� PRIVATE
	public double getSaldo() {
		return this.saldo;
	}
	
//	M�TODO GET N�MERO
	public int getNumero() {
		return this.numero;
	}
	
//	M�TODO SET NUMERO
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
//	M�TODO GET AGENCIA
	public int getAgencia() {
		return this.agencia;
	}
	
//	M�TODO SET AGENCIA
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
//	M�TODO SET TITULAR 
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
//	M�TODO GET TITULAR
	
	public Cliente getTitular() {
		return titular;
	}
	
	
}