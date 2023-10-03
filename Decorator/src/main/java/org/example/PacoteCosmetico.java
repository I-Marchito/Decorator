package org.example;

public class PacoteCosmetico extends JogoDecorator{
    public PacoteCosmetico(Jogo jogo) {
        super(jogo);
    }

    public float getValorConteudoExtra() {
        return 10.0f;
    }

    public String getInfoConteudoExtra() {
        return "Skin Pack XY";
    }
}
