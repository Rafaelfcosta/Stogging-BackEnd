package br.univali.stogging.dominio;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 * @author Rafael
 * @version 1.0
 */
@Entity
@XmlRootElement
public class Cliente extends Usuario {

    @OneToMany(mappedBy = "cliente")
    private List<Anuncio> anuncios = new ArrayList<>();
    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras = new ArrayList<>();

    public Cliente() {

    }

    public Cliente(String email, Endereco endereco, Login login, String nome) {
        super(email, endereco, login, nome);
    }
    
    
    @XmlTransient
    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    @XmlTransient
    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
    
    public void comprar(Compra compra) {
        this.compras.add(compra);
    }
}
