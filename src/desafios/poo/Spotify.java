package desafios.poo;

import desafios.poo.services.ReprodutorMusical;
import java.util.Scanner;

public class Spotify extends ReprodutorMusical{

	@Override
	public void tocar() {
System.out.println("Iniciando faixa musical");		
	}

	@Override
	public void pausar() {
System.out.println("Musica pausada");		
	}

	@Override
	public void selecionarMusica() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Escolha uma musica para tocar: ");
		String msc = sc.nextLine();
		System.out.println("Você escolheu "+msc+", reproduzindo...");
	}

}
