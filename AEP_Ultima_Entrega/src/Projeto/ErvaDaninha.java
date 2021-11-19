package Projeto;

public class ErvaDaninha {
	
	private String nomeUsual;
	private String nomeCientifico;
	private String breveDescrição;
	private Imagens imagem;

	public ErvaDaninha(String nomeUsual, String nomeCientifico, String breveDescrição, Imagens imagem) {
		this.nomeUsual = nomeUsual;
		this.nomeCientifico = nomeCientifico;
		this.breveDescrição = breveDescrição;
		this.imagem = imagem;
	}
	
	public String getNomeUsual() {
		return nomeUsual;
	}
	
	public String getNomeCientifico() {
		return nomeCientifico;
	}
	
	public String getBreveDescrição() {
		return breveDescrição;
	}
		
	public Imagens getImagem() {
		return imagem;
	}
	
	public void setNomeUsual(String nomeUsual) {
		this.nomeUsual = nomeUsual;
	}
	
	public void setNomeCientifico(String nomeCientifico) {
		this.nomeCientifico = nomeCientifico;
	}
	
	public void setBreveDescrição(String breveDescrição) {
		this.breveDescrição = breveDescrição;
	}
	
	public void setImagem(Imagens imagem) {
		this.imagem = imagem;
	}
	
	public void apresentarHerbicida (ErvaDaninha ervaDaninha, Herbicida_ErvaDaninha relacao) {
		System.out.println("================== ERVAS DANINHAS ==================");
		System.out.println("Nome: " + ervaDaninha.getNomeUsual());
		System.out.println("Nome Cientifico: " + ervaDaninha.getNomeCientifico());
		System.out.println("Breve Descrição: " + ervaDaninha.getBreveDescrição());
		System.out.println("Herbicida Recomendado: " + relacao.getHerbicida().getNome());
	}
}

