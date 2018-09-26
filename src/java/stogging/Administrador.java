package stogging;

/**
 * @author Rafael
 * @version 1.0
 */
public class Administrador extends Cliente {
    
    private enum Permissoes {
	MOD,
	ADMIN
    }
    
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
