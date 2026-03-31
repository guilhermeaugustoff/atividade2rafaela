import java.util.Scanner;

public class Atividade2Rafaela {
    
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao;

        do {
        System.out.println("----- Menu -----");
        System.out.println("Digite o número da opção:");
        System.out.println("1. Atividade 1");
        System.out.println("2. Atividade 2");
        System.out.println("3. Atividade 3");
        System.out.println("4. Atividade 4");
        System.out.println("0. Sair");
        System.out.print("Escolha uma opção: ");
        opcao = entrada.nextInt();

            if(opcao == 1) {
            atividade1(entrada);
         } else if (opcao == 2) {
            atividade2(entrada);
         } else if (opcao == 3) {
            atividade3(entrada);
         } else if (opcao == 4) {
            atividade4(entrada);
         } else if (opcao == 0) {
                    System.out.println("Encerrando o programa");
            } else {
                
                    System.out.println("Opção inválida! Tente novamente.");
            }
        }

            while (opcao != 0);

        }
    
   

    public static void atividade1(Scanner entrada) {
        System.out.println("Executando Exercício 01...");
          
         System.out.println(" +\"\"\"\"\"+ ");
         System.out.println("[| o o |]");
         System.out.println(" |  ^  | ");
         System.out.println(" | '-' | ");
         System.out.println(" +-----+ ");
    }

    public static void atividade2(Scanner entrada) {
        System.out.println("Executando Exercício 02...");
        
        Scanner e = new Scanner(System.in);

    
    double x1 = Math.toRadians(25);

    double y1 = Math.toRadians(35);
    

    double x2 = Math.toRadians(35.5);
    
    double y2 = Math.toRadians(25.5);

    
    double r = 6371.01;

    double distancia = r * Math.acos(Math.sin(x1) * Math.sin(x2) + 
                       Math.cos(x1) * Math.cos(x2) * Math.cos(y1 - y2));

    System.out.println("A distância entre esses pontos é: " + distancia + " km");
    }

    public static void atividade3(Scanner entrada) {
        System.out.println("Executando Exercício 03...");
        
        Scanner e = new Scanner(System.in);
    
    System.out.println("Digite uma frase ou texto:");
    String texto = e.nextLine();

    int letras = 0;
    int espacos = 0;
    int numeros = 0;
    int outros = 0;

    for (char c : texto.toCharArray()) {
        if (Character.isLetter(c)) {
            letras++;
        } else if (Character.isDigit(c)) {
            numeros++;
        } else if (Character.isSpaceChar(c)) {
            espacos++;
        } else {
            outros++;
        }
    }

    System.out.println("Letras: " + letras);
    System.out.println("Espaços: " + espacos);
    System.out.println("Números: " + numeros);
    System.out.println("Outros: " + outros);
    }

    public static void atividade4(Scanner entrada) {
        System.out.println("Executando Exercício 04...");
        Scanner e = new Scanner(System.in);
    
        char resposta;
        int tentativas = 0;
        boolean acertou = false;

    do {

        tentativas++;

        System.out.println("No marketing digital, o que significa a sigla CTA (Call to Action)?.");

        System.out.println("A) Um tipo de anúncio pago em redes sociais");

        System.out.println("B) Uma ferramenta de análise de dados");

        System.out.println("C) Um convite para que o usuário realize uma ação específica");

        System.out.println("D) Um método de segmentação de público");

        System.out.println("E) Um indicador de desempenho financeiro");

        System.out.print("Sua resposta (tentativa " + tentativas + "/3): ");


        resposta = e.next().toLowerCase().charAt(0);


        switch (resposta) {

            case 'c':

                System.out.println("A resposta está correta!");
                acertou = true;

                break;

            default:

                if (tentativas < 3) {

                    System.out.println("A resposta está incorreta. Tente novamente!");

                } else {

                    System.out.println("A resposta está incorreta nas 3 tentativas. A resposta correta era a letra C.");

                }

                break;

        }

    } while (!acertou && tentativas < 3);

    }
}