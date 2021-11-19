package Projeto;

public class Herbicida {
	
	private String nome;
	private String grupoPertencente;
	private Boolean ÈSeletivo;
	private Imagens imagem;
	
	public Herbicida(String nome, String grupoPertencente, Boolean ÈSeletivo, Imagens imagem) {
		this.nome = nome;
		this.grupoPertencente = grupoPertencente;
		this.ÈSeletivo = ÈSeletivo;
		this.imagem = imagem;
	}
	
	public String getNome() {
		if(nome == null) {
			throw new RuntimeException ("Nome n„o pode ser nulo");
		}
		return nome;
	}
	
	public String getGrupoPertencente() {
		if (grupoPertencente == null) {
			throw new RuntimeException("Grupo pertencente n„o pode ser nulo");
		}
		return grupoPertencente;
	}
	
	public Boolean getÈSeletivo() {
		return ÈSeletivo;
	}
	
	public Imagens getImagem() {
		return imagem;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setGrupoPertencente(String grupoPertencente) {
		this.grupoPertencente = grupoPertencente;
	}

	public void setÈSeletivo(Boolean ÈSeletivo) {
		this.ÈSeletivo = ÈSeletivo;
	}
	
	public void setImagem(Imagens imagem) {
		this.imagem = imagem;
	}
	
	public void apresentarHerbicidas(Herbicida herbicida) {
		System.out.println("================== HERBICIDAS ======================");
		System.out.println("Nome: " + herbicida.getNome());
		System.out.println("Grupo: " + herbicida.getGrupoPertencente());
		if(herbicida.getÈSeletivo() == true) {
			System.out.println("Seletivo.");
		}
		else {
			System.out.println("N„o-Seletivo");
		}	
		System.out.println("Imagem: " + herbicida.getImagem());
	}
	
}
