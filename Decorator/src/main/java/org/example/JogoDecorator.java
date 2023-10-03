package org.example;


public abstract class JogoDecorator implements Jogo {

    private Jogo jogo;
    public String conteudo;

    public JogoDecorator(Jogo jogo) {
        this.jogo = jogo;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public abstract float getValorConteudoExtra();

    public float getPreco() {
        return this.jogo.getPreco() + (this.getValorConteudoExtra());
    }

    public abstract String getInfoConteudoExtra();

    public String getConteudo() {
        return this.jogo.getConteudo() + " + " + this.getInfoConteudoExtra();
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }
}