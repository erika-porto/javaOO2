class Conta{
	private double saldo;
	int agencia=42;
	int numero;
	Cliente titular;
	
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
	
}