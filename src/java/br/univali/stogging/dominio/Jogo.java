package br.univali.stogging.dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rafael
 * @version 1.0
 */
@Entity
@SequenceGenerator(name = "seq_jogo", allocationSize = 1)
@XmlRootElement
public class Jogo implements Serializable {

    private String descricao;
    
    @Enumerated(EnumType.STRING)
    private List<Generos> generos = populargeneros();
    
    @Temporal(TemporalType.DATE)
    private Date lancamento;
    
    @Enumerated(EnumType.STRING)
    private List<OS> os = popularOS();
    
    private String titulo;
    
    private String url_capa;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_jogo")
    private Long id;

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
        this.titulo = titulo;
        this.descricao = descricao;
        this.generos = generos;
        this.lancamento = lancamento;
        this.os = os;
        this.url_capa = url_capa;
    }
    
    private List<Generos> populargeneros(){
        List<Generos> list = new ArrayList<Generos>();
        
        list.add(Generos.TIRO);
        list.add(Generos.ESTRATEGIA);
        
        return list;
    }
    
    private List<OS> popularOS(){
        List<OS> list = new ArrayList<OS>();
        
        list.add(OS.WINDOWS);
        list.add(OS.MAC);
        
        return list;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
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

    public String getUrl_capa() {
        return url_capa;
    }

    public void setUrl_capa(String url_capa) {
        this.url_capa = url_capa;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}