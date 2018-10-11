package br.univali.stogging.dominio;

import java.util.Date;
import java.util.List;

/**
 * @author Rafael
 * @version 1.0
 */
public class Jogo {

    private String descricao;
    private List<Generos> generos;
    private Date lancamento;
    private List<OS> os;
    private String titulo;
    private String url_capa;

    private enum Generos {
        ACAO,
        TIRO,
        AVENTURA,
        RPG,
        SIMULACAO,
        ESTRATEGIA,
        SOBREVIVENCIA,
        HORROR
    }
    
    public enum OS {
	WINDOWS,
	MAC,
	LINUX
    }

    public Jogo() {
        
    }

    public Jogo(String descricao, List<Generos> generos, Date lancamento, List<OS> os, String titulo, String url_capa) {
        this.descricao = descricao;
        this.generos = generos;
        this.lancamento = lancamento;
        this.os = os;
        this.titulo = titulo;
        this.url_capa = url_capa;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Generos> getGeneros() {
        return generos;
    }

    public void setGeneros(List<Generos> generos) {
        this.generos = generos;
    }

    public Date getLancamento() {
        return lancamento;
    }

    public void setLancamento(Date lancamento) {
        this.lancamento = lancamento;
    }

    public List<OS> getOs() {
        return os;
    }

    public void setOs(List<OS> os) {
        this.os = os;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUrl_capa() {
        return url_capa;
    }

    public void setUrl_capa(String url_capa) {
        this.url_capa = url_capa;
    }

}
