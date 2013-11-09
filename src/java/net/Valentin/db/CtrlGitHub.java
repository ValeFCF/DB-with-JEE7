/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.Valentin.db;

import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

/**
 *
 * @author Vale
 */

@Named(value="ctrlGitHub")

@RequestScoped //imortamos de javax.enterprise
public class CtrlGitHub {
    
    @Inject //es como hacer un new class();
    private EjbGitHub ejb;
    
    private List<GitHub> instancias;
    
    private GitHub modelo=new GitHub(); //aqui no se pone inject por que causa conflicto con JEE7

    public GitHub getModelo() {
        return modelo;
    }
    
    public List<GitHub> getInstancias() {
        
        if(instancias == null){
            instancias = ejb.getInstancias();
        }
        
        return instancias;
    }
    
     public String agrega(){
        
        ejb.agrega(modelo);
       return "index?faces-redirect=true";
    }
    
}
