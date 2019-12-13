package projeto;

import java.util.ArrayList;
import java.util.List;

import pedido.encomenda.Encomenda;
import projeto.modelo.Modelo;
import rh.pessoa.Engenheiro;
import rh.pessoa.Gerente;
import rh.pessoa.Tecnico;

public class Projeto {

	private Modelo modelo;
	private Gerente gerente;
	private List<Tecnico> tecnicos = new ArrayList<>();
	private Engenheiro engenheiro;

	public Projeto() {}

	public Gerente getGerente() {
		return gerente;
	}

	public void setGerente(Gerente gerente) {
		this.gerente = gerente;
	}

	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}

	public void setTecnicos(List<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}
	
	public Engenheiro getEngenheiro() {
		return engenheiro;
	}

	public void setEngenheiro(Engenheiro engenheiro) {
		this.engenheiro = engenheiro;
	}
	
	public void desenvolverProjeto(Encomenda encomenda, List<Modelo> modelosProntos) {
		modelo = new Modelo(encomenda.getBanco(), encomenda.getGuidao(), encomenda.getPedal(), encomenda.getPneu(), encomenda.getQuadro());
		modelosProntos.add(modelo);
		System.out.println("Projeto desenvolvido -> produzirEncomenda() em Producao");
	}
	
	public boolean verificarEngenheirosDisponiveis(List<Engenheiro> engenheiros) {
		boolean engenheiroDisponivel = false;
		for(int i = 0; i < engenheiros.size(); i++) {
			if(!engenheiros.get(i).isAlocadoProjeto()) {
				engenheiroDisponivel = true;
				engenheiros.get(i).setAlocadoProjeto(true);
			}
		}
		return engenheiroDisponivel;
	}

}
