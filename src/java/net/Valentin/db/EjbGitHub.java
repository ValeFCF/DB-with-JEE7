/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.Valentin.db;

import java.util.List;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;

/**
 *
 * @author Vale
 */

@Stateless
@LocalBean // se creara un local bean en enterprise bean
public class EjbGitHub {
    @Inject
    private EntityManager em;
    
    public void agrega(GitHub modelo){
        em.persist(modelo);
    }
    
    public List<GitHub> getInstancias(){
        //retornamos una consulta
        return em.createQuery("SELECT g FROM GitHub g ORDER BY g.name", GitHub.class).getResultList();
    }
}
