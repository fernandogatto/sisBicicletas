package rh.pessoa;

public class Gerente extends Pessoa {

	private boolean alocadoProjeto;
	
	public Gerente() {}

	public Gerente(String nome, boolean alocadoProjeto) {
		super(nome);
		this.alocadoProjeto = alocadoProjeto;
	}
	
	public boolean isAlocadoProjeto() {
		return alocadoProjeto;
	}

	public void setAlocadoProjeto(boolean alocadoProjeto) {
		this.alocadoProjeto = alocadoProjeto;
	}
	
}
