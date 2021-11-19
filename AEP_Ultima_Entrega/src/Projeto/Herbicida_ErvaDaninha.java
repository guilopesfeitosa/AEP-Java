package Projeto;

public class Herbicida_ErvaDaninha {
	
	private int relacao;
	private ErvaDaninha ervaDaninha;
	private Herbicida herbicida;
	
	public Herbicida_ErvaDaninha (int relacao, ErvaDaninha ervaDaninha, Herbicida herbicida) {
		this.relacao = relacao;
		this.ervaDaninha = ervaDaninha;
		this.herbicida = herbicida;
	}
	
	public ErvaDaninha getErvaDaninha() {
		return ervaDaninha;
	}
	
	public Herbicida getHerbicida() {
		return herbicida;
	}
	
	public int getRelacao() {
		return relacao;
	}
	
	public void setErvaDaninha(ErvaDaninha ervaDaninha) {
		this.ervaDaninha = ervaDaninha;
	}
	
	public void setHerbicida(Herbicida herbicida) {
		this.herbicida = herbicida;
	}
	
	public void setRelacao(int relacao) {
		this.relacao = relacao;
	}
}
