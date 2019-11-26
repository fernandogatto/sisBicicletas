package principal;

import java.util.List;

import pedido.Pedido;
import pedido.encomenda.Encomenda;
import pe�a.banco.BancoCouro;
import pe�a.banco.BancoPlastico;
import pe�a.guid�o.Guid�oCurvo;
import pe�a.guid�o.Guid�oReto;
import pe�a.pedal.PedalComClip;
import pe�a.pedal.PedalSemClip;
import pe�a.pneu.PneuFino;
import pe�a.pneu.PneuGrosso;
import pe�a.quadro.QuadroBMX;
import pe�a.quadro.QuadroTrilha;
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
	
		//	Pe�as
		
		BancoCouro bancoCouro = new BancoCouro();
		BancoPlastico bancoPlastico = new BancoPlastico();
		Guid�oCurvo guidaoCurvo = new Guid�oCurvo();
		Guid�oReto guidaoReto = new Guid�oReto();
		PedalComClip pedalComClip = new PedalComClip();
		PedalSemClip pedalSemClip = new PedalSemClip();
		PneuFino pneuFino = new PneuFino();
		PneuGrosso pneuGrosso = new PneuGrosso();
		QuadroBMX quadroBMX = new QuadroBMX();
		QuadroTrilha quadroTrilha = new QuadroTrilha();
		
		// Modelos pr� definidos de f�brica
		
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
		
		// Produ��o
		
		// producao.produzirEncomenda(pedido1.getEncomendas()); List<Encomenda> encomendas
		
	}

}
