import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

public class TheAngularStone {
    public static char respostaJogador;
    public static Scanner scanner = new Scanner(System.in);
    public static Random rand = new Random();

    public static void main(String[] args) {
        Menu();
    }

    public static void Menu() {
        System.out.println("****Bem vindo ao jogo****"
                + "\n\nThe Angular Stone"
                + "\n\nMENU"
                + "\nNavegue pelo menu digitando o numero correspondente a opcao dejesada:"
                + "\n1 - Iniciar Historia"
                + "\n2 - Creditos"
                + "\n3 - Sair");

        int opcaoMenu = scanner.nextInt();

        switch (opcaoMenu) {
            case 1:
                IniciarJogo();
                break;
            case 2:
                CreditosDesenvolvimento();
                break;
            case 3:
                System.out.println("Ate a proxima.");
                break;
            default:
                System.out.println("Opcao Invalida, tente as teclas citadas acima.");
                break;
        }
    }

    public static void IniciarJogo() {
        // INTRODUCAO AO PERSONAGEM
        ImprimirMensagem(0); // Imprime a mensagem de index 0, que e referente a introducao do personagem.

        // Prólogo
        ImprimirMensagem(1); // Imprime a mensagem de index 1, que e referente ao prólogo que contextualiza a primeira decisao.

        char primeiraDecisao = scanner.next().charAt(0);
        primeiraDecisao = Character.toLowerCase(primeiraDecisao);

        switch (primeiraDecisao) {
            case 's': // Caso [s] o jogo se iniciara.
                IniciarHistoria();
                break;
            case 'n':  // Caso [n] devido ao contexto, o jogo apenas se encerrara.
                System.out.println("Toda a Terra Média foi destruída.");
                CreditosDesenvolvimento();
                break;
        }
    }

