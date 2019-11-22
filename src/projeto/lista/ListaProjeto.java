package projeto.lista;


import java.util.ArrayList;
import java.util.List;
import pedido.encomenda.Encomenda;
import projeto.Projeto;
import projeto.modelo.Modelo;

public class ListaProjeto {

	private List<Modelo> modelosProntos = new ArrayList<>();
	private Modelo modelo;
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
	
	public void verificarListaProjeto(Encomenda encomenda) {
		boolean encomendaExiste = false;
		
		for(int i = 0; i < modelosProntos.size(); i++) {
			String strModelo = modelosProntos.get(i).toString();
			
			if(encomenda.toString().compareTo(strModelo) == 0) {
				encomendaExiste = true;
				i = modelosProntos.size() + 1;
			}
		}
		
		if(encomendaExiste) {			
			System.out.println("Modelo pronto na Lista de Projetos -> produzirEncomenda()");
		} else {
			System.out.println("Modelo não existente na Lista de Projetos -> desenvolverProjeto() em Projeto");
			projeto = new Projeto();
			projeto.desenvolverProjeto(encomenda, modelosProntos);
		}
	}
		
}