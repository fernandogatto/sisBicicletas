package estoque;

import java.util.ArrayList;
import java.util.List;

import pedido.encomenda.Encomenda;
import projeto.modelo.Modelo;

public class Estoque {

	private List<Modelo> modelosProntos = new ArrayList<>();
	private Modelo modelo;
	
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
			System.out.println("Modelo pronto no estoque -> entregar encomenda");
		} else {
			System.out.println("Modelo em falta no estoque -> montar modelo");	
		}
	}
	
}
