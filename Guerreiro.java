import java.util.Scanner;
public class Guerreiro extends Personagem {
    private int opc;
    private int dano;

    public Guerreiro(String nome, int forca, int vida) {
        super(nome, forca, vida);

    }

    public int ataqueUsuario() {
        Scanner dado = new Scanner(System.in);
        System.out.println("Qual Habilidade você deseja usar?");
        System.out.println("[1] - soco");
        System.out.println("[2] - Esquiva Perfeita");
        System.out.println("[3] - Ragnarok");
        opc = dado.nextInt();
        return opc;
    }

    public void tipoAtaque() {
        if (this.verificaHp()) {
            switch (ataqueUsuario()) {
                case 1:
                    System.out.println("O Jogador aplicou um soco.");
                    dano = getForca()+ 10;
                    break;
                case 2:
                    System.out.println("O jogador realizou uma esquiva perfeita.");
                    break;
                case 3:
                    System.out.println("O Jogador aplicou o Ragnarok");
                    dano = (getForca() + 5);
                    recebeCura(5);
                    break;
            }
        } else {
            System.out.println("Inimigo derrotado");
        }
    }

}
