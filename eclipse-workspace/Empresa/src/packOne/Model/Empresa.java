package packOne.Model;

public class Empresa {
	Cliente clientes[];
	String nome;
	public Empresa(String nm) {
		this.nome = nm;
		this.clientes = new Cliente[10];
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nm) {
		this.nome = nm;
	}
	
	
	public void adicionarCliente(int indice, Cliente cliente) {
		this.clientes[indice] = cliente; 
	}
	
}
