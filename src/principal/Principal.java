package principal;

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

public class Principal {

	public static void main(String[] args) {
		
		//	materiais
		
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
		
		// modelos pré definidos de fábrica
		
		Modelo modelo1 = new Modelo(bancoPlastico, guidaoReto, pedalSemClip, pneuGrosso, quadroTrilha);
		modelo1.mostrarModelo();
		
		Modelo modelo2 = new Modelo(bancoCouro, guidaoCurvo, pedalComClip, pneuFino, quadroTrilha);
		modelo2.mostrarModelo();
		
		// cliente entra com uma encomenda
		
		// receberEncomenda()
		
		// verifica se modelo de encomenda existe
	
		System.out.println(modelo2.verificarModelo());
		

	}

}
