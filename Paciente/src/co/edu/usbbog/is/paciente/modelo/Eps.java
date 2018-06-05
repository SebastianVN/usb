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
    @NamedQuery(name = "Eps.findAll", query = "SELECT e FROM Eps e")
    , @NamedQuery(name = "Eps.findByCodigoEps", query = "SELECT e FROM Eps e WHERE e.codigoEps = :codigoEps")
    , @NamedQuery(name = "Eps.findByNombre", query = "SELECT e FROM Eps e WHERE e.nombre = :nombre")
    , @NamedQuery(name = "Eps.findByDescripcion", query = "SELECT e FROM Eps e WHERE e.descripcion = :descripcion")
    , @NamedQuery(name = "Eps.findByServicio", query = "SELECT e FROM Eps e WHERE e.servicio = :servicio")})
public class Eps implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_eps", nullable = false)
    private Integer codigoEps;
    @Column(length = 70)
    private String nombre;
    @Column(length = 200)
    private String descripcion;
    @Column(length = 50)
    private String servicio;

    public Eps() {
    }

    public Eps(Integer codigoEps) {
        this.codigoEps = codigoEps;
    }

    public Integer getCodigoEps() {
        return codigoEps;
    }

    public void setCodigoEps(Integer codigoEps) {
        this.codigoEps = codigoEps;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoEps != null ? codigoEps.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Eps)) {
            return false;
        }
        Eps other = (Eps) object;
        if ((this.codigoEps == null && other.codigoEps != null) || (this.codigoEps != null && !this.codigoEps.equals(other.codigoEps))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.usbbog.is.paciente.modelo.Eps[ codigoEps=" + codigoEps + " ]";
    }
    
}
