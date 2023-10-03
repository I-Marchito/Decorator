package org.example;

public class PasseDeTemporada extends JogoDecorator{
    public PasseDeTemporada(Jogo jogo) {
        super(jogo);
    }

    public float getValorConteudoExtra() {
        return 100.0f;
    }

    public String getInfoConteudoExtra() {
        return "Passe Temporada 1";
    }
}
