package org.example;

public class JogoBase implements Jogo{

    public float preco;

    public JogoBase(){
    }

    public JogoBase(float preco){
        this.preco = preco;
    }

    @Override
    public float getPreco() {
        return preco;
    }

    @Override
    public String getConteudo() {
        return "Jogo Base";
    }
}
