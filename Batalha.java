public class Batalha {
    private Personagem jogador;
    private Personagem monstro;
    private int i;

    public Batalha(Personagem jogador, Personagem monstro) {
        this.jogador = jogador;
        this.monstro = monstro;
    }

    public int combate() {

        while (jogador.verificaHp() && monstro.verificaHp()) {
            jogador.imprimeHp();
            monstro.imprimeHp();
            jogador.atacar(monstro);
            monstro.atacar(jogador);
        }
        if (jogador.verificaHp()) {
            jogador.recebeCura(5);
        }
        i++;
        if (jogador.verificaHp() == true) {
            return 1;
        } else {
            return 0;
        }

    }
}
