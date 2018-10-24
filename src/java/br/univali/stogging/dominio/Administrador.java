package br.univali.stogging.dominio;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author Rafael
 * @version 1.0
 */
@Entity
@XmlRootElement
public class Administrador extends Cliente {
    
    public enum Permissoes {
	MOD,
	ADMIN
    }
    
    @Enumerated(EnumType.STRING)
    private Permissoes permissoes;

    public Administrador() {

    }

    public Administrador(Permissoes permissoes) {
        this.permissoes = permissoes;
    } 

    public Permissoes getPermissoes() {
        return permissoes;
    }

    public void setPermissoes(Permissoes permissoes) {
        this.permissoes = permissoes;
    }
    
    
}
