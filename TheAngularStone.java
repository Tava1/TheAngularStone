package exercicio;

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
			//IniciarJogo();
;			break;
		case 2:
			ImprimirMensagem("textoHistoria");
			break;
		case 3:
			break;
		case 4:
			ImprimirMensagem("textoCreditos");
			break;
		case 5:
			System.out.println("Ate a proxima");
			
			break;
		}
		//introducao ao personagem
		System.out.println("\n **INTRODUCAO AO PERSONAGEM**"
				+ "\n\nVocê é um anão que trabalha nas minas de ouro. Porém, você é treinado na arte da"
				+ "\nGuerra pelo exército anão, e sempre foi conhecido pela destreza com o machado, combate"
				+ "\ncorpo a corpo e inteligência no combate. Realmente um guerreiro diferenciado."
				+ "\n\nVocê trabalha nas minas pois o exército já tirou muito tempo e paz da sua vida, que"
				+ "\nvocê decide viver em paz ao lado de seus filhos.");
		
		// #Introdução da História (decisão)#
		
		
		System.out.println("\n\n **INTRODUCAO DA HISTORIA**"
				+ "\n\nÉ uma bela e pacífica manhã quente de primavera, as crianças brincam nas ruas e"
				+ "\nflorestas, a cidade está agitada. Os adultos estão trabalhando no comércio e você, como a"
				+ "\ngrande maioria Anã, está trabalhando nas minas de ouro, que fica a cerca de 5km de Dastarian."
				+ "\n\nEm sua pausa de trabalho das escavações, você percebe que o lindo e belo dia que"
				+ "\nvinha se desenrolando, começa a ficar nublado, com densas formações de nuvens escuras, o" 
				+ "\ncalor da primavera se transforma em frio de outono, a terra treme e o cenário nos céus é de" 
				+ "\ntempestade e escuridão. Mais adiante, do topo das minas, você avista uma infantaria de" 
				+ "\nOrcs montados em bestas caninas, cruzando a floresta de Brendanon.");
		
		System.out.println("Você sente que deve agir para ajudar sua cidade, mas por outro lado pode esperar"
				+ "\naté saber melhor o que se passa, e só então agir. O que decide fazer, agir prontamente ou nesperar?"
				+ "\n\nDecida: " 
				+ "\n\nSim agirei [s]." 
				+ "\nNao agirei [n]");
		char decisao = scanner.next().charAt(0);
		switch (decisao) {
			case 's':
				//IniciarHistoria();
				break;
			case 'n':
				System.out.println("Toda a Terra Média foi destruída.");
				//CreditosFinaisl();
				break;
		}
		
		
		// CASO SIM
		
		//INTRODUCAO
		
		System.out.println("Introdução: Você se chama Gomnor e vive no reino de Dastarian na terra média, onde\n" + 
				"anões vivem em paz. Porém, depois de 200 anos sem guerra, o Lord Orc Shenpor foi solto\n" + 
				"por um anão mago, e com ele, toda a magia negra do submundo de Ostarion, que é\n" + 
				"dominado por Orcs e criaturas das trevas.");
		// DESAFIO 1
		System.out.println("No caminho para salvar sua família, você encontra seu amigo Marstar que é um mago da\n" + 
				"montanha, e você pergunta:\n" + 
				"-“O que está acontecendo Marstar? ”\n" + 
				"-Ele responde: “A dimensão que separa estes dois mundos foi quebrada, é necessário\n" + 
				"restabelecer a ordem e expulsar Lord Shenpor de volta para Ostarion, fechando a brecha\n" + 
				"dimensional deixada entre os dois mundos.\n" + 
				"Lord Shenpor está com a Pedra Angular do equilíbrio, criada por anões magos antigos. Esta\n" + 
				"pedra controla as dimensões de toda a terra média. Você é forte, ágil e os Deuses te\n" + 
				"protejem Dotrebell. Encontre a Pedra Angular e expulse Lord Shenpor e todas as bestas das\n" + 
				"trevas”."
				+ "Você prontamente atende o chamado de Marstar e continua seu caminho. Na\n" + 
				"estrada você encontra um velho que te chama para ajudá-lo em sua organização secreta,\n" + 
				"para acabar com o domínio das trevas. Porém, de acordo com as aulas de administração,\n" + 
				"você sabe que as organizações servem a:"
				+ "\n"
				+ "\na) Sociedade"
				+ "\nb) Nação"
				+ "\nc) Instituições"
				+ "\nd) Indivíduos");
		char repostaJogador = scanner.next().charAt(0);
		
		
		
		//NPC
		
		System.out.println("Continuando sua viagem, ao fim da estrada, já quase no reino de Dastarian, você\n" + 
				"encontra um anão guerreiro ferido no braço. Ele está encostado em uma árvore, você para\n" + 
				"obter mais detalhes sobre o que está acontecendo. Ele te explica que você deve seguir pela\n" + 
				"parte alta da cidade, através das docas, pois os orcs tomaram toda a parte baixa da cidade,\n" + 
				"e a Pedra Angular está lá.\n" + 
				"-Vamos, eu te acompanharei. Diz o anão.\n" + 
				"Você decide ouvir o conselho, mas não sabe se aceita a ajuda do anão. Você aceita?");
				
		char decisaoNPC = scanner.next().charAt(0);
		
		switch (decisaoNPC) {
		case 's':
			
			//DESAFIO 2 TRUE / DIREITO
			AdicionarPerguntas(0);
			
			// DECISAO, PERMANENCIA DO NPC
					
			System.out.println("Vencendo a batalha, você sabe que o anão está ferido. Ele diz:\n" + 
							"-Posso ficar para ajuda-lo mais em sua jornada.\n" + 
							"O que você decide fazer? Permanecer com a ajuda do anão ou dispensá-lo falando\n" + 
							"para que ele vá se cuidar e ficar melhor?"
							+ "Sim, aceitar a ajuda / Não, deixa-lo ir se recuperar");
			decisaoNPC = scanner.next().charAt(0);
			
			switch (decisaoNPC) {
			case 's':
				//DESAFIO 3 TRUE / DIREITO
				AdicionarPerguntas(3);
				// TODO SAIDA DO NPC
				break;
			case 'n':
				
				// SAIDA DO NPC
				
				System.out.println("Dessa vez é necessário se despedir do anão, pois ele está muito debilitado. Mas\n" + 
						"antes de ir, ele fala: “-Cuidado, nem todos são como eu!\"");
				
				// DESAFIO 3 FALSE ESQUERDO
				
				System.out.println("Seguindo o caminho rumo ao Lord Shenpor, você encontra os guerreiros das\n" + 
						"forças especiais orc. Eles estão de plantão, mas pelo fato do ambiente estar seguro e calmo,\n" + 
						"estão um tanto quanto dispersos, vocês decidem atacar após fazer um planejamento, e\n" + 
						"executar o plano como um administrador o faria em uma Organização, os passos para que o\n" + 
						"plano dê certo, na ordem CORRETA, são:" +
						"\n" +
						"\na) Planejamento, organização, controle, direção." + 
						"\nb) Planejamento, controle, organização, direção." + 
						"\nc) Planejamento, organização, direção, controle." + 
						"\nd) Organização, planejamento, controle, direção.");
				break;
			default:
				break;
			}
							
			break;
		case 'n':
			
			//DESAFIO 2 FALSE / ESQUERDO
			
			System.out.println("Você segue pela parte alta com o guerreiro. Assim que vocês cruzam a metade da\n" + 
					"parte alta, rumo ao encontro de Lord Shenpor que mantém a Pedra sob seus cuidados,\n" + 
					"vocês se deparam com uma infantaria inteira de orcs. E são logo avistados.\n" + 
					"Combate-los sozinho, seria extremamente difícil, porém você conta com a ajuda do\n" + 
					"anão guerreiro. Vocês decidem combater de forma Eficaz, que significa:"
					+ "\n"
					+ "\na) Fazer certo as coisas, fator quantitativo."
					+ "\nb) Fazer a coisa certa, fator qualitativo."
					+ "\nc) Se preocupar com os problemas."
					+ "\nd) Se preocupar com os meios.");
			// TODO VALIDAR REPOSTA
			
			//DESAFIO 3 FALSE / ESQUERDO
			
			System.out.println("Seguindo o caminho rumo ao Lord Shenpor, você encontra os guerreiros das forças especiais orc. "
					+ "Eles estão de plantão, mas pelo fato do ambiente estar seguro e calmo, estão um tanto quanto dispersos,"
					+ "vocês decidem atacar após fazer um planejamento,e executar o plano como um administrador o faria em uma "
					+ "Organização, os passos para que o plano dê certo, na ordem CORRETA, são:" + 
					"\n" 
					+"a) Planejamento, organização, controle, direção.\n" + 
					"b) Planejamento, controle, organização, direção.\n" + 
					"c) Planejamento, organização, direção, controle.\n" + 
					"d) Organização, planejamento, controle, direção.");
			
		default:
			break;
		}
		
		
		//DESAFIO 4
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		boolean desafioConcuido = false;
		while(desafioConcuido){
	
			
			// NPC DO BEM
			// Npc ofcerece ajuda
			System.out.println("Ola, sou o primeiro NPC, gostaria da minha ajuda?");
			char simNaoNpc = scanner.next().charAt(0);
			
			// ** Condicao TRUE para o NPC **
			boolean opcaoDesafio = false;
			if ('s' == simNaoNpc) { // TODO trocar para switch case
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
							} else {
								// MORRE.
								// TODO Restante de vidas.
							}
						}
						// TODO Continue em outra estrutura
					
					}
				
				else {
					// MORRE.
					// TODO Restante de vidas.
				}
			} 
			
			
			// ** Condicao FALSE para o NPC **
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
					ImprimirMensagem("textoHistoria");
					
				}
			}
			
		}
	}
	// TODO Function que volta para o menu.
	public static void Menu(){
		System.out.println("Voce esta no meni=u");
	}
	// TODO Adicionar perguntas e criar uma selecao aleatoria que remove a pergunta que ja foi usada no momento do jogo
	
	public static void AdicionarPerguntas(int x) {
		ArrayList<String> desafios = new ArrayList<>();

		// DESAFIO 1
		desafios.add("No caminho para salvar sua família, você encontra seu amigo Marstar que é um mago da montanha, e você pergunta:"
				+ "\n-“O que está acontecendo Marstar? \""
				+ "\n-Ele responde: “A dimensão que separa estes dois mundos foi quebrada, é necessário restabelecer a ordem e expulsar "
				+ "\nLord Shenpor de volta para Ostarion, fechando a brecha dimensional deixada entre os dois mundos. "
				+ "\nLord Shenpor está com a Pedra Angular do equilíbrio, criada por anões magos antigos. Esta pedra controla as dimensões "
				+ "\nde toda a terra média.  Você é forte, ágil e os Deuses te  protejem Dotrebell.  "
				+ "\nEncontre a Pedra Angular e expulse Lord Shenpor e todas as bestas das trevas”."
				+ "\nVocê prontamente atende o chamado de Marstar e continua seu caminho. Na estrada você encontra um velho que te chama "
				+ "\npara ajudá-lo em sua organização secreta, para acabar com o domínio das trevas. Porém, de acordo com as aulas de administração, "
				+ "\nvocê sabe que as organizações servem a:\n");
		
		// DESAFIO 2 TRUE
		desafios.add("Você segue pela parte alta com o guerreiro. Assim que vocês cruzam a metade da parte alta, rumo ao encontro de Lord Shenpor que "
				+ "\nmantém a Pedra sob seus cuidados, vocês se deparam com uma infantaria inteira de orcs. E são logo avistados."
				+ "\nCombate-los sozinho, seria extremamente difícil, porém você conta com a ajuda do anão guerreiro. Vocês decidem combater de forma Eficaz, como o anão lhe diz:" 
				+ "\n-A qualidade é sempre mais importante.");
		
		// DESAFIO 2 FALSE
		desafios.add("Você segue pela parte alta com o guerreiro. Assim que vocês cruzam a metade da parte alta, rumo ao encontro de Lord Shenpor que "
				+ "\nmantém a Pedra sob seus cuidados, vocês se deparam com uma infantaria inteira de orcs. E são logo avistados."
				+ "\nCombate-los sozinho, seria extremamente difícil, porém você conta com a ajuda do anão guerreiro. "
				+ "\nVocês decidem combater de forma Eficaz, que significa:");
		
		// DESAFIO 3 TRUE
		desafios.add("Seguindo o caminho rumo ao Lord Shenpor, você encontra os guerreiros das forças especiais orc. Eles estão de plantão, "
				+ "\nmas pelo fato do ambiente estar seguro e calmo, estão um tanto quanto dispersos, vocês decidem atacar após fazer um planejamento, "
				+ "\ne executar o plano como um administrador o faria em uma Organização."
				+ "\n-O anão guerreiro diz: “-Precisamos planejar cuidadosamente, para que tenhamos controle no final.\""
				+ "\nOs passos para que o plano dê certo, na ordem CORRETA, são:");
		
		// DESAFIO 3 FALSE
		desafios.add("Seguindo o caminho rumo ao Lord Shenpor, você encontra os guerreiros das forças especiais orc. Eles estão de plantão, mas pelo fato "
				+ "\ndo ambiente estar seguro e calmo, estão um tanto quanto dispersos, vocês decidem atacar após fazer um planejamento, e executar o plano "
				+ "\ncomo um administrador o faria em uma Organização, os passos para que o plano dê certo, na ordem CORRETA, são:");
		
		// DESAFIO 4
		desafios.add("Após derrotar silenciosamente os guerreiros das forças especiais, você entra na fortaleza do reino, que obviamente, "
				+ "\nestá tomada pelas forças Orc. No saguão de entrada, os orcs abriram caminhos diferentes, para confundir os inimigos, como se fosse "
				+ "\num labirinto, mas você conhece a fortaleza, pois já esteve lá, só precisa se localizar. Só um caminho é o correto, \n"
				+ "que segundo fundamentos de administração é:");
		
		// DESAFIO 5
		desafios.add("Passando o caminho já conhecido, você entra em um salão oval, onde se concentra boa parte dos escribas, mordomos e conselheiros do rei. "
				+ "\nEm meio a escombros, você visualiza um anão em roupas limpas, de tecido fino, feito a mão com linhas de ouro. Olhando atentamente você "
				+ "\npercebe que é o antigo conselheiro e braço direito do rei Esmorg, seu nome é Ordant. Você pergunta:" + 
				"\n\n- Ordant, o que faz por aqui, você está bem?" + 
				"\n- Ele surpreso em te ver, pois você é conhecido no reino pelos serviços prestados ao rei em batalhas, responde: —Gomnor...? O que faz por aqui?\n" + 
				"\n- Estou procurando Lord Shenpor para tirar dele a Pedra Angular! Como você sobreviveu e ainda está aqui?\n" + 
				"\nEle responde: \n—Estive ajudando a tirar os empregados e feridos da fortaleza.\n" + 
				"\n- Onde está Lord Shenpor, preciso encontra-lo! Você diz.\n" + 
				"\n- Para encontrá-lo, vá pelo caminho já ensinado pelo clássico Frederick Taylor, pai da:");
		
		// DESAFIO 6
		desafios.add("Seguindo o caminho por dentro da fortaleza, você se depara com Dohor, o grande orc, executor das ordens diretas de Lord Shenpor. "
				+ "\nAo avistá-lo você sabe que é sinal de que Shenpor está por perto. Dohor já sabe da sua presença na fortaleza, por isso você o encontra, "
				+ "\nele estava indo em sua direção. Sem delongas, ele parte para o ataque, não dando tempo para pegá-lo de surpresa, você se esquiva dos golpes, "
				+ "\nmas ele é forte demais para um combate corpo a corpo. A única maneira de derrotá-lo é através de estratégia. Você então, aplicará as ideias de Frederick Taylor, "
				+ "\nque são as propostas de produção em massa (aplicadas por Henry Ford), dessa forma, você terá um combate eficaz, os princípios são:");
		
		// DESAFIO 7
		
		desafios.add("Derrotando Dohor, você sobe o topo a fortaleza, já sentindo os poderes das trevas, o que indica que Lord Shenpor lá está, e em posse da Pedra Angular."
				+ "\nComo esperado, avistando debaixo do topo você o vê, e ele de cima, olhando em sua direção, diz: —Muito me admira que um simples anão tenha chegado tão longe." 
				+ "\n— Você não tem ideia do que sou capaz de fazer, mesmo quando tinha apenas um semestre de experiência."
				+ "\n— Então veremos o quão bom tu és, anão.\n"
				+ "\nLord Shenpor se prepara para atacar, fazendo um ritual longo de bruxaria com a força da Pedra Angular. Um ritual longo e burocrático, que apesar de forte, não é bem "
				+ "\nconhecido por ele, por isso durante o processo, se encontram anomalias e demora. Você porém, conhece os processos burocráticos, e decide atacar com tudo que tem, "
				+ "\nutilizando sua força e toda sua habilidade, para um golpe definitivo, que não possui anomalias, pois sua burocracia, é exatamente como se deve ser, aquela que:");
				
		
		String retorno = desafios.get(x);
		
		System.out.println(retorno);
		
	}
	
	public static void ImprimirMensagem(String x) {

		String textoHistoria = "";
		
		String textoCreditos = "";
		
		if(x == "textoHistoria") {
			System.out.println(textoHistoria);
		} else if (x == "textoCreditos") {
			System.out.println(textoCreditos);
		}
		
	}
    
}