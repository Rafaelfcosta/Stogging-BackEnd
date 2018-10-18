package br.univali.stogging.dominio;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

/**
 * @author Rafael
 * @version 1.0
 */


public class Administrador extends Cliente {
    
    private enum Permissoes {
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
