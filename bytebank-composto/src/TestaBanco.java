
public class TestaBanco {
	public static void main(String[] args) {
		Cliente paulo=new Cliente();
		paulo.nome="Paulo Silveira";
		paulo.cpf="222.222.222-22";
		paulo.profissao="programador";
		
		Conta contaDoPaulo=new Conta();
		contaDoPaulo.deposita(100);
		
//		associa o cliente paulo a contaDoPaulo
		contaDoPaulo.titular = paulo;
		
//		Para que faça referência ao nome do titular preciso colocar nome
		System.out.println(contaDoPaulo.titular.nome);
		
//		SE FOSSE contaDoPaulo.titular mostraria apenas o lugar referente como sendo Cliente@123a439b , uma espécie de id
		System.out.println(contaDoPaulo.titular);
	}
}
