import java.util.Random;
public class Npc extends Personagem {
    private int ataque;
    private int forca;
    private int vida;

    public Npc(String nome,int forca, int vida){
        super(nome);
        this.forca = 3;
        this.vida = 10;
    }
    public int ataqueNpc(){
        Random aleatorio = new Random();
        ataque = aleatorio.nextInt(3);
        return ataque;
    }

}
