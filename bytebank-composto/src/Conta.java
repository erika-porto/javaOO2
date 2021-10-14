class Conta{
	private double saldo;
	int agencia=42;
	int numero;
	Cliente titular;
	
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
	
}