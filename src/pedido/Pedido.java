package pedido;

import java.util.ArrayList;
import java.util.List;

import pedido.encomenda.Encomenda;

public class Pedido {
	
	List<Encomenda> encomendas = new ArrayList<>();
	
	public Pedido() {}

	public List<Encomenda> getEncomendas() {
		return encomendas;
	}

	public void setEncomendas(List<Encomenda> encomendas) {
		this.encomendas = encomendas;
	}
	
	public void adicionarEncomenda(Encomenda encomenda) {
		this.getEncomendas().add(encomenda);
	}
	
	public void listarEncomendas() {
		System.out.println("### ENCOMENDAS: ###");
		for(int i = 0; i < encomendas.size(); i++) {
			System.out.println(encomendas.get(i).toString());
		}
	}

}
