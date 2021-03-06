package br.univali.stogging.dominio;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.xml.bind.annotation.XmlRootElement;
/**
 *
 * @author Rafael
 */
@Entity
@SequenceGenerator(name = "seq_usuario", allocationSize = 1)
@XmlRootElement
@Inheritance(strategy = InheritanceType.JOINED)
@DiscriminatorColumn(name = "tipo_usuario")
public abstract class Usuario implements Serializable {

    @Column(nullable = false)
    private String email;
    
    @OneToOne(cascade = CascadeType.PERSIST)
    private Endereco endereco;

    @OneToOne(cascade = CascadeType.PERSIST)
    private Login login;
    
    private String nome;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_usuario")
    private Long id;

    
    public Usuario() {
    
    } 
    
    public Usuario(String email, Endereco endereco, Login login, String nome) {
        this.email = email;
        this.endereco = endereco;
        this.login = login;
        this.nome = nome;
    }
    
    public Login getLogin() {
        return login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

}
