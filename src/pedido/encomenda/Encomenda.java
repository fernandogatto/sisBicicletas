package pedido.encomenda;

import java.util.ArrayList;
import java.util.List;

import peça.Peça;
import peça.banco.Banco;
import peça.guidão.Guidão;
import peça.pedal.Pedal;
import peça.pneu.Pneu;
import peça.quadro.Quadro;

public class Encomenda {

	private Banco banco;
	private Guidão guidão;
	private Pedal pedal;
	private Pneu pneu;
	private Quadro quadro;
	private List<Peça> peças = new ArrayList<>();
	
	public Encomenda() {}
	
	public Encomenda(Banco banco, Guidão guidão, Pedal pedal, Pneu pneu, Quadro quadro) {
		this.banco = banco;
		this.guidão = guidão;
		this.pedal = pedal;
		this.pneu = pneu;
		this.quadro = quadro;
		peças.add(banco);
		peças.add(guidão);
		peças.add(pedal);
		peças.add(pneu);
		peças.add(quadro);
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Guidão getGuidão() {
		return guidão;
	}

	public void setGuidão(Guidão guidão) {
		this.guidão = guidão;
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

	public List<Peça> getPeças() {
		return peças;
	}

	public void setPeças(List<Peça> peças) {
		this.peças = peças;
	}
	
	public void montarEncomenda(Banco banco, Guidão guidão, Pedal pedal, Pneu pneu, Quadro quadro) {
		this.banco = banco;
		this.guidão = guidão;
		this.pedal = pedal;
		this.pneu = pneu;
		this.quadro = quadro;
		peças.add(banco);
		peças.add(guidão);
		peças.add(pedal);
		peças.add(pneu);
		peças.add(quadro);
	}
	
	public void mostrarEncomenda() {
		System.out.println("### ENCOMENDA: ###");
		for(int i = 0; i < this.getPeças().size(); i++) {
			System.out.print("[" + this.getPeças().get(i).getNome() + "] ");
		}
		System.out.println("");
	}
	
	@Override
	public String toString() {
		String encomenda = "";
		
		for(int i = 0; i < this.getPeças().size(); i++) {
			encomenda = encomenda + "[" + this.getPeças().get(i).getNome() + "] ";
		}
	
		return encomenda;
	}
}
