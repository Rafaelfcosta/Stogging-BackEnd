package stogging;

/**
 * @author Rafael
 * @version 1.0
 */
public class Endereco {

    private String cidade;
    private String estado;

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
}
