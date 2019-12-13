package pedido.encomenda;

import java.util.ArrayList;
import java.util.List;

import peca.Peca;
import peca.banco.Banco;
import peca.guidao.Guidao;
import peca.pedal.Pedal;
import peca.pneu.Pneu;
import peca.quadro.Quadro;
import peca.Peca;

public class Encomenda {

	private Banco banco;
	private Guidao guidao;
	private Pedal pedal;
	private Pneu pneu;
	private Quadro quadro;
	private List<Peca> pecas = new ArrayList<>();
	
	public Encomenda() {}
	
	public Encomenda(Banco banco, Guidao guidao, Pedal pedal, Pneu pneu, Quadro quadro) {
		this.banco = banco;
		this.guidao = guidao;
		this.pedal = pedal;
		this.pneu = pneu;
		this.quadro = quadro;
		pecas.add(banco);
		pecas.add(guidao);
		pecas.add(pedal);
		pecas.add(pneu);
		pecas.add(quadro);
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public Guidao getGuidao() {
		return guidao;
	}

	public void setGuidao(Guidao guidao) {
		this.guidao = guidao;
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

	public List<Peca> getPecas() {
		return pecas;
	}

	public void setPecas(List<Peca> pecas) {
		this.pecas = pecas;
	}
	
	public void montarEncomenda(Banco banco, Guidao guidao, Pedal pedal, Pneu pneu, Quadro quadro) {
		this.banco = banco;
		this.guidao = guidao;
		this.pedal = pedal;
		this.pneu = pneu;
		this.quadro = quadro;
		pecas.add(banco);
		pecas.add(guidao);
		pecas.add(pedal);
		pecas.add(pneu);
		pecas.add(quadro);
	}
	
	public void mostrarEncomenda() {
		System.out.println("### ENCOMENDA: ###");
		for(int i = 0; i < this.getPecas().size(); i++) {
			System.out.print("[" + this.getPecas().get(i).getNome() + "] ");
		}
		System.out.println("");
	}
	
	@Override
	public String toString() {
		String encomenda = "";
		
		for(int i = 0; i < this.getPecas().size(); i++) {
			encomenda = encomenda + "[" + this.getPecas().get(i).getNome() + "] ";
		}
	
		return encomenda;
	}
}
