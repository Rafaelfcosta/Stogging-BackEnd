package br.univali.stogging.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
@SequenceGenerator(name = "seq_compra", allocationSize = 1)
@XmlRootElement
public class Compra implements Serializable {

    private String chave;
    
    @Temporal(TemporalType.DATE)
    private Date data;
       
    @OneToOne(cascade = CascadeType.PERSIST)
    private Anuncio anuncio;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Pagamento pagamento;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_compra")
    private Long id;
    @ManyToOne
    private Cliente cliente;

    public Compra() {

    }

    public Compra(String chave, Date data, Anuncio anuncio, Pagamento pagamento) {
        this.chave = chave;
        this.data = data;
        this.anuncio = anuncio;
        this.pagamento = pagamento;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
}
