package Projeto;

import java.util.Scanner;

public class JogoDaForca {
    public static void main(String[] args) {

        int vidas = 7;
        String palavra = args[0];
        String resposta = "";
        boolean gameOver;

        Scanner s = new Scanner(System.in);

        while (vidas > 0) {
            gameOver = true;
            for (int i = 0; i < palavra.length(); i++) {
                char x = palavra.charAt(i);
                if (resposta.matches(".*" + x + ".*"))
                    System.out.print(x);
                else {
                    System.out.print("-");
                    gameOver = false;
                }
            }
            if (gameOver) {
                System.out.println("\nParabens você ganhou!");
                break;
            }

            System.out.println("\nVidas Restantes = " + vidas);
            System.out.println("Digite uma letra: ");
            String letra = s.next();

            if (!letra.matches("[a-z]|[A-Z]"))
                continue;

            if (resposta.matches(".*" + letra + ".*")) {
                System.out.println("Voce ja deu esse palpite, tente outra letra!");
                continue;
            }

            if (palavra.matches(".*" + letra + ".*")) {
                System.out.println("Acertou");
            } else {
                System.out.println("Errou");
                vidas--;
            }
            resposta += letra;

        }
        System.out.println("Game Over!");
    }
}
