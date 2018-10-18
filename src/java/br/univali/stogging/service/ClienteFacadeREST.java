/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.stogging.service;

import br.univali.stogging.dominio.Cliente;
import br.univali.stogging.dominio.Endereco;
import br.univali.stogging.dominio.Login;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Rafael
 */
@Stateless
@Path("cliente")
public class ClienteFacadeREST extends AbstractFacade<Cliente> {

    @PersistenceContext(unitName = "Stogging-BackEndPU")
    private EntityManager em;

    public ClienteFacadeREST() {
        super(Cliente.class);
    }
    
    
    @GET()
    @Path("mock/{id}/login")
    public Response mock(@PathParam("id") Long id){
        //Cliente cliente = new Cliente("ze@mane.com", new Endereco("itajai", "sc"), new Login("123456", "zemane"), "ze mane");
        Cliente cliente = this.find(id);
        
        
        //cliente.comprar(new Compra("123", Calendar.getInstance().getTime(), new Anuncio("123", Calendar.getInstance().getTime(), this.find(40), new Jogo, cliente, 0), pagamento));
        //this.edit(cliente);
        //this.create(cliente);
        return Response.ok(cliente, MediaType.APPLICATION_JSON).build();
    }
    
    @GET()
    @Path("mock")
    public Response mockdata(){
        Cliente cliente = new Cliente("ze@mane.com", new Endereco("itajai", "sc"), new Login("123456", "zemane"), "ze mane");
        this.create(cliente);
        return Response.ok().build();
    }
    

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Cliente entity) {
        super.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Long id, Cliente entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Long id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Cliente find(@PathParam("id") Long id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cliente> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Cliente> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
