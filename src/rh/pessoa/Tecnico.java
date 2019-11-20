package rh.pessoa;

public class Tecnico extends Pessoa {

	private boolean alocadoProjeto;
	
	public Tecnico() {}
	
	public Tecnico(String nome, boolean alocadoProjeto) {
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
