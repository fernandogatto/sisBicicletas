package principal;

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
import projeto.modelo.Modelo;

public class Principal {

	public static void main(String[] args) {
		
		//	materiais
		
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
		
		// modelos pr� definidos de f�brica
		
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
