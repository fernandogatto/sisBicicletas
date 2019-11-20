package estoque;

import java.util.ArrayList;
import java.util.List;

import pedido.encomenda.Encomenda;
import pe�a.Pe�a;
import projeto.Projeto;
import projeto.modelo.Modelo;

public class Estoque {

	private List<Modelo> modelosProntos = new ArrayList<>();
	private Modelo modelo;
	private Projeto projeto = new Projeto();
	private List<Pe�a> pe�as = new ArrayList<>();
	
	public Estoque() {}

	public List<Modelo> getModelosProntos() {
		return modelosProntos;
	}

	public void setModelosProntos(List<Modelo> modelosProntos) {
		this.modelosProntos = modelosProntos;
	}
	
	public void adicionarModeloEstoque(Modelo modelo) {
		modelosProntos.add(modelo);
	}
	
	public void verificarEstoque(Encomenda encomenda) {
		boolean encomendaExiste = false;
		
		for(int i = 0; i < modelosProntos.size(); i++) {
			String strModelo = modelosProntos.get(i).toString();
			
			if(encomenda.toString().compareTo(strModelo) == 0) {
				encomendaExiste = true;
				i = modelosProntos.size() + 1;
			}
		}
		
		if(encomendaExiste) {			
			System.out.println("Modelo pronto no Estoque -> entregarEncomenda()");
		} else {
			System.out.println("Modelo em falta no Estoque -> verificarModelo() em Projeto");
			projeto.verificarModelo(encomenda);
		}
	}
	
	public boolean verificarPe�asEstoque(List<Pe�a> pe�asModelo) {
		boolean suficiente = false;
		// falta estruturar a logica
		suficiente = true;
		return suficiente;
	}
	
}
