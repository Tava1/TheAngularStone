package rpgtextual;

import java.awt.event.KeyEvent;
import java.util.Scanner;
import java.util.ArrayList;


public class TheAngularStone {
	
public static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.println("****Bem vindo ao jogo****"
				+ "\n\nThe Angular Stone"
				+ "\n\nMENU"
				+ "\nNavegue pelo menu digitando o numero correspondente a opcao dejesada:"
				+ "\n1 - Iniciar Historia"
				+ "\n2 - Ler Sobre a Historia do jogo"
				+ "\n3 - Intrucoes de jogo"
				+ "\n4 - Creditos"
				+ "\n5 - Sair");
		int opcaoMenu = scanner.nextInt();
		switch (opcaoMenu) {
		case 1:
			break;
		case 2:
			ImprimeHistotiaJogo();
			break;
		case 3:
			break;
		case 4:
			ImprimeCreditos();
			break;
		case 5:
			System.out.println("Ate a proxima");
			SairJogo();
			break;
		}
		
		boolean desafioConcuido = false;
		while(desafioConcuido){
			
			// Proceduralzao
			// TODO REFATORAR
			
			// DESAFIO TUTORIAL
			
			System.out.println("Caminho Tutorial ...");
			System.out.println("Desafio Tutorial");
			// opcaoDesafio = scanner.nextBoolean();
			
			if(opcaoDesafio == 1) {
				System.out.println("A ponte quebrou e voce caiu no lago, volte e tente outra coisa.");
			} else if (opcaoDesafio == 2){
				System.out.println("Voce nao pode entrar na cabana, a porta da cabana esta fechada, na ha ninguem em casa.");
			} else if (opcaoDesafio == 3) {
				System.out.println("Algo de bom acontece.");
				desafioConcuido = true;
			} else {
				System.out.println("Nao tente fazer isso, vai se queimar.");
			}
			
			// NPC DO BEM
			// Npc ofcerece ajuda
			System.out.println("Ola, sou o primeiro NPC, gostaria da minha ajuda?");
			char simNaoNpc = scanner.next().charAt(0);
			if ('s' == simNaoNpc) {
				// TODO DESAFIO 1
				if(opcaoDesafio == true) {
						// TODO NPC Pergunta se deseja continuar com ele
						if (simNaoNpc == 's') {
							// TODO Dica para o proximo desafio.
							// TODO DESAFIO 2
							
						}
						else {
							// TODO DESAFIO 3
							if (opcaoDesafio == true) {
								// TODO DESAFIO 4
							}
						}
						// TODO Continue em outra estrutura
				
					else {
						// MORRE.
						// TODO Restante de vidas.
					}
					
				}
				
				else {
					// MORRE.
					// TODO Restante de vidas.
				}
			} 
			// Escolha: usuario negou a ajuda do NPC
			else {
				// TODO DESAFIO 3
				if (opcaoDesafio == true) {
					// TODO DESAFIO 4 
					if (opcaoDesafio == true) {
						// Continua em outra estrutura
					}
					else {
						// MORRE.
						// TODO Restante de vidas.
					}	
				}
				else {
					// MORRE.
					// TODO Restante de vidas.
				}
			}
			
		}
	}
	// TODO Function que volta para o menu.
	public static void Menu(){
		System.out.println("Voce esta no meni=u");
	}
	// TODO Adicionar perguntas e criar uma selecao aleatoria que remove a pergunta que ja foi usada no momento do jogo
	
	public static ArrayList<String> AdicionarPerguntas() {
		ArrayList<String> desafios = new ArrayList<>();
		
		desafios.add("Pergunta 1");
		desafios.add("Pergunta 2");
		desafios.add("Pergunta 3");
		desafios.add("Pergunta 4");
		desafios.add("Pergunta 5");
		desafios.add("Pergunta 6");
		desafios.add("Pergunta 7");
		desafios.add("Pergunta 8");
		return desafios;
		
		
	}
	// TODO Function Imprimir a historia na tela quando for chamada, dentro e fora do menu, chamando apenas escrevendo historia no console.
	
	public static void ImprimeHistotiaJogo() {

		System.out.println("\nÉ uma bela e pacífica manhã quente de primavera, as crianças brincam nas ruas e florestas, a cidade está agitada. Os adultos estão trabalhando no comércio e você, como a grande maioria Anã, está trabalhando nas minas de ouro, que fica a cerca de 5km de Dastarian."
							+ "\nEm sua pausa de trabalho das escavações, você percebe que o lindo e belo dia que vinha se desenrolando, começa a ficar nublado, com densas formações de nuvens escuras, o calor da primavera se transforma em frio de outono,"
							+ "\na terra treme e o cenário nos céus é de tempestade e escuridão. Mais adiante, do topo das minas, você avista uma infantaria de Orcs montados em bestas caninas, cruzando a floresta de Brendanon."
							+ "\nImediatamente você lembra de seus dois filhos e sua esposa. Para resgatá-los você sabe que deve ser mais rápido que os Orcs. Ao sul está a mina, por onde existe uma passagem estreita e que corta para dentro da floresta, já saindo perto de Dastarian."
							+ "\nAo leste, a estrada para a cidade, e este é o mesmo caminho que a infantaria está tomando logo atrás; e ao Oeste está o caminho livre para Dastarian, porém, é um caminho mais longo.");
		System.out.println("Digite Enter para voltar ao menu.");
	}
    public static void ImprimeCreditos(){
 
    	System.out.println("Desenvolvimento do projeto: Gustavo Santos, Gabriel Silva, Victor Pedrasani, Vitor Soares.");
    	
    }
    
	// TODO Function Exit Game Escrever sair no console.
	public static void SairJogo() {
		System.out.println("Voce saiu do jogo");
	}
	
	// TODO Criar function de teclas pressionadas
	public static void TeclaPressionada(KeyEvent e) {

		
		if(e.getKeyCode() == KeyEvent.VK_ENTER){
			Menu();
		}
	}
		
}