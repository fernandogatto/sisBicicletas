package projeto;

import java.util.ArrayList;
import java.util.List;

import pedido.encomenda.Encomenda;
import projeto.modelo.Modelo;

public class Projeto {
	
	private List<Modelo> modelos = new ArrayList<>();
	
	public Projeto() {}

	public List<Modelo> getModelos() {
		return modelos;
	}

	public void setModelos(List<Modelo> modelos) {
		this.modelos = modelos;
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
			System.out.println("Modelo existe -> fazer projeto em Produção");
		} else {
			System.out.println("Modelo não existe -> desenvolver projeto");	
		}
	}
	
	public void desenvolverProjeto() {
		
	}

}
