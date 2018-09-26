package stogging;

import sun.security.util.Password;

/**
 * @author Rafael
 * @version 1.0
 */
public class Login {

    private Password senha;
    private String username;

    public Login() {

    }

    public Login(Password senha, String username) {
        this.senha = senha;
        this.username = username;
    }

    public Password getSenha() {
        return senha;
    }

    public void setSenha(Password senha) {
        this.senha = senha;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
