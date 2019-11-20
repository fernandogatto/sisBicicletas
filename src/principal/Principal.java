package principal;

import estoque.Estoque;
import pedido.encomenda.Encomenda;
import peça.banco.BancoCouro;
import peça.banco.BancoPlastico;
import peça.guidão.GuidãoCurvo;
import peça.guidão.GuidãoReto;
import peça.pedal.PedalComClip;
import peça.pedal.PedalSemClip;
import peça.pneu.PneuFino;
import peça.pneu.PneuGrosso;
import peça.quadro.QuadroBMX;
import peça.quadro.QuadroTrilha;
import projeto.modelo.Modelo;
import rh.Rh;
import rh.pessoa.Gerente;
import rh.pessoa.Tecnico;

public class Principal {

	public static void main(String[] args) {
		
		// Pessoas
		
		Tecnico tecnico1 = new Tecnico("Alexandre", false);
		Tecnico tecnico2 = new Tecnico("Beatriz", false);
		Tecnico tecnico3 = new Tecnico("Carlos", false);
		
		Gerente gerente1 = new Gerente("Daniela", false);
		
		// Rh
		
		Rh rh = new Rh();
		
		rh.getTecnicos().add(tecnico1);
		rh.getTecnicos().add(tecnico2);
		rh.getTecnicos().add(tecnico3);
		
		rh.getGerentes().add(gerente1);
		
		//	Peças
		
		BancoCouro bancoCouro = new BancoCouro();
		BancoPlastico bancoPlastico = new BancoPlastico();
		GuidãoCurvo guidaoCurvo = new GuidãoCurvo();
		GuidãoReto guidaoReto = new GuidãoReto();
		PedalComClip pedalComClip = new PedalComClip();
		PedalSemClip pedalSemClip = new PedalSemClip();
		PneuFino pneuFino = new PneuFino();
		PneuGrosso pneuGrosso = new PneuGrosso();
		QuadroBMX quadroBMX = new QuadroBMX();
		QuadroTrilha quadroTrilha = new QuadroTrilha();
		
		// Modelos pré definidos de fábrica
		
		Modelo modelo1 = new Modelo(bancoPlastico, guidaoReto, pedalComClip, pneuGrosso, quadroTrilha);
		modelo1.mostrarModelo();
		
		Modelo modelo2 = new Modelo(bancoCouro, guidaoCurvo, pedalSemClip, pneuFino, quadroTrilha);
		modelo2.mostrarModelo();
		
		// Estoque		

		Estoque estoque = new Estoque();
		estoque.adicionarModeloEstoque(modelo1);
		estoque.adicionarModeloEstoque(modelo2);
		
		// Encomendas
		
		Encomenda encomenda1 = new Encomenda(bancoPlastico, guidaoReto, pedalComClip, pneuGrosso, quadroTrilha);
		encomenda1.mostrarEncomenda();
		estoque.verificarEstoque(encomenda1);
		
		Encomenda encomenda2 = new Encomenda(bancoCouro, guidaoReto, pedalSemClip, pneuGrosso, quadroBMX);
		encomenda2.mostrarEncomenda();
		estoque.verificarEstoque(encomenda2);
		

	}

}
