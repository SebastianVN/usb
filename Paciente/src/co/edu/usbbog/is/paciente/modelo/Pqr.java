/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sebastian
 */
@Entity
@Table(catalog = "odrivers", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Pqr.findAll", query = "SELECT p FROM Pqr p")
    , @NamedQuery(name = "Pqr.findByCodigoPqr", query = "SELECT p FROM Pqr p WHERE p.codigoPqr = :codigoPqr")
    , @NamedQuery(name = "Pqr.findByAsunto", query = "SELECT p FROM Pqr p WHERE p.asunto = :asunto")
    , @NamedQuery(name = "Pqr.findByDescripcion", query = "SELECT p FROM Pqr p WHERE p.descripcion = :descripcion")
    , @NamedQuery(name = "Pqr.findByCedula", query = "SELECT p FROM Pqr p WHERE p.cedula = :cedula")})
public class Pqr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_pqr", nullable = false)
    private Integer codigoPqr;
    @Column(length = 100)
    private String asunto;
    @Column(length = 200)
    private String descripcion;
    private Integer cedula;

    public Pqr() {
    }

    public Pqr(Integer codigoPqr) {
        this.codigoPqr = codigoPqr;
    }

    public Integer getCodigoPqr() {
        return codigoPqr;
    }

    public void setCodigoPqr(Integer codigoPqr) {
        this.codigoPqr = codigoPqr;
    }

    public String getAsunto() {
        return asunto;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPqr != null ? codigoPqr.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Pqr)) {
            return false;
        }
        Pqr other = (Pqr) object;
        if ((this.codigoPqr == null && other.codigoPqr != null) || (this.codigoPqr != null && !this.codigoPqr.equals(other.codigoPqr))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.usbbog.is.paciente.modelo.Pqr[ codigoPqr=" + codigoPqr + " ]";
    }
    
}
