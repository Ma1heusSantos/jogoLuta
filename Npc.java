import java.util.Random;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Npc extends Personagem {
    private int ataque;
    private int i;
    private String nome;

    public Npc(String nome, int forca, int vida) {
        super(nome, forca, vida);
    }

    public void imprimeHp() {
        System.out.println("====================");
        System.out.println("Nome: " + getNome());
        System.out.println("- HP Usuario: " + getVida());
        System.out.println("====================");
    }

    public int ataqueNpc() {
        Random aleatorio = new Random();
        ataque = aleatorio.nextInt(2);
        return ataque+1;
    }

    @Override
    public void atacar(Personagem alvo) {
        if (this.verificaHp()) {
            switch (ataqueNpc()) {
                case 1:
                    System.out.println("Usuario aplicou um soco.");
                    alvo.recebeDano(getForca()+ 7 + (int) (i / 10));
                    break;
                case 2:
                    System.out.println("Usuario aplicou um chute.");
                    alvo.recebeDano(getForca()+ 10 + (int) (i / 10));
                    break;
                case 3:
                    System.out.println("Usuario aplicou uma cabecada(lá ele...).");
                    alvo.recebeDano(getForca()+ 15 + (int) (i / 10));
                    break;
                default:
                    System.out.println("Opcao invalida");
                    break;
            }
        } else {
            System.out.println("Inimigo derrotado");
        }
        i++;
    }

}
