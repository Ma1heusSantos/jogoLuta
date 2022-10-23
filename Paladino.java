import java.util.Scanner;
import java.util.Random;

public class Paladino extends Personagem {
    private int opc;
    private int i;
    private int dano;

    public Paladino(String nome, int forca, int vida) {
        super(nome, forca, vida);

    }

    @Override
    public int ataqueUsuario() {
        Scanner dado = new Scanner(System.in);
        System.out.println("Qual Habilidade você deseja usar?");
        System.out.println("[1] - soco");
        System.out.println("[2] - Realizar cura");
        System.out.println("[3] - Divine Smite");
        opc = dado.nextInt();
        return opc;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (this.verificaHp()) {
            switch (ataqueUsuario()) {
                case 1:
                    System.out.println("O Jogador aplicou um soco.");
                    alvo.recebeDano(getForca());
                    break;
                case 2:
                    System.out.println("O jogador realizou uma cura.");
                    this.recebeCura(10);
                    System.out.println("O jogador recebeu 10 de cura, sua vida agora é: "+this.getVida());
                    break;
                case 3:
                    System.out.println("O Jogador aplicou o Divine Smite, O mal sucumbirá ante a minha presença!");
                    Random smite = new Random();
                    int ataque = smite.nextInt(12);
                    alvo.recebeDano(getForca() + ataque);
                    break;
            }
        } else {
            System.out.println("Inimigo derrotado");
        }
    }

}
