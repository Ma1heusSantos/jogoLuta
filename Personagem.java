import java.util.Scanner;

public class Personagem {
    private String nome;
    private int forca;
    private int vida;
    private int vidaMax;

    public Personagem(String nome, int forca, int vida) {
        this.nome = nome;
        this.forca = forca;
        this.vida = vida;
        this.vidaMax = vida;
    }

    public int escollheClasse() {
        Scanner escolha = new Scanner(System.in);
        System.out.println("Com qual Classe você deseja jogar?");
        System.out.println("[1] - Paladino");
        System.out.println("[2] - Guerreiro");
        return escolha.nextInt();

    }

    public int ataqueUsuario() {
        Scanner dado = new Scanner(System.in);
        System.out.println("Qual Habilidade você deseja usar?");
        System.out.println("[1] - soco");
        System.out.println("[2] - Realizar cura");
        System.out.println("[3] - Divine Smite");
        return dado.nextInt();

    }
    public void atacar(Personagem alvo) {
        
    }

    public Boolean verificaHp() {
        if (this.vida > 0) {
            return true;
        } else {
            return false;
        }

    }

    public void recebeDano(int dano) {
        setVida(getVida() - dano);

    }

    public void recebeCura(int cura) {
        if (this.vida < this.vidaMax) {
            setVida(getVida() + cura);
        } else {
            this.vida = this.vidaMax;
        }

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
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

    public void imprimeHp() {
        System.out.println("====================");
        System.out.println("Nome: " + getNome());
        System.out.println("- HP Usuario: " + getVida());
        System.out.println("====================");
    }
}