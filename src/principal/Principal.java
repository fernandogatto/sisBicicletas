package principal;

import peca.banco.BancoCouro;
import peca.banco.BancoPlastico;
import peca.guidao.GuidaoCurvo;
import peca.guidao.GuidaoReto;
import peca.pedal.PedalComClip;
import peca.pedal.PedalSemClip;
import peca.pneu.PneuFino;
import peca.pneu.PneuGrosso;
import peca.quadro.QuadroBMX;
import peca.quadro.QuadroTrilha;
import pedido.Pedido;
import pedido.encomenda.Encomenda;
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
	
		//	Pecas
		
		BancoCouro bancoCouro = new BancoCouro();
		BancoPlastico bancoPlastico = new BancoPlastico();
		GuidaoCurvo guidaoCurvo = new GuidaoCurvo();
		GuidaoReto guidaoReto = new GuidaoReto();
		PedalComClip pedalComClip = new PedalComClip();
		PedalSemClip pedalSemClip = new PedalSemClip();
		PneuFino pneuFino = new PneuFino();
		PneuGrosso pneuGrosso = new PneuGrosso();
		QuadroBMX quadroBMX = new QuadroBMX();
		QuadroTrilha quadroTrilha = new QuadroTrilha();
		
		// Modelos pre definidos de fabrica
		
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

		Encomenda encomenda2 = new Encomenda(bancoCouro, guidaoReto, pedalSemClip, pneuGrosso, quadroBMX);
		encomenda2.mostrarEncomenda();
		
		// Pedidos
		
		Pedido pedido1 = new Pedido();
		pedido1.adicionarEncomenda(encomenda1);
		pedido1.adicionarEncomenda(encomenda2);
		pedido1.listarEncomendas();
		
		listaProjeto.verificarListaProjeto(pedido1.getEncomendas(), rh.getEngenheiros());
		
		listaProjeto.listarModelosProntos();
		
	}

}
