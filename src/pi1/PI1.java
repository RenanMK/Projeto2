package pi1;

import java.util.Random;
import java.util.Scanner;

public class PI1 {

    static Scanner leitor = new Scanner(System.in);

    public static void tabuleiro() {
        //Método para criação do desenho da forca.
        System.out.println("\n**** PROJETO INTEGRADOR ****");

        System.out.println("\n****JOGO DA FORCA ****");

        System.out.println("\n*****INTRUÇÕES:*****\n");
        System.out.println("Esse jogo é para ser jogado de uma pessoa. \n");
        System.out.println("Player escolherá um número, e uma palavra será escolhida.");
        System.out.println("Player terá 5 tentativas para acertar a palavra escolhida.\n");

        System.out.println("    -----¬                          ");
        System.out.println("    |   _|_                         ");
        System.out.println("    |    |                          ");
        System.out.println("    |                               ");
        System.out.println("    |                               ");
        System.out.println("    |                               ");
        System.out.println("    |                               ");
        System.out.println("    |                               ");
        System.out.println("    |                               ");
        System.out.println("____|_______________________________");

    }

    public static void bonecoErro(int tentativa) {
        //método para a construção do boneco da forca em caso de erro.
        if (tentativa == 1) {
            System.out.println("    -----¬                          ");
            System.out.println("    |   _|_                         ");
            System.out.println("    |    |                          ");
            System.out.println("    |    O                          ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("____|_______________________________");
            
        } else if (tentativa == 2) {
            System.out.println("    -----¬                          ");
            System.out.println("    |   _|_                         ");
            System.out.println("    |    |                          ");
            System.out.println("    |    O                          ");
            System.out.println("    |    |                          ");
            System.out.println("    |    |                          ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("____|_______________________________");
        } else if (tentativa == 3) {
            System.out.println("    -----¬                          ");
            System.out.println("    |   _|_                         ");
            System.out.println("    |    |                          ");
            System.out.println("    |    O                          ");
            System.out.println("    |    |\\                        ");
            System.out.println("    |    | \\                       ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("____|_______________________________");
        } else if (tentativa == 4) {
            System.out.println("    -----¬                          ");
            System.out.println("    |   _|_                         ");
            System.out.println("    |    |                          ");
            System.out.println("    |    O                          ");
            System.out.println("    |   /|\\                        ");
            System.out.println("    |  / | \\                       ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("    |                               ");
            System.out.println("____|_______________________________");
        } else if (tentativa == 5) {
            System.out.println("    -----¬                          ");
            System.out.println("    |   _|_                         ");
            System.out.println("    |    |                          ");
            System.out.println("    |    O                          ");
            System.out.println("    |   /|\\                        ");
            System.out.println("    |  / | \\                       ");
            System.out.println("    |     \\                        ");
            System.out.println("    |      \\                       ");
            System.out.println("    |                               ");
            System.out.println("____|_______________________________");
        } else if (tentativa == 6) {
            System.out.println("    -----¬                          ");
            System.out.println("    |   _|_                         ");
            System.out.println("    |    |                          ");
            System.out.println("    |    O                          ");
            System.out.println("    |   /|\\                        ");
            System.out.println("    |  / | \\                       ");
            System.out.println("    |   / \\                        ");
            System.out.println("    |  /   \\                       ");
            System.out.println("    |  -----                        ");
            System.out.println("____|__|_|_|________________________");
            System.out.println("VOCÊ PERDEU !!! T_T");
        }
        
    }

    public static String iniciarFrase() {
        //Método para captura da frase.
        Scanner leito = new Scanner(System.in);        
               
        String[] palavra = new String[10];
        palavra[0] = "banana";
        palavra[1] = "goiaba";
        palavra[2] = "lichia";
        palavra[3] = "outono";
        palavra[4] = "primavera";
        palavra[5] = "inverno";
        palavra[6] = "rosa";
        palavra[7] = "vermelho";
        palavra[8] = "verde";
        palavra[9] = "amarelo";        
        
        int i = 0;
        System.out.println("Escolha um número de 0 a 9:");
        i = leito.nextInt();
        String palavraescolhida = palavra[i];
        
        for(int j = 0;j<80;j++){
            System.out.println("");
        }
        
        System.out.println("Dica:");
        if(i == 1 || i == 0 || i == 2){
            System.out.println("Fruta ");
        }else if(i == 3 || i == 4 || i == 5){
            System.out.println("Estação do ano ");
        }else if(i == 6 || i == 7 || i == 8 || i == 9){
            System.out.println("Cor ");
        }
        
        return palavraescolhida;
    }
    
    public static void pulaLinha(){
        for(int i = 0;i<80;i++){
            System.out.println("");
        }
    }

    public static boolean compararLetra(String frase, String letra, char[] fraseBranco) {
        //Método de comparação da letra na frase em branco.
        boolean t = false;
        for (int i = 0; i < frase.length(); i++) {
            if (frase.contains(letra)) {
                //Acertou
                if (frase.charAt(i) == letra.charAt(0)) {
                    fraseBranco[i] = frase.charAt(i);
                }
                t = true;

            }
            if (!frase.contains(letra)) {                
                //Errou
                t = false;
            }
        }
        return t;
    }

    public static char[] fraseBranco(String frase) {
        //método para criação de uma frase em branco.
        char[] fraseBranco = new char[frase.length()];
        for (int i = 0; i < fraseBranco.length; i++) {
            fraseBranco[i] = '_';
        }
        return fraseBranco;
    }

    public static void main(String args[]) {
        //Método main.
        tabuleiro();

        String frase = iniciarFrase();
        
        char[] fraseBranco = fraseBranco(frase);
        
        for (int i = 0; i < fraseBranco.length; i++) {
            System.out.print(" " + fraseBranco[i]);
        }
        System.out.println();

        int tentativa = 0;

        while (tentativa <= 5) {
            System.out.println();
            String letra = leitor.next();
            letra = letra.toLowerCase();
            boolean t = compararLetra(frase, letra, fraseBranco);
            if (t) {
                for (int i = 0; i < fraseBranco.length; i++) {
                    System.out.print(" " + fraseBranco[i]);
                }
            } else {
                tentativa++;
                bonecoErro(tentativa); 
                System.out.println("");
                for (int i = 0; i < fraseBranco.length; i++) {
                    System.out.print(" ");
                    System.out.print("" + fraseBranco[i]);
                }
            }
            
            
            //Parada
            for (int i = 0; i < fraseBranco.length; i++) {
                if (String.copyValueOf(fraseBranco).equalsIgnoreCase(frase)) {
                    tentativa = 6;
                }
            }
           
            //Vitória
            System.out.println("");
            if (String.copyValueOf(fraseBranco).equalsIgnoreCase(frase)){
                System.out.println("");
                System.out.println("YOU WIN!");
            }
            
            
             //Apresenta frase
            if(tentativa == 6){
                System.out.println("");
                System.out.println("Frase do player 1: " + frase);    
            }
        }

    }

}

    
    



