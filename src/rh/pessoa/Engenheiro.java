package rh.pessoa;

public class Engenheiro extends Pessoa {
	
	private boolean alocadoProjeto;
	
	public Engenheiro() {}

	public Engenheiro(String nome, boolean alocadoProjeto) {
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
