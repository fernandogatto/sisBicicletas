package projeto.lista;

import java.util.ArrayList;
import java.util.List;

import pedido.encomenda.Encomenda;
import projeto.Projeto;
import projeto.modelo.Modelo;
import rh.pessoa.Engenheiro;

public class ListaProjeto {

	private List<Modelo> modelosProntos = new ArrayList<>();
	private Projeto projeto;

	
	public ListaProjeto() {}

	public List<Modelo> getModelosProntos() {
		return modelosProntos;
	}

	public void setModelosProntos(List<Modelo> modelosProntos) {
		this.modelosProntos = modelosProntos;
	}
	
	public void adicionarModeloListaProjeto(Modelo modelo) {
		modelosProntos.add(modelo);
	}
	
	public void listarModelosProntos() {
		System.out.println("### MODELOS PRONTOS: ###");
		for(int i = 0; i < modelosProntos.size(); i++) {
			System.out.println(modelosProntos.get(i).toString());
		}
	}
	
	public void verificarListaProjeto(List<Encomenda> encomendas, List<Engenheiro> engenheiros) {
		for(int i = 0; i < encomendas.size(); i++) {
			boolean encomendaExiste = false;
			Encomenda encomenda = encomendas.get(i);
			
			for(int j = 0; j < modelosProntos.size(); j++) {
				String strModelo = modelosProntos.get(j).toString();
				
				if(encomenda.toString().compareTo(strModelo) == 0) {
					encomendaExiste = true;
					j = modelosProntos.size() + 1;
				}
			}
			
			System.out.println("### ENCOMENDA N° " + i + ": ###");
			
			if(encomendaExiste) {			
				System.out.println("Modelo pronto na Lista de Projetos -> produzirEncomenda() em Produção");
			} else {
				System.out.println("Modelo não existente na Lista de Projetos -> verificarEngenheirosDisponiveis() em Projeto");
				projeto = new Projeto();
				boolean engenheiroDisponivel = projeto.verificarEngenheirosDisponiveis(engenheiros);
				
				if(engenheiroDisponivel) {
					System.out.println("### ENGENHEIROS DISPONÍVEIS: ###");
					for(int j = 0; j < engenheiros.size(); j++) {
						System.out.println(engenheiros.get(j).getNome());
					}
				
					System.out.println("Engenheiros disponíveis -> desenvolverProjeto() em Projeto");
					projeto.desenvolverProjeto(encomenda, modelosProntos);
				} else {
					System.out.println("Nenhum engenheiro disponível. Necessário contratar.");
				}
			}
		}
	}
		
}