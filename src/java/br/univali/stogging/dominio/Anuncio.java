package br.univali.stogging.dominio;

import java.util.Date;

/**
 * @author Rafael
 * @version 1.0
 */
public class Anuncio {

    private String chave;
    private Date criacao;
    private Usuario criador;
    private Jogo jogo;
    private Plataformas plataforma;
    private double preco;

    private enum Plataformas {
	STEAM,
	BATTLENET,
	ORIGIN,
	GOG
    }
    
    public Anuncio() {

    }

    public Anuncio(String chave, Date criacao, Usuario criador, Jogo jogo, Plataformas plataforma, double preco) {
        this.chave = chave;
        this.criacao = criacao;
        this.criador = criador;
        this.jogo = jogo;
        this.plataforma = plataforma;
        this.preco = preco;
    }
    
    

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public Date getCriacao() {
        return criacao;
    }

    public void setCriacao(Date criacao) {
        this.criacao = criacao;
    }

    public Usuario getCriador() {
        return criador;
    }

    public void setCriador(Usuario criador) {
        this.criador = criador;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }

    public Plataformas getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataformas plataforma) {
        this.plataforma = plataforma;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
    
}
