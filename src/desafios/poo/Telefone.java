package desafios.poo;

import desafios.poo.services.ServiçoTelefonia;
import java.util.Scanner;
import java.util.Random;

public class Telefone extends ServiçoTelefonia{

	@Override
	public void ligar() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para quem você deseja ligar?");
		String nome = sc.nextLine();
		System.out.println("Ligando para "+nome);
	}

	@Override
	public void atender() {
		String[] pessoas = {"Jefferson", "João", "Ana", "Lucas", "Augusto"};
		Random random = new Random();
        int numero = random.nextInt(5);
        
        System.out.println(pessoas[numero] + " está te ligando!");
        System.err.println("Você atendeu "+pessoas[numero]);
		
	}

	@Override
	public void iniciarCorrerioVoz() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Para quem você deseja enviar um correio de voz?");
		String nome = sc.nextLine();
		System.out.println("Enviando Correio de voz para "+nome);
	}

}
