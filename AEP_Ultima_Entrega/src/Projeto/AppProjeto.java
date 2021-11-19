package Projeto;

public class AppProjeto {
	
public static void main(String[] args) {
		
		ErvaDaninha buva = new ErvaDaninha ("Buva", "Conyza", "Eudicotiledônea", null);
		Herbicida glifosato = new Herbicida("Glifosato", "Amplo espectro", false, null);
		
		Herbicida_ErvaDaninha buva_glifosato = new Herbicida_ErvaDaninha(1, buva, glifosato);
		
		ItemUsuário guilherme = new ItemUsuário(1);
		ItemUsuário vini = new ItemUsuário(2);
		guilherme.cadastrarUsuário(new Usuário("Guilherme", "guilherme@gmail.com", "admin", "1234"));
		vini.cadastrarUsuário(new Usuário("Vinicius", "vinicius@gmail.com", "vini", "1234"));
	
		buva.apresentarHerbicida(buva, buva_glifosato);
		glifosato.apresentarHerbicidas(glifosato);
	}
}