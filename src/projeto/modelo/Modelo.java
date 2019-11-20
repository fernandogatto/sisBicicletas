package projeto.modelo;

import java.util.ArrayList;
import java.util.List;

import pe�a.Pe�a;
import pe�a.banco.Banco;
import pe�a.guid�o.Guid�o;
import pe�a.pedal.Pedal;
import pe�a.pneu.Pneu;
import pe�a.quadro.Quadro;

public class Modelo {

	private Banco banco;
	private Guid�o guid�o;
	private Pedal pedal;
	private Pneu pneu;
	private Quadro quadro;
	private List<Pe�a> pe�as = new ArrayList<>();
	
	public Modelo() {}
	
	public Modelo(Banco banco, Guid�o guid�o, Pedal pedal, Pneu pneu, Quadro quadro) {
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

	public void montarModelo(Banco banco, Guid�o guid�o, Pedal pedal, Pneu pneu, Quadro quadro) {
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
	
	public void mostrarModelo() {
		System.out.println("### MODELO: ###");
		for(int i = 0; i < this.getPe�as().size(); i++) {
			System.out.print("[" + this.getPe�as().get(i).getNome() + "] ");
		}
		System.out.println("");
	}

	@Override
	public String toString() {
		String modelo = "";
		
		for(int i = 0; i < this.getPe�as().size(); i++) {
			modelo = modelo + "[" + this.getPe�as().get(i).getNome() + "] ";
		}
	
		return modelo;
	}	
	
}
