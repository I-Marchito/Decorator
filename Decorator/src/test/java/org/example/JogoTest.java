package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class JogoTest {

    @Test
    void deveRetornarValorJogoBase() {
        Jogo jogo = new JogoBase(200.00f);

        assertEquals(200.00f, jogo.getPreco());
    }

    @Test
    void deveRetornarPrecoJogoComDLC() {
        Jogo jogo = new DLC(new JogoBase(200.0f));

        assertEquals(280.0f, jogo.getPreco());
    }

    @Test
    void deveRetornarPrecoJogoComSeasonPass() {
        Jogo jogo = new PasseDeTemporada(new JogoBase(200.0f));

        assertEquals(300.0f, jogo.getPreco());
    }

    @Test
    void deveRetornarPrecoJogoComSkinPack() {
        Jogo jogo = new PacoteCosmetico(new JogoBase(200.0f));

        assertEquals(210.0f, jogo.getPreco());
    }

    @Test
    void deveRetornarPrecoJogoComDLCMaisSeasonPass() {
        Jogo jogo = new PasseDeTemporada(new DLC(new JogoBase(200.0f)));

        assertEquals(380.0f, jogo.getPreco());
    }

    @Test
    void deveRetornarPrecoJogoComDLCMaisSkinPack() {
        Jogo jogo = new PacoteCosmetico(new DLC(new JogoBase(200.0f)));

        assertEquals(290.0f, jogo.getPreco());
    }

    @Test
    void deveRetornarPrecoJogoComSeasonPassMaisSkinPack() {
        Jogo jogo = new PacoteCosmetico(new PasseDeTemporada(new JogoBase(200.0f)));

        assertEquals(310.0f, jogo.getPreco());
    }

    @Test
    void deveRetornarPrecoJogoComDLCMaisSkinPackMaisSeasonPass() {
        Jogo jogo = new PacoteCosmetico(new PasseDeTemporada(new DLC(new JogoBase(200.0f))));

        assertEquals(390.0f, jogo.getPreco());
    }

    @Test
    void deveRetornarConteudoBase() {
        Jogo jogo = new JogoBase();

        assertEquals("Jogo Base", jogo.getConteudo());
    }

    @Test
    void deveRetornarJogoBaseMaisDLC() {
        Jogo jogo = new DLC(new JogoBase());

        assertEquals("Jogo Base + DLC Palhaço de Gelo", jogo.getConteudo());
    }

    @Test
    void deveRetornarJogoBaseMaisSeasonPass() {
        Jogo jogo = new PasseDeTemporada(new JogoBase());

        assertEquals("Jogo Base + Passe Temporada 1", jogo.getConteudo());
    }

    @Test
    void deveRetornarJogoBaseMaisSkinPack() {
        Jogo jogo = new PacoteCosmetico(new JogoBase());

        assertEquals("Jogo Base + Skin Pack XY", jogo.getConteudo());
    }

    @Test
    void deveRetornarJogoBaseMaisDLCMaisSeasonPass() {
        Jogo jogo = new PasseDeTemporada(new DLC (new JogoBase()));

        assertEquals("Jogo Base + DLC Palhaço de Gelo + Passe Temporada 1", jogo.getConteudo());
    }

    @Test
    void deveRetornarJogoBaseMaisDLCMaisSkinPack() {
        Jogo jogo = new PacoteCosmetico(new DLC (new JogoBase()));

        assertEquals("Jogo Base + DLC Palhaço de Gelo + Skin Pack XY", jogo.getConteudo());
    }

    @Test
    void deveRetornarJogoBaseMaisSeasonPassMaisSkinPack() {
        Jogo jogo = new PacoteCosmetico(new PasseDeTemporada (new JogoBase()));

        assertEquals("Jogo Base + Passe Temporada 1 + Skin Pack XY", jogo.getConteudo());
    }

    @Test
    void deveRetornarJogoBaseMaisDLCMaisSeasonPassMaisSkinPack() {
        Jogo jogo = new PacoteCosmetico (new PasseDeTemporada(new DLC (new JogoBase())));

        assertEquals("Jogo Base + DLC Palhaço de Gelo + Passe Temporada 1 + Skin Pack XY", jogo.getConteudo());
    }

}