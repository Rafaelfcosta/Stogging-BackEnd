package stogging;

/**
 *
 * @author Rafael
 */
public class Usuario {

    private String email;
    private Endereco endereco;
    private Login login;
    private String nome;

    public Usuario() {
    
    } 
    
    public Usuario(String email, Endereco endereco, Login login, String nome) {
        this.email = email;
        this.endereco = endereco;
        this.login = login;
        this.nome = nome;
    }
    
    public void criarAnuncio() {

    }

    public void deletarAnuncio() {

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

}
