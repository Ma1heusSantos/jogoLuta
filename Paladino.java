import java.util.Scanner;

public class Paladino extends Personagem {
    private int opc;
    private int forca;
    private int vida;

    public Paladino(String nome,int forca,int vida){
        super(nome);
        this.forca = forca;
        this.vida = vida;
    }

    public int ataqueUsuario(){
        Scanner dado = new Scanner(System.in);
        System.out.println("Qual Habilidade você deseja usar?");
        System.out.println("[1] - soco");
        System.out.println("[2] - Realizar cura");
        System.out.println("[3] - Divine Smite");
        opc = dado.nextInt();
        return opc;
    }

    public void imprimeHp(){
        System.out.println("====================");
        System.out.println("Nome: " + getNome());
        System.out.println("- HP Usuario: " + getVida());
        System.out.println("====================");
    }

    public int getForca() {
        return forca;
    }

    public void setForca(int forca) {
        this.forca = forca;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }
    
    
}
