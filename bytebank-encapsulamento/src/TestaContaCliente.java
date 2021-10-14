
public class TestaContaCliente {
	public static void main(String[] args) {
		
		Conta contaDaErika=new Conta();
		contaDaErika.setNumero(222);
		System.out.println(contaDaErika.getNumero());
		
		Cliente erika=new Cliente();
//		DEPOIS QUE COLOQUEI OS ATRIBUTOS COMO PRIVATES NÃO É POSSÍVEL ACESSAR
//		erika.nome="erika hitomi";
//		System.out.println(erika.nome);
		
		
		contaDaErika.setTitular(erika);
		erika.setNome("erika hitomi");
		System.out.println(erika.getNome()); // retorna erika hitomi
		System.out.println(contaDaErika.getTitular()); // retorna o local da memória onde esta Cliente@
		System.out.println(contaDaErika.getTitular().getNome()); // retorna erika hitomi 
		
		//setando o cpf e profissao
		
		erika.setCpf("222.222.222.-22");
		erika.setProfissao("analista");
		
		System.out.println(contaDaErika.getTitular().getCpf());
		System.out.println(contaDaErika.getTitular().getProfissao());
	}
		
	
}
