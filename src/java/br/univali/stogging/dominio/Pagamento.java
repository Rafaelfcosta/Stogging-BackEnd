package br.univali.stogging.dominio;

import java.util.Date;

/**
 * @author Rafael
 * @version 1.0
 */
public class Pagamento {

    private String bandeira;
    private int numCartao;
    private Date validadeCartao;

    public Pagamento() {

    }

    public Pagamento(String bandeira, int numCartao, Date validadeCartao) {
        this.bandeira = bandeira;
        this.numCartao = numCartao;
        this.validadeCartao = validadeCartao;
    }

    public boolean aprovarPagamento() {
        return false;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }

    public int getNumCartao() {
        return numCartao;
    }

    public void setNumCartao(int numCartao) {
        this.numCartao = numCartao;
    }

    public Date getVencimento() {
        return validadeCartao;
    }

    public void setVencimento(Date vencimento) {
        this.validadeCartao = vencimento;
    }
    
    
}
