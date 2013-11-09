/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package net.Valentin.db;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Vale
 */

//new>other>persistence>entity class>"nombre de nuestra clase entidad"next>
//Data source: ligamos a la base donde se ejecutara y con eso ya tendremos todos los metodos

@Entity
public class GitHub implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    
    //agregamos más atributos
    private String name;
    private String mail;
    private String favoriteLanguage;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    //aplicamos getters and setters de los atributos agregados
    //click derecho>insert Code> getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getFavoriteLanguage() {
        return favoriteLanguage;
    }

    public void setFavoriteLanguage(String favoriteLanguage) {
        this.favoriteLanguage = favoriteLanguage;
    }
    
    
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GitHub)) {
            return false;
        }
        GitHub other = (GitHub) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "net.Valentin.db.GitHub[ id=" + id + " ]";
    }
    
}
