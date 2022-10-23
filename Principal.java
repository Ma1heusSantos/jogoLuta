import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int continua = 1;
        int recorde = 0;

        while (continua == 1) {
            int pontos = 0;
            int i = 1;
            Personagem jogador = new Guerreiro("Teu", 10, 1000);

            while (jogador.verificaHp()) {
                Personagem monstro = new Npc("Serpente Serpentina", 20 * i, 10*i);
                Batalha batalha = new Batalha(jogador, monstro);

                System.out.println("====================");
                System.out.println("ROUND" + i);
                System.out.println("====================\n");

                pontos += batalha.combate();
                i++;
            }
            System.out.println("Usuario chegou a " + pontos + " pontos.");
            if (pontos > recorde) {
                recorde = pontos;
            }
            System.out.println("RECORDE ATUAL = " + recorde);
            System.out.println("Fim de jogo. Deseja continuar? (1) Sim (2) Nao");
            continua = leitor.nextInt();
        }

    }

}
