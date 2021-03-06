/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.univali.stogging.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Rafael
 */
@javax.ws.rs.ApplicationPath("api")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(br.univali.stogging.service.AdministradorFacadeREST.class);
        resources.add(br.univali.stogging.service.AnuncioFacadeREST.class);
        resources.add(br.univali.stogging.service.ClienteFacadeREST.class);
        resources.add(br.univali.stogging.service.CompraFacadeREST.class);
        resources.add(br.univali.stogging.service.CorsFilter.class);
        resources.add(br.univali.stogging.service.EnderecoFacadeREST.class);
        resources.add(br.univali.stogging.service.JogoFacadeREST.class);
        resources.add(br.univali.stogging.service.LoginFacadeREST.class);
        resources.add(br.univali.stogging.service.PagamentoFacadeREST.class);
        resources.add(br.univali.stogging.service.UsuarioFacadeREST.class);
    }
    
}
