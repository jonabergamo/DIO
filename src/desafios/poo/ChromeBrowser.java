package desafios.poo;

import desafios.poo.services.NavegadorInternet;

public class ChromeBrowser extends NavegadorInternet{

	@Override
	public void exibirPagina() {
		System.err.println("Exibindo pagina web");
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicionando nova aba");
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando página");
	}

}
