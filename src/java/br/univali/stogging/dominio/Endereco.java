package br.univali.stogging.dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rafael
 * @version 1.0
 */
@Entity
@SequenceGenerator(name = "seq_endereco", allocationSize = 1)
@XmlRootElement
public class Endereco implements Serializable {

    private String cidade;
    private String estado;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_endereco")
    private Long id;

    public Endereco() {

    }

    public Endereco(String cidade, String estado) {
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public String getCidade() {
        return cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
