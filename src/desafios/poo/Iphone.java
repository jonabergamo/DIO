package desafios.poo;

public class Iphone {

	public static void main(String[] args) {
		ChromeBrowser navegador = new ChromeBrowser();
		Spotify spotify = new Spotify();
		Telefone telefone = new Telefone();	
		
		navegador.exibirPagina();
		navegador.adicionarNovaAba();
		navegador.atualizarPagina();
		System.out.println("--------");
		spotify.tocar();
		spotify.pausar();
		spotify.selecionarMusica();
		System.out.println("--------");
		telefone.ligar();
		telefone.atender();
		telefone.iniciarCorrerioVoz();
	}

}
