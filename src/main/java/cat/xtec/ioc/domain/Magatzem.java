/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cat.xtec.ioc.domain;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Ferran
 */
@Entity
@Table(name = "magatzems_db")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Magatzem.findAll", query = "SELECT m FROM magatzems_db m")
    , @NamedQuery(name = "Magatzem.findByCodi", query = "SELECT m FROM magatzems_db m WHERE m.codi = :codi")
    , @NamedQuery(name = "Magatzem.findByDenominacio", query = "SELECT m FROM magatzems_db m WHERE m.denominacio = :denominacio")
    , @NamedQuery(name = "Magatzem.findByActiu", query = "SELECT m FROM magatzems_db m WHERE m.actiu = :actiu")
    , @NamedQuery(name = "Magatzem.findByLocalitat", query = "SELECT m FROM magatzems_db m WHERE m.localitat = :localitat")})
public class Magatzem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "codi")
    private String codi;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "denominacio")
    private String denominacio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "actiu")
    private boolean actiu;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "localitat")
    private String localitat;

    public Magatzem() {
    }

    public Magatzem(String codi) {
        this.codi = codi;
    }

    public Magatzem(String codi, String denominacio, boolean actiu, String localitat) {
        this.codi = codi;
        this.denominacio = denominacio;
        this.actiu = actiu;
        this.localitat = localitat;
    }

    public String getCodi() {
        return codi;
    }

    public void setCodi(String codi) {
        this.codi = codi;
    }

    public String getDenominacio() {
        return denominacio;
    }

    public void setDenominacio(String denominacio) {
        this.denominacio = denominacio;
    }

    public boolean getActiu() {
        return actiu;
    }

    public void setActiu(boolean actiu) {
        this.actiu = actiu;
    }

    public String getLocalitat() {
        return localitat;
    }

    public void setLocalitat(String localitat) {
        this.localitat = localitat;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codi != null ? codi.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Magatzem)) {
            return false;
        }
        Magatzem other = (Magatzem) object;
        if ((this.codi == null && other.codi != null) || (this.codi != null && !this.codi.equals(other.codi))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "cat.xtec.ioc.domain.Magatzem[ codi=" + codi + " ]";
    }
    
}
