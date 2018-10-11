package br.univali.stogging.dominio;

import java.util.Date;

/**
 * @author Rafael
 * @version 1.0
 */
public class Compra {

    private String chave;
    private Date data;
    private String vendedor;
    private Anuncio anuncio;
    private Pagamento pagamento;

    public Compra() {

    }

    public Compra(String chave, Date data, Anuncio anuncio, Pagamento pagamento) {
        this.chave = chave;
        this.data = data;
        this.vendedor = anuncio.getCriador().getLogin().getUsername();
        this.anuncio = anuncio;
        this.pagamento = pagamento;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getVendedor() {
        return vendedor;
    }

    public void setVendedor(String vendedor) {
        this.vendedor = vendedor;
    }

    public Anuncio getAnuncio() {
        return anuncio;
    }

    public void setAnuncio(Anuncio anuncio) {
        this.anuncio = anuncio;
    }

    public Pagamento getPagamento() {
        return pagamento;
    }

    public void setPagamento(Pagamento pagamento) {
        this.pagamento = pagamento;
    }
    
}
