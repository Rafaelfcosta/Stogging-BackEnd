package br.univali.stogging.dominio;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Transient;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rafael
 * @version 1.0
 */
@Entity
@SequenceGenerator(name = "seq_login", allocationSize = 1)
@XmlRootElement
public class Login implements Serializable {

    @Transient
    private String senha;
    
    private String username;
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_login")
    private Long id;

    public Login() {

    }

    public Login(String senha, String username) {
        this.senha = senha;
        this.username = username;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
