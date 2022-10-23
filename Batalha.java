public class Batalha {
    private Paladino jogador;
    private Npc monstro;
    private int i;

    public Batalha(Paladino jogador, Npc mostro) {
        jogador = new Paladino("Teu", 10, 1000);
        monstro = new Npc("Serpente Serpentina", 20, 20);
    }

    public int combate(){
        while (monstro.verificaHp()) {
            monstro.setVida(10 + i);

            System.out.println("====================");
            System.out.println("ROUND" + i);
            System.out.println("====================\n");

            while (jogador.verificaHp() && monstro.verificaHp()) {
                jogador.imprimeHp();
                monstro.imprimeHp();
                jogador.ataqueUsuario();
                jogador.tipoAtaque();
                monstro.ataqueNpc();
                monstro.tipoAtaque();
            }
            if (jogador.verificaHp()) {
                jogador.recebeCura(5);
            }
            i++;
        }
        return i;

    }
}




