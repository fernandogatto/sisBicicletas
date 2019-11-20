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

}
