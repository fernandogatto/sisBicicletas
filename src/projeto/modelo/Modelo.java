package projeto.modelo;

import java.util.ArrayList;
import java.util.List;

import peca.guidao.Guidao;
import peca.pedal.Pedal;
import peca.pneu.Pneu;
import peca.quadro.Quadro;
import peca.Peca;
import peca.banco.Banco;

public class Modelo {

	private Banco banco;
	private Guidao guidao;
	private Pedal pedal;
	private Pneu pneu;
	private Quadro quadro;
	private List<Peca> pecas = new ArrayList<>();
	
	public Modelo() {}
	
	public Modelo(Banco banco, Guidao guidao, Pedal pedal, Pneu pneu, Quadro quadro) {
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

	public Guidao getGuidão() {
		return guidao;
	}

	public void setGuidão(Guidao guidao) {
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

	public void setpecas(List<Peca> pecas) {
		this.pecas = pecas;
	}

	public void montarModelo(Banco banco, Guidao guidao, Pedal pedal, Pneu pneu, Quadro quadro) {
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
	
	public void mostrarModelo() {
		System.out.println("### MODELO: ###");
		for(int i = 0; i < this.getPecas().size(); i++) {
			System.out.print("[" + this.getPecas().get(i).getNome() + "] ");
		}
		System.out.println("");
	}

	@Override
	public String toString() {
		String modelo = "";
		
		for(int i = 0; i < this.getPecas().size(); i++) {
			modelo = modelo + "[" + this.getPecas().get(i).getNome() + "] ";
		}
	
		return modelo;
	}	
	
}
