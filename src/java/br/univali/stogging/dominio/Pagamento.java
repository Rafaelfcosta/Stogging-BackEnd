package br.univali.stogging.dominio;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@SequenceGenerator(name = "seq_pag", allocationSize = 1)
@XmlRootElement
public class Pagamento implements Serializable {

    private String bandeira;
    
    @Column(nullable = false)
    private String numCartao;
    
    @Column(nullable = false)
    @Temporal(TemporalType.DATE)
    private Date validadeCartao;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_pag")
    private Long id;

    public Pagamento() {

    }

    public Pagamento(String bandeira, String numCartao, Date validadeCartao) {
        this.bandeira = bandeira;
        this.numCartao = numCartao;
        this.validadeCartao = validadeCartao;
    }

    public boolean aprovarPagamento() {
        return false;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public String getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(String numCartao) {
        this.numCartao = numCartao;
    }

    public Date getVencimento() {
        return validadeCartao;
    }

    public void setVencimento(Date vencimento) {
        this.validadeCartao = vencimento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    
}
