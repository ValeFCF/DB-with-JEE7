/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.Valentin.db;

import javax.enterprise.context.Dependent;
import javax.enterprise.inject.Produces;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vale
 */

@Dependent
public class Conexion {
    @Produces @PersistenceContext //Indica transacciones
    EntityManager em; 
    
}
