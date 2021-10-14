
public class TestandoContaSemCliente {
	public static void main(String[] args) {
		Conta contaDaMarcela=new Conta();
		
//		se eu tentar mostrar o saldo ele mostrará 0 
//		System.out.println(contaDaMarcela.saldo);
		
//		tentando fazer a mesma coisa com titular , será que dá?
//		contaDaMarcela.titular.nome="Marcela";
//		System.out.println(contaDaMarcela.titular.nome); // deu null (referência pra lugar nenhum), pq não entrelaçamos com Cliente
		
//		como mudar isso? criando essa relação entre Conta e Cliente
		contaDaMarcela.titular=new Cliente();
		contaDaMarcela.titular.nome="Marcela";
		System.out.println(contaDaMarcela.titular.nome);
		
		
	}
} 
