package br.univali.stogging.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rafael
 * @version 1.0
 */
@Entity
@SequenceGenerator(name = "seq_anuncio", allocationSize = 1)
@NamedQuery(name = "anunciosByGameId", query = "SELECT a FROM Anuncio a WHERE a.jogo.id = :gameId")
@XmlRootElement
public class Anuncio implements Serializable {

    private String chave;
    
    @Temporal(TemporalType.TIMESTAMP)
    private Date criacao;
    
    @ManyToOne(cascade = CascadeType.PERSIST)
    private Usuario criador;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Jogo jogo;
    
    @Enumerated(EnumType.STRING)
    private Plataformas plataforma;
    
    private double preco;
    
    @Id
    @GeneratedValue(generator = "seq_anuncio", strategy = GenerationType.SEQUENCE)
    private Long id;
    @ManyToOne
    private Cliente cliente;

    public enum Plataformas {
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
