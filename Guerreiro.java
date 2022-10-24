import java.util.Scanner;
import java.util.Random;

public class Guerreiro extends Personagem {

    public Guerreiro(String nome, int forca, int vida) {
        super(nome, forca, vida);

    }

    @Override
    public int ataqueUsuario() {
        Scanner dado = new Scanner(System.in);
        System.out.println("Qual Habilidade você deseja usar?");
        System.out.println("[1] - soco");
        System.out.println("[2] - Martelo de Thor");
        System.out.println("[3] - Ragnarok");
        return dado.nextInt();
    }

    @Override
    public void atacar(Personagem alvo) {
        if (this.verificaHp()) {
            switch (ataqueUsuario()) {
                case 1:
                    System.out.println("O Jogador aplicou um soco.");
                    alvo.recebeDano(getForca() + 10);
                    break;
                case 2:
                    System.out.println("O Jogador usou o Martelo de Thor!");
                    Random martelo = new Random();
                    int ataque = martelo.nextInt(3);
                    alvo.recebeDano(getForca() + ataque);
                    break;
                case 3:
                    System.out.println("O Jogador aplicou o Ragnarok");
                    alvo.recebeDano(getForca() + 5);
                    recebeCura(5);
                    break;
            }
        } else {
            System.out.println("Inimigo derrotado");
        }
    }

}
