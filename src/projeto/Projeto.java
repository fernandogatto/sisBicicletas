package projeto;

import java.util.ArrayList;
import java.util.List;

import estoque.Estoque;
import pedido.encomenda.Encomenda;
import projeto.modelo.Modelo;
import rh.Rh;
import rh.pessoa.Gerente;
import rh.pessoa.Tecnico;

public class Projeto {
	
	private List<Modelo> modelos = new ArrayList<>();
	private Modelo modelo;
	private Estoque estoque;
	private Rh rh;
	private Gerente gerente;
	private List<Tecnico> tecnicos = new ArrayList<>();
	
	public Projeto() {}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
	}

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

	public void verificarModelo(Encomenda encomenda) {
		boolean modeloExiste = false;
		
		for(int i = 0; i < modelos.size(); i++) {
			String strModelo = modelos.get(i).toString();
			
			if(encomenda.toString().compareTo(strModelo) == 0) {
				modeloExiste = true;
				i = modelos.size() + 1;
			}
		}
		
		if(modeloExiste) {			
			System.out.println("Modelo existe -> fazerProjeto() em Produção");
		} else {
			System.out.println("Modelo não existe -> desenvolverProjeto()");
			desenvolverProjeto(encomenda);
		}
	}
	
	public void desenvolverProjeto(Encomenda encomenda) {
		modelo = new Modelo(encomenda.getBanco(), encomenda.getGuidão(), encomenda.getPedal(), encomenda.getPneu(), encomenda.getQuadro());
		estoque = new Estoque();
		estoque.adicionarModeloEstoque(modelo);
		
		alocarMembrosProjeto();
		
		boolean peçasSuficiente = estoque.verificarPeçasEstoque(modelo.getPeças());
				
		if(peçasSuficiente) {
			System.out.println("Quantidade de peças suficiente no Estoque -> fazerProjeto() em Produção");
		} else {
			System.out.println("Quantidade de peças insuficiente no Estoque -> comprarPeças() em Compras");
		}
		
	}
	
	public void alocarMembrosProjeto() {
		rh = new Rh();
		
		// alocar tecnicos
		for(int i = 0; i < rh.getTecnicos().size(); i++) {
			// necessario 3 tecnicos por projeto
			if(this.getTecnicos().size() < 3) {
				if(!rh.getTecnicos().get(i).isAlocadoProjeto()) {
					this.getTecnicos().add(rh.getTecnicos().get(i));
					rh.getTecnicos().get(i).setAlocadoProjeto(true);
					System.out.println(rh.getTecnicos().get(i).getNome());
					System.out.println(this.getTecnicos().size());
				}				
			} else {
				i = rh.getTecnicos().size() + 1;
			}
		}
		
		if(this.getTecnicos().size() < 3) {
			int qtdTecnicosContratar = 3 - this.getTecnicos().size();
			System.out.println("Necessário contratar " + qtdTecnicosContratar + " técnicos");
		}
		
		// alocar gerente	
		for(int i = 0; i < rh.getGerentes().size(); i++) {
			// necessario 1 gerente por projeto
			if(this.getGerente() == null) {
				if(!rh.getGerentes().get(i).isAlocadoProjeto()) {
					gerente = new Gerente();
					this.setGerente(gerente);
					rh.getGerentes().get(i).setAlocadoProjeto(true);
				}				
			} else {
				i = rh.getGerentes().size() + 1;
			}
		}
		
		if(this.getGerente() == null) {
			System.out.println("Necessário contratar um gerente");
		}
	}

}
