package principal;

import java.util.List;

import pedido.Pedido;
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
import projeto.lista.ListaProjeto;
import projeto.modelo.Modelo;
import rh.Rh;
import rh.pessoa.Engenheiro;

public class Principal {

	public static void main(String[] args) {
		
		// Pessoas
		
		Engenheiro eng1 = new Engenheiro("Alex", false);
		
		Rh rh = new Rh();
		rh.getEngenheiros().add(eng1);
	
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
		
		Modelo modelo2 = new Modelo(bancoCouro, guidaoCurvo, pedalSemClip, pneuFino, quadroBMX);
		modelo2.mostrarModelo();
		
		// Lista de Projetos prontos		

		ListaProjeto listaProjeto = new ListaProjeto();
		listaProjeto.adicionarModeloListaProjeto(modelo1);
		listaProjeto.adicionarModeloListaProjeto(modelo2);
		
		// Encomendas
		
		Encomenda encomenda1 = new Encomenda(bancoPlastico, guidaoReto, pedalComClip, pneuGrosso, quadroTrilha);
		encomenda1.mostrarEncomenda();
		listaProjeto.verificarListaProjeto(encomenda1, rh.getEngenheiros());
		
		Encomenda encomenda2 = new Encomenda(bancoCouro, guidaoReto, pedalSemClip, pneuGrosso, quadroBMX);
		encomenda2.mostrarEncomenda();
		listaProjeto.verificarListaProjeto(encomenda2, rh.getEngenheiros());
		
		listaProjeto.listarModelosProntos();
		
		// Pedidos
		
		Pedido pedido1 = new Pedido();
		pedido1.adicionarEncomenda(encomenda1);
		pedido1.adicionarEncomenda(encomenda2);
		pedido1.listarEncomendas();
		
		// Produção
		
		// producao.produzirEncomenda(pedido1.getEncomendas()); List<Encomenda> encomendas
		
	}

}
