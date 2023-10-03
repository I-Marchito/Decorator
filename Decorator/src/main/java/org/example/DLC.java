package org.example;

public class DLC extends JogoDecorator{
    public DLC(Jogo jogo) {
        super(jogo);
    }

    public float getValorConteudoExtra() {
        return 80.0f;
    }

    public String getInfoConteudoExtra() {
        return "DLC Palhaço de Gelo";
    }
}