    public static void IniciarHistoria() {
        // INTRODUCAO PRINCIPAL
        ImprimirMensagem(2);

        // Cada while com um argumento tentativaDesafioX e responsavel por contabilizar as tentativas que o usuario tem para inserir seus palpites.
        int tentativasDesafio1 = 3;
        while(tentativasDesafio1 > 0) {

            // DESAFIO 1
            System.out.println("\nDESAFIO 1\n");
            AdicionarPerguntas(0);
            ArrayList<String> desafio1 = new ArrayList<String>();
            desafio1 = GeraAlternativas("Sociedade", "Nação", "Instituições", "Indivíduos");
            ImprimeAlternativas(desafio1);

            respostaJogador = scanner.next().charAt(0);
            /*
            Cada if(ValidaResposta "alternativa certa", 'palpite do usuario', ArrayList com todas as alternativas),
            caso retorno true prosseguirá os desafios, caso contrário será decrementado 1 na variável que contabiliza as tentativas.
            */
            if (ValidaResposta("Sociedade", respostaJogador, desafio1)) {
                // PRIMEIRO NPC APARECE
                ImprimirMensagem(3);
                char decisaoNPC = scanner.next().charAt(0);
                decisaoNPC = Character.toLowerCase(decisaoNPC);
                switch (decisaoNPC) {
                    case 's':
                        int tentativasDesafio2 = 3;

                        while(tentativasDesafio2 > 0) {

                            // DESAFIO 2 TRUE
                            System.out.println("\nDESAFIO 2\n");
                            AdicionarPerguntas(1);
                            ArrayList<String> desafio2 = new ArrayList<String>();
                            desafio2 = GeraAlternativas("Fazer certo as coisas, fator quantitativo.", "Se preocupar com os meios.", "Fazer a coisa certa, fator qualitativo.", "Se preocupar com os problemas.");
                            ImprimeAlternativas(desafio2);

                            respostaJogador = scanner.next().charAt(0);
                            respostaJogador = Character.toLowerCase(respostaJogador);
                            if (ValidaResposta("Fazer a coisa certa, fator qualitativo.", respostaJogador, desafio2)) {
                                // DECISAO DE PERMANENCIA DO NPC
                                ImprimirMensagem(4);
                                decisaoNPC = scanner.next().charAt(0);
                                decisaoNPC = Character.toLowerCase(decisaoNPC);
                                switch (decisaoNPC) {
                                    case 's':

                                        int tentativasDesafio3 = 3;

                                        while(tentativasDesafio3 > 0) {

                                            //DESAFIO 3 TRUE / DIREITO
                                            System.out.println("\nDESAFIO 3\n");
                                            AdicionarPerguntas(3);
                                            ArrayList<String> desafio3 = new ArrayList<String>();
                                            desafio3 = GeraAlternativas("Planejamento, organização, controle, direção.", "Planejamento, controle, organização, direção.", "Organização, planejamento, controle, direção.", "Planejamento, organização, direção, controle.");
                                            ImprimeAlternativas(desafio3);

                                            respostaJogador = scanner.next().charAt(0);
                                            respostaJogador = Character.toLowerCase(respostaJogador);
                                            if (ValidaResposta("Planejamento, organização, direção, controle.", respostaJogador, desafio3)) {
                                                System.out.println("NPC SAI");
                                                SegundaParteJogo(); // Chama a segunda parte do jogo que contem os proximos desafios.
                                            } else {
                                                tentativasDesafio3--;
                                                System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio3 + " tentativas.");
                                                TeclaPular();
                                            }
                                        }
                                        if (tentativasDesafio3 == 0) {
                                            System.out.println("Voce esgotou as tentativas!");
                                            Menu();
                                        }
                                        break;
                                    case 'n':

                                        // SAIDA DO NPC

                                        System.out.println("Dessa vez é necessário se despedir do anão, pois ele está muito debilitado. Mas\n" +
                                                "antes de ir, ele fala: “-Cuidado, nem todos são como eu!\"");
                                        int tentativasDesafio3False = 3;

                                        while(tentativasDesafio3False > 0) {

                                            // DESAFIO 3 FALSE ESQUERDO
                                            System.out.println("\nDESAFIO 3\n");
                                            AdicionarPerguntas(5);
                                            ArrayList<String> desafio3False = new ArrayList<String>();
                                            desafio3False = GeraAlternativas("Planejamento, organização, controle, direção.", "Planejamento, controle, organização, direção.", "Planejamento, organização, direção, controle.", "Organização, planejamento, controle, direção.");
                                            ImprimeAlternativas(desafio3False);

                                            respostaJogador = scanner.next().charAt(0);
                                            respostaJogador = Character.toLowerCase(respostaJogador);
                                            if (ValidaResposta("Planejamento, organização, direção, controle.", respostaJogador, desafio3False)) {
                                                SegundaParteJogo(); // Chama a segunda parte do jogo que contem os proximos desafios.
                                            } else {
                                                tentativasDesafio3False--;
                                                System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio3False + " tentativas.");
                                                TeclaPular();
                                            }
                                        }
                                        if (tentativasDesafio3False == 0) {
                                            System.out.println("Voce esgotou as tentativas!");
                                            Menu();
                                        }
                                        break;
                                    default:
                                        System.out.println("Opcao invalida. E somente aceito [n] para nao, e [s] para sim.");
                                        break;
                                }

                            } else {
                                tentativasDesafio2--;
                                System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio2 + " tentativas.");
                                TeclaPular();
                            }
                        }
                        if (tentativasDesafio2 == 0) {
                            System.out.println("Voce esgotou as tentativas!");
                            Menu();
                        }
                        break;
                    case 'n':
                        int tentativasDesafio2False = 3;

                        while(tentativasDesafio2False > 0) {

                            // DESAFIO 2 FALSE
                            System.out.println("\nDESAFIO 2\n");
                            AdicionarPerguntas(2);
                            ArrayList<String> desafio2False = new ArrayList<String>();
                            desafio2False = GeraAlternativas("Fazer certo as coisas, fator quantitativo.", "Fazer a coisa certa, fator qualitativo.", "Se preocupar com os problemas.", "Se preocupar com os meios.");
                            ImprimeAlternativas(desafio2False);

                            respostaJogador = scanner.next().charAt(0);
                            respostaJogador = Character.toLowerCase(respostaJogador);
                            if (ValidaResposta("Fazer a coisa certa, fator qualitativo.", respostaJogador, desafio2False)) {
                                int tentativasDesafio3False = 3;

                                while (tentativasDesafio3False > 0) {

                                    // DESAFIO 3 FALSE
                                    System.out.println("\nDESAFIO 3\n");
                                    AdicionarPerguntas(4);
                                    ArrayList<String> desafio3False = new ArrayList<String>();
                                    desafio3False = GeraAlternativas("Planejamento, organização, controle, direção.", "Planejamento, controle, organização, direção.", "Planejamento, organização, direção, controle.", "Organização, planejamento, controle, direção.");
                                    ImprimeAlternativas(desafio3False);

                                    respostaJogador = scanner.next().charAt(0);
                                    respostaJogador = Character.toLowerCase(respostaJogador);
                                    if (ValidaResposta("Planejamento, organização, direção, controle.", respostaJogador, desafio3False)) {
                                        SegundaParteJogo();
                                    } else {
                                        tentativasDesafio3False--;
                                        System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio3False + " tentativas.");
                                        TeclaPular();
                                    }
                                }
                            } else {
                                tentativasDesafio2False--;
                                System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio2False + " tentativas.");
                                TeclaPular();
                            }
                        }
                        if (tentativasDesafio2False == 0) {
                            System.out.println("Voce esgotou as tentativas!");
                            Menu();
                        }
                    default:
                        System.out.println("Opcao invalida. E somente aceito [n] para nao, e [s] para sim.");
                        break;
                }

            } else {
                tentativasDesafio1--;
                System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio1 + " tentativas.");
                TeclaPular();
            }
        }
        if (tentativasDesafio1 == 0) {
            System.out.println("Voce esgotou as tentativas!");
            Menu();
        }
    }

    public static void SegundaParteJogo() {
        int tentativasDesafio4 = 3;

        while(tentativasDesafio4 > 0) {

            // DESAFIO 4
            System.out.println("\nDESAFIO 4\n");
            AdicionarPerguntas(5);
            ArrayList<String> desafio4 = new ArrayList<String>();
            desafio4 = GeraAlternativas("O dos trabalhadores de primeira linha, que são os que coordenam o trabalho operacional.", "O dos trabalhadores de primeira linha, que são os que ocupam posição intermediária na hierarquia empresarial.", "O dos chefes e supervisores, que são os responsáveis pela administração global.", "O gerencial, que na hierarquia, supervisionam os trabalhadores em posição estratégica.");
            ImprimeAlternativas(desafio4);

            respostaJogador = scanner.next().charAt(0);
            respostaJogador = Character.toLowerCase(respostaJogador);
            if (ValidaResposta("O dos trabalhadores de primeira linha, que são os que coordenam o trabalho operacional.", respostaJogador, desafio4)) {

                int tentativasDesafio5 = 3;

                while(tentativasDesafio5 > 0) {
                    // DESAFIO 5
                    System.out.println("\nDESAFIO 5\n");
                    AdicionarPerguntas(6);
                    ArrayList<String> desafio5 = new ArrayList<String>();
                    desafio5 = GeraAlternativas("Administração Científica", "Teoria Clássica", "Teoria do Planejamento", "Princípios da ciência do trabalho");
                    ImprimeAlternativas(desafio5);

                    respostaJogador = scanner.next().charAt(0);
                    respostaJogador = Character.toLowerCase(respostaJogador);
                    if (ValidaResposta("Administração Científica", respostaJogador, desafio5)) {

                        // SEGUNDO NPC
                        ImprimirMensagem(5);


                        int tentativasDesafio6 = 3;

                        while(tentativasDesafio6 > 0) {
                            // DESAFIO 6
                            System.out.println("\nDESAFIO 6\n");
                            AdicionarPerguntas(7);
                            ArrayList<String> desafio6 = new ArrayList<String>();
                            desafio6 = GeraAlternativas("Intensificação, economicidade e eficiência.", "Controle, execução e hierarquia.", "Intensificação, economicidade e produtividade.", "Intensificação, just in time e produtividade.");
                            ImprimeAlternativas(desafio6);

                            respostaJogador = scanner.next().charAt(0);
                            respostaJogador = Character.toLowerCase(respostaJogador);
                            if (ValidaResposta("Intensificação, economicidade e produtividade.", respostaJogador, desafio6)) {
                                int tentativasDesafio7 = 3;

                                while(tentativasDesafio7 > 0) {

                                    // DESAFIO 7
                                    System.out.println("\nDESAFIO 7\n");
                                    AdicionarPerguntas(8);
                                    ArrayList<String> desafio7 = new ArrayList<String>();
                                    desafio7 = GeraAlternativas("Busca eficiência e eficácia como objetivo principal.", "Busca a eficácia através dos serviços sociais.", "Busca a eficiência no serviço público.", "Busca eficiência e eficácia como objetivo a mais dos serviços.");
                                    ImprimeAlternativas(desafio7);

                                    respostaJogador = scanner.next().charAt(0);
                                    respostaJogador = Character.toLowerCase(respostaJogador);
                                    if (ValidaResposta("Busca eficiência e eficácia como objetivo principal.", respostaJogador, desafio7) == true) {
                                        //ULTIMO DESAFIO, FIM DO JOGO!
                                        ImprimirMensagem(6);
                                    }
                                    else {
                                        tentativasDesafio7--;
                                        System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio7 + " tentativas.");
                                        TeclaPular();
                                    }
                                }
                                if (tentativasDesafio7 == 0) {
                                    System.out.println("Voce esgotou as tentativas!");
                                    Menu();
                                }

                            } else {
                                tentativasDesafio6--;
                                System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio6 + " tentativas.");
                                TeclaPular();
                            }
                        }
                        if (tentativasDesafio6 == 0) {
                            System.out.println("Voce esgotou as tentativas!");
                            Menu();
                        }
                    } else {
                        tentativasDesafio5--;
                        System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio5 + " tentativas.");
                        TeclaPular();
                    }
                }
                if (tentativasDesafio5 == 0) {
                    System.out.println("Voce esgotou as tentativas!");
                    Menu();
                }
            } else {
                tentativasDesafio4--;
                System.out.println("Voce errou sua resposta, voce possui: " + tentativasDesafio4 + " tentativas.");
                TeclaPular();
            }
        }
        if (tentativasDesafio4 == 0) {
            System.out.println("Voce esgotou as tentativas!");
            Menu();
        }
    }

    /*
     * Funcao AdicionarPerguntas
     *
     * Cada indice possui uma String que quando invocado passando um inteiro correspondente ao index, retorna o contexto de um desafio/pergunta.
     */

    public static void AdicionarPerguntas(int x) {
        ArrayList<String> desafios = new ArrayList<>();

        // DESAFIO 1
        desafios.add("\n\tNo caminho para salvar sua família, você encontra seu amigo Marstar que é um mago da montanha, e você pergunta:"
                + "\n\t-“O que está acontecendo Marstar? \""
                + "\n\t-Ele responde: “A dimensão que separa estes dois mundos foi quebrada, é necessário restabelecer a ordem e expulsar "
                + "\nLord Shenpor de volta para Ostarion, fechando a brecha dimensional deixada entre os dois mundos. "
                + "\nLord Shenpor está com a Pedra Angular do equilíbrio, criada por anões magos antigos. Esta pedra controla as dimensões "
                + "\nde toda a terra média.  Você é forte, ágil e os Deuses te  protejem Dotrebell.  "
                + "\nEncontre a Pedra Angular e expulse Lord Shenpor e todas as bestas das trevas”."
                + "\n\tVocê prontamente atende o chamado de Marstar e continua seu caminho. Na estrada você encontra um velho que te chama "
                + "\npara ajudá-lo em sua organização secreta, para acabar com o domínio das trevas. Porém, de acordo com as aulas de administração, "
                + "\nvocê sabe que as organizações servem a:\n");

        // DESAFIO 2 TRUE
        desafios.add("\n\tVocê segue pela parte alta com o guerreiro. Assim que vocês cruzam a metade da parte alta, rumo ao encontro de Lord Shenpor que "
                + "\nmantém a Pedra sob seus cuidados, vocês se deparam com uma infantaria inteira de orcs. E são logo avistados."
                + "\n\tCombate-los sozinho, seria extremamente difícil, porém você conta com a ajuda do anão guerreiro. Vocês decidem combater de forma Eficaz, "
                + "\ncomo o anão lhe diz:"
                + "\n-A qualidade é sempre mais importante.");

        // DESAFIO 2 FALSE
        desafios.add("\n\tVocê segue pela parte alta com o guerreiro. Assim que vocês cruzam a metade da parte alta, rumo ao encontro de Lord Shenpor que "
                + "\nmantém a Pedra sob seus cuidados, vocês se deparam com uma infantaria inteira de orcs. E são logo avistados."
                + "\n\tCombate-los sozinho, seria extremamente difícil, porém você conta com a ajuda do anão guerreiro. "
                + "\nVocês decidem combater de forma Eficaz, que significa:");

        // DESAFIO 3 TRUE
        desafios.add("\n\tSeguindo o caminho rumo ao Lord Shenpor, você encontra os guerreiros das forças especiais orc. Eles estão de plantão, "
                + "\nmas pelo fato do ambiente estar seguro e calmo, estão um tanto quanto dispersos, vocês decidem atacar após fazer um planejamento, "
                + "\ne executar o plano como um administrador o faria em uma Organização."
                + "\n-O anão guerreiro diz: “-Precisamos planejar cuidadosamente, para que tenhamos controle no final.\""
                + "\nOs passos para que o plano dê certo, na ordem CORRETA, são:");

        // DESAFIO 3 FALSE
        desafios.add("\n\tSeguindo o caminho rumo ao Lord Shenpor, você encontra os guerreiros das forças especiais orc. Eles estão de plantão, mas pelo fato "
                + "\ndo ambiente estar seguro e calmo, estão um tanto quanto dispersos, vocês decidem atacar após fazer um planejamento, e executar o plano "
                + "\ncomo um administrador o faria em uma Organização, os passos para que o plano dê certo, na ordem CORRETA, são:");

        // DESAFIO 4
        desafios.add("\n\tApós derrotar silenciosamente os guerreiros das forças especiais, você entra na fortaleza do reino, que obviamente, "
                + "\nestá tomada pelas forças Orc. No saguão de entrada, os orcs abriram caminhos diferentes, para confundir os inimigos, como se fosse "
                + "\num labirinto, mas você conhece a fortaleza, pois já esteve lá, só precisa se localizar. Só um caminho é o correto,"
                + "que segundo fundamentos de administração é:");

        // DESAFIO 5
        desafios.add("\n\tPassando o caminho já conhecido, você entra em um salão oval, onde se concentra boa parte dos escribas, mordomos e conselheiros do rei. "
                + "\nEm meio a escombros, você visualiza um anão em roupas limpas, de tecido fino, feito a mão com linhas de ouro. Olhando atentamente você "
                + "\npercebe que é o antigo conselheiro e braço direito do rei Esmorg, seu nome é Ordant. Você pergunta:" +
                "\n\n\t- Ordant, o que faz por aqui, você está bem?" +
                "\n\t- Ele surpreso em te ver, pois você é conhecido no reino pelos serviços prestados ao rei em batalhas, responde: —Gomnor...? O que faz por aqui?" +
                "\n\t- Estou procurando Lord Shenpor para tirar dele a Pedra Angular! Como você sobreviveu e ainda está aqui?" +
                "\n\tEle responde: \n—Estive ajudando a tirar os empregados e feridos da fortaleza." +
                "\n\t- Onde está Lord Shenpor, preciso encontra-lo! Você diz." +
                "\n\t- Para encontrá-lo, vá pelo caminho já ensinado pelo clássico Frederick Taylor, pai da:");

        // DESAFIO 6
        desafios.add("\n\tSeguindo o caminho por dentro da fortaleza, você se depara com Dohor, o grande orc, executor das ordens diretas de Lord Shenpor. "
                + "\nAo avistá-lo você sabe que é sinal de que Shenpor está por perto. Dohor já sabe da sua presença na fortaleza, por isso você o encontra, "
                + "\nele estava indo em sua direção. Sem delongas, ele parte para o ataque, não dando tempo para pegá-lo de surpresa, você se esquiva dos golpes, "
                + "\nmas ele é forte demais para um combate corpo a corpo. A única maneira de derrotá-lo é através de estratégia. Você então, aplicará as "
                + "\nideias de Frederick Taylor, que são as propostas de produção em massa (aplicadas por Henry Ford), dessa forma, você terá um combate eficaz, "
                + "\nos princípios são:");

        // DESAFIO 7

        desafios.add("\n\tDerrotando Dohor, você sobe o topo a fortaleza, já sentindo os poderes das trevas, o que indica que Lord Shenpor lá está, e em posse "
                + "\nda Pedra Angular."
                + "\n\tComo esperado, avistando debaixo do topo você o vê, e ele de cima, olhando em sua direção, diz: —Muito me admira que um simples anão tenha "
                + "\nchegado tão longe."
                + "\n\t— Você não tem ideia do que sou capaz de fazer, mesmo quando tinha apenas um semestre de experiência."
                + "\n\t— Então veremos o quão bom tu és, anão."
                + "\nLord Shenpor se prepara para atacar, fazendo um ritual longo de bruxaria com a força da Pedra Angular. Um ritual longo e burocrático, que "
                + "\napesar de forte, não é bem "
                + "\nconhecido por ele, por isso durante o processo, se encontram anomalias e demora. Você porém, conhece os processos burocráticos, e decide "
                + "\natacar com tudo que tem, "
                + "\nutilizando sua força e toda sua habilidade, para um golpe definitivo, que não possui anomalias, pois sua burocracia, é exatamente "
                + "\ncomo se deve ser, aquela que:");

        String retorno = desafios.get(x);

        System.out.println(retorno);

    }

    // Passando um index desejado da lista, retorna um contexto.
    public static void ImprimirMensagem(int x) {
        ArrayList<String> textosPadroes = new ArrayList<String>();

        // INTRODUÇÃO DO PERSONAGEM
        textosPadroes.add("\n\n **INTRODUCAO AO PERSONAGEM**"
                + "\n\tVocê é um anão que trabalha nas minas de ouro. Porém, você é treinado na arte da"
                + "\nGuerra pelo exército anão, e sempre foi conhecido pela destreza com o machado, combate"
                + "\ncorpo a corpo e inteligência no combate. Realmente um guerreiro diferenciado."
                + "\n\tVocê trabalha nas minas pois o exército já tirou muito tempo e paz da sua vida, que"
                + "\nvocê decide viver em paz ao lado de seus filhos.");

        // PRÓLOGO
        textosPadroes.add("\n\n **INTRODUCAO DA HISTORIA**"
                + "\n\tÉ uma bela e pacífica manhã quente de primavera, as crianças brincam nas ruas e"
                + "\nflorestas, a cidade está agitada. Os adultos estão trabalhando no comércio e você, como a"
                + "\ngrande maioria Anã, está trabalhando nas minas de ouro, que fica a cerca de 5km de Dastarian."
                + "\n\n\tEm sua pausa de trabalho das escavações, você percebe que o lindo e belo dia que"
                + "\nvinha se desenrolando, começa a ficar nublado, com densas formações de nuvens escuras, o"
                + "\ncalor da primavera se transforma em frio de outono, a terra treme e o cenário nos céus é de"
                + "\ntempestade e escuridão. Mais adiante, do topo das minas, você avista uma infantaria de"
                + "\nOrcs montados em bestas caninas, cruzando a floresta de Brendanon."
                + "\n\n\tVocê sente que deve agir para ajudar sua cidade, mas por outro lado pode esperar"
                + "\naté saber melhor o que se passa, e só então agir. O que decide fazer, agir prontamente ou nesperar?"
                + "\n\nDecida: "
                + "\n\nSim agirei, digite [s] para sim."
                + "\nNão agirei, digite [n] para nao");

        // INTRODUÇÃO PRINCIPAL
        textosPadroes.add("\n\n\tIntrodução: Você se chama Gomnor e vive no reino de Dastarian na terra média, onde"
                + "\nanões vivem em paz. Porém, depois de 200 anos sem guerra, o Lord Orc Shenpor foi solto"
                + "\npor um anão mago, e com ele, toda a magia negra do submundo de Ostarion, que é"
                + "\ndominado por Orcs e criaturas das trevas.");

        // PRIMEIRO NPC APARECENDO
        textosPadroes.add("\n\tContinuando sua viagem, ao fim da estrada, já quase no reino de Dastarian, você"
                + "\nencontra um anão guerreiro ferido no braço. Ele está encostado em uma árvore, você para"
                + "\nobter mais detalhes sobre o que está acontecendo. Ele te explica que você deve seguir pela"
                + "\nparte alta da cidade, através das docas, pois os orcs tomaram toda a parte baixa da cidade,"
                + "\ne a Pedra Angular está lá."
                + "\n\t-Vamos, eu te acompanharei. Diz o anão."
                + "\n\tVocê decide ouvir o conselho, mas não sabe se aceita a ajuda do anão. Você aceita?"
                + "\n\nDecida: "
                + "\n\nSim agirei, digite [s] para sim."
                + "\nNão agirei, digite [n] para nao");

        // DECISÃO DE PERMANÊNCIA DO NPC
        textosPadroes.add("\n\tVencendo a batalha, você sabe que o anão está ferido. Ele diz:"
                + "\n\t-Posso ficar para ajuda-lo mais em sua jornada."
                + "\n\tO que você decide fazer? Permanecer com a ajuda do anão ou dispensá-lo falando"
                + "\npara que ele vá se cuidar e ficar melhor?"
                + "\n\nSim, aceitar a ajuda, digite [s] para sim / Não, deixa-lo ir se recuperar, digite [n] para nao");
        // SEGUNDO NPC APARECENDO
        textosPadroes.add("\n\tO conselheiro anão tenta te enganar com uma pista falsa, mas seus conhecimentos "
                + "\nsão bons e você descobre a farsa, e assim, que ele é um traidor. Por isso, sem ouvir mais e com "
                + "\nsangue quente de anão, você o apunhala com a adaga no coração. E ao morrer lentamente você diz em seu ouvido:"
                + "\n\t—Anão traidor, recebe seu pagamento com a morte. Que os deuses lhe atormentem pela eternidade!");
        // FINAL
        textosPadroes.add("\n\tCom um golpe único e fatal, você derrota Lord Shenpor, recupera a Pedra Angular e imediatamente "
                + "\nexpulsa as bestas das trevas e orcs de volta para o submundo de Ostarion. Dastarian está agora livre das forças "
                + "\ndas trevas. A escuridão se dissipa e a luz volta à terra."
                + "\n\tSua missão está CUMPRIDA, grande guerreiro anão Gomnor!!!");

        String retorno = textosPadroes.get(x);

        System.out.println(retorno);
    }

    /*
     * Função GerarAlternativas
     *
     * Quando Invocada, requer 4 Strings como parâmetros.
     * A Funcão GerarAlternativas tem como papel, obter as 4 Strings que possui como conteúdo as alternativas da pergunta em questao,
     * Adicioná-las a uma ArrayList, e de forma aleatória fazer uma concatenação com um vetor que possui como conteúdo as letras para as
     * alternativas.
     * Por fim, retorna um ArrayList do tipo String.
     * */


    public static ArrayList<String> GeraAlternativas(String w, String x, String y, String z) {
        ArrayList<String> alternativas = new ArrayList<String>();
        alternativas.add(w);
        alternativas.add(x);
        alternativas.add(y);
        alternativas.add(z);

        String a = "", b = "", c = "", d = "";
        int indexAleatorio = 0, i = 0;
        String[] alternativasLetras = new String[] {"a) ", "b) ", "c) ", "d) "}; // array com letras para alternativas.
        String[] alternativasPreenchida = new String[4];
        while (i < 4) {
            indexAleatorio = rand.nextInt(alternativas.size()); // Criando aleatoriedade
            alternativasPreenchida[i] = alternativas.get(indexAleatorio); // Adicionando alternativa aleatoria a um vetor.
            alternativas.remove(indexAleatorio); // Removendo alternativa escolhida para evitar duplicidade.
            i++;
        }
        ArrayList<String> respostas = new ArrayList<String>();
        for (int j = 0; j < alternativasPreenchida.length; j++) {
            respostas.add(alternativasLetras[j] + alternativasPreenchida[j]); // Concatenando vetores, letras com alternativas. Ex:   "a) alternativa aleatoria"
        }

        return respostas;
    }


    /*
     * Função ValidaRespota
     *
     * Tem como papel receber como parâmetros, uma String com a respota certa da pergunta em questão, um char que contem o palpite fornecido
     * pelo usuário, e a ArrayList que contem todas as alternativas para fazer a comparação da respota certa com o palpite do usuário.
     * Por fim, retorna um boolean, true se o palpite do usuario for correto.
     * */

    public static boolean ValidaResposta(String repostaCerta, char repostaUsuario, ArrayList<String> alternativas){
        boolean resultado = false;
        switch (repostaUsuario) {
            case 'a':
                if (alternativas.get(0).equals("a) " + repostaCerta) || alternativas.get(1).equals("a) " + repostaCerta) || alternativas.get(2).equals("a) " + repostaCerta) || alternativas.get(3).equals("a) " + repostaCerta)) {
                    System.out.println("A reposta esta correta. \nVoce avancou para o proximo desafio!");
                    resultado = true;
                    TeclaPular();
                } else {
                    System.out.println("Resposta errada.");
                    resultado = false;
                }
                break;
            case 'b':
                if (alternativas.get(0).equals("b) " + repostaCerta) || alternativas.get(1).equals("b) " + repostaCerta) || alternativas.get(2).equals("b) " + repostaCerta) || alternativas.get(3).equals("b) " + repostaCerta)) {
                    System.out.println("A reposta esta correta. \nVoce avancou para o proximo desafio!");
                    resultado = true;
                    TeclaPular();
                } else {
                    System.out.println("Resposta errada.");
                    resultado = false;
                }
                break;
            case 'c':
                if (alternativas.get(0).equals("c) " + repostaCerta) || alternativas.get(1).equals("c) " + repostaCerta) || alternativas.get(2).equals("c) " + repostaCerta) || alternativas.get(3).equals("c) " + repostaCerta)) {
                    System.out.println("A reposta esta correta. \nVoce avancou para o proximo desafio!");
                    resultado = true;
                    TeclaPular();
                } else {
                    System.out.println("Resposta errada.");
                    resultado = false;
                }
                break;
            case 'd':
                if (alternativas.get(0).equals("d) " + repostaCerta) || alternativas.get(1).equals("d) " + repostaCerta) || alternativas.get(2).equals("d) " + repostaCerta) || alternativas.get(3).equals("d) " + repostaCerta)) {
                    System.out.println("A reposta esta correta. \nVoce avancou para o proximo desafio!");
                    resultado = true;
                    TeclaPular();
                } else {
                    System.out.println("Resposta errada.");
                    resultado = false;
                }
                break;
        }

        return resultado;
    }

    /*
     * Função ImprimeAlternativas
     *
     * Imprime a lista que for fornecida.
     * */

    public static void ImprimeAlternativas(ArrayList<String> listaAlternativas) {
        for (int i = 0; i < 4; i++) {
            System.out.println(listaAlternativas.get(i));
        }
    }

    public static void CreditosDesenvolvimento(){
        System.out.println("\nProjeto Integrador I: Desenvolvimento de Logica." +
                "\n\nThe Angular Stone" +
                "\n\nDesenvolvimento: " +
                "\nGustavo C. Z. Santos." +
                "\nVictor Hugo Pedrasani." +
                "\nGabriel de Souza.");
        System.out.println("Digite [1] para voltar ao menu.");
        boolean chamaMenu = false;
        while (chamaMenu == false) {

            char opcaoVoltarMenu = scanner.next().charAt(0);
            switch (opcaoVoltarMenu) {
                case '1': {
                    chamaMenu = true;
                    Menu();
                    break;
                }
                default:
                    System.out.println("Opcao invalida. Digite [1] para voltar ao menu.");
                    break;
            }
        }
    }

    public static void TeclaPular() {

        System.out.println("Digite [c] e em seguida pressione enter para continuar.");
        String teclaApertada = scanner.next();
    }
}
