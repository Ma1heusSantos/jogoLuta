import java.util.Scanner;
import java.util.Random;

public class teste {
  static int ataqueUsuario() {
    Scanner leitor = new Scanner(System.in);
    System.out.println("Escolha seu ataque");
    System.out.println("(1) - Soco");
    System.out.println("(2) - Especial");
    return leitor.nextInt();
  }

  static int ataqueComputador() {
    Random gerador = new Random();
    return gerador.nextInt(3) + 1;
  }

  static void imprimeHP(int hpUsuario, int hpComputador, int contagemEspeciais) {
    System.out.println("====================");
    System.out.println("- HP Usuario: " + hpUsuario);
    System.out.println("- HP Computador: " + hpComputador);
    System.out.println("* Contagem Especiais: " + contagemEspeciais);
    System.out.println("====================");
  }

  static int batalha() {
    Paladino paladino = new Paladino("Hyllao", 100, 1000);
    Npc npc = new Npc("Samirão", 1000, 2);
    int escolhaAtaque;
    int i = 1;

    while (npc.verificaHp()) {
      npc.setVida(10 + i);

      System.out.println("====================");
      System.out.println("ROUND" + i);
      System.out.println("====================\n");

      while (paladino.verificaHp() && npc.verificaHp()) {
        paladino.imprimeHp();
        npc.imprimeHp();
        escolhaAtaque = ataqueUsuario();
        //passar para a classe paladino;
        switch (escolhaAtaque) {
          case 1:
            System.out.println("Usuario aplicou um soco.");
            npc.setVida(npc.getVida() - 7);
            break;
          case 2:
            System.out.println("Usuario aplicou um ataque especial.");
            npc.setVida(npc.getVida() - 20);
            break;
          default:
            System.out.println("Opcao invalida");
            break;
        }
        if (npc.verificaHp()) {
          escolhaAtaque = ataqueComputador();
          //passar para a classe NPC
          switch (escolhaAtaque) {
            case 1:
              System.out.println("Computador aplicou um soco.");
              paladino.setVida(paladino.getVida() - 2+ (int) (i / 10));
              break;
            case 2:
              System.out.println("Computador aplicou um chute.");
              paladino.setVida(paladino.getVida()- 3 + (int) (i / 10));
              break;
            case 3:
              System.out.println("Computador aplicou um ataque especial.");
              paladino.setVida(paladino.getVida() - 4 + (int) (i / 20));
              break;
          }
        } else {
          System.out.println("Inimigo derrotado");
        }
      }
      if (paladino.verificaHp()) {
        paladino.recebeCura(5);
      }
      i++;
    }
    return i;
  }

  public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
    int continua = 1;
    int recorde = 0;
    while (continua == 1) {

      int pontos = batalha();
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
