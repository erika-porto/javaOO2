
public class TestandoContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela=new Conta();
		
//		se eu tentar mostrar o saldo ele mostrar� 0 
//		System.out.println(contaDaMarcela.saldo);
		
//		tentando fazer a mesma coisa com titular , ser� que d�?
//		contaDaMarcela.titular.nome="Marcela";
//		System.out.println(contaDaMarcela.titular.nome); // deu null (refer�ncia pra lugar nenhum), pq n�o entrela�amos com Cliente
		
//		como mudar isso? criando essa rela��o entre Conta e Cliente
		contaDaMarcela.titular=new Cliente();
		contaDaMarcela.titular.nome="Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		
	}
} 
