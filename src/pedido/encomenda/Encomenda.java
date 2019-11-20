package pedido.encomenda;

import java.util.ArrayList;
import java.util.List;

import pe�a.Pe�a;
import pe�a.banco.Banco;
import pe�a.guid�o.Guid�o;
import pe�a.pedal.Pedal;
import pe�a.pneu.Pneu;
import pe�a.quadro.Quadro;

public class Encomenda {

	private Banco banco;
	private Guid�o guid�o;
	private Pedal pedal;
	private Pneu pneu;
	private Quadro quadro;
	private List<Pe�a> pe�as = new ArrayList<>();
	
	public Encomenda() {}
	
	public Encomenda(Banco banco, Guid�o guid�o, Pedal pedal, Pneu pneu, Quadro quadro) {
		this.banco = banco;
		this.guid�o = guid�o;
		this.pedal = pedal;
		this.pneu = pneu;
		this.quadro = quadro;
		pe�as.add(banco);
		pe�as.add(guid�o);
		pe�as.add(pedal);
		pe�as.add(pneu);
		pe�as.add(quadro);
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Guid�o getGuid�o() {
		return guid�o;
	}

	public void setGuid�o(Guid�o guid�o) {
		this.guid�o = guid�o;
	}

	public Pedal getPedal() {
		return pedal;
	}

	public void setPedal(Pedal pedal) {
		this.pedal = pedal;
	}

	public Pneu getPneu() {
		return pneu;
	}

	public void setPneu(Pneu pneu) {
		this.pneu = pneu;
	}

	public Quadro getQuadro() {
		return quadro;
	}

	public void setQuadro(Quadro quadro) {
		this.quadro = quadro;
	}

	public List<Pe�a> getPe�as() {
		return pe�as;
	}

	public void setPe�as(List<Pe�a> pe�as) {
		this.pe�as = pe�as;
	}
	
	public void montarEncomenda(Banco banco, Guid�o guid�o, Pedal pedal, Pneu pneu, Quadro quadro) {
		this.banco = banco;
		this.guid�o = guid�o;
		this.pedal = pedal;
		this.pneu = pneu;
		this.quadro = quadro;
		pe�as.add(banco);
		pe�as.add(guid�o);
		pe�as.add(pedal);
		pe�as.add(pneu);
		pe�as.add(quadro);
	}
	
	public void mostrarEncomenda() {
		System.out.println("### ENCOMENDA: ###");
		for(int i = 0; i < this.getPe�as().size(); i++) {
			System.out.print("[" + this.getPe�as().get(i).getNome() + "] ");
		}
		System.out.println("");
	}
	
	@Override
	public String toString() {
		String encomenda = "";
		
		for(int i = 0; i < this.getPe�as().size(); i++) {
			encomenda = encomenda + "[" + this.getPe�as().get(i).getNome() + "] ";
		}
	
		return encomenda;
	}
}
