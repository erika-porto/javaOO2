class Conta{
	private double saldo;
	private int agencia=42;
	private int numero;
	private Cliente titular;
	
//	CRIANDO UM MÉTODO DEPOSITA
	
	void deposita(double valor) {
//		saldo=saldo + valor
		saldo+=valor;
	}
	
//	MÉTODO SACA
	public boolean saca(double valor) {
		if(saldo >= valor) {
			this.saldo -= valor;
			return true;
		}else {
			return false;
		}
	}
	
//	MÉTODO TRANSFERE
	public boolean transfere(double valor,Conta destino) {
		if(saldo >= valor) {
			saldo -=valor;
			destino.deposita(valor); // o mesmo que destino.saldo += valor;
			return true;
		}else {
			return false;
		}
	}
	
//	MÉTODO RETORNA SALDO , PQ ESTÁ PRIVATE
	public double getSaldo() {
		return this.saldo;
	}
	
//	MÉTODO GET NÚMERO
	public int getNumero() {
		return this.numero;
	}
	
//	MÉTODO SET NUMERO
	public void setNumero(int numero) {
		this.numero=numero;
	}
	
//	MÉTODO GET AGENCIA
	public int getAgencia() {
		return this.agencia;
	}
	
//	MÉTODO SET AGENCIA
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
//	MÉTODO SET TITULAR 
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
//	MÉTODO GET TITULAR
	
	public Cliente getTitular() {
		return titular;
	}
	
	
}