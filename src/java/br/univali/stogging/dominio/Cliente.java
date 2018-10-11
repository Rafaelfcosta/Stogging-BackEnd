package br.univali.stogging.dominio;

import java.util.List;

/**
 * @author Rafael
 * @version 1.0
 */
public class Cliente extends Usuario {

    private List<Anuncio> anuncios;
    private List<Compra> compras;

    public Cliente() {

    }

    public List<Anuncio> getAnuncios() {
        return anuncios;
    }

    public void setAnuncios(List<Anuncio> anuncios) {
        this.anuncios = anuncios;
    }

    public List<Compra> getCompras() {
        return compras;
    }

    public void setCompras(List<Compra> compras) {
        this.compras = compras;
    }
    
    public void comprar(Compra compra) {
        this.compras.add(compra);
    }
}
