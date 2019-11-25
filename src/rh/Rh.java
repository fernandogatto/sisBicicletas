package rh;

import java.util.ArrayList;
import java.util.List;

import rh.pessoa.Engenheiro;
import rh.pessoa.Gerente;
import rh.pessoa.Tecnico;

public class Rh {
	
	private List<Gerente> gerentes = new ArrayList<>();
	private List<Tecnico> tecnicos = new ArrayList<>();
	private List<Engenheiro> engenheiros = new ArrayList<>();
	
	public List<Gerente> getGerentes() {
		return gerentes;
	}
	public void setGerentes(List<Gerente> gerentes) {
		this.gerentes = gerentes;
	}
	public List<Tecnico> getTecnicos() {
		return tecnicos;
	}
	public void setTecnicos(List<Tecnico> tecnicos) {
		this.tecnicos = tecnicos;
	}
	public List<Engenheiro> getEngenheiros() {
		return engenheiros;
	}
	public void setEngenheiros(List<Engenheiro> engenheiros) {
		this.engenheiros = engenheiros;
	}

}
