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
@Table(name = "punto_atencion", catalog = "odrivers", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PuntoAtencion.findAll", query = "SELECT p FROM PuntoAtencion p")
    , @NamedQuery(name = "PuntoAtencion.findByCodigoPuntoA", query = "SELECT p FROM PuntoAtencion p WHERE p.codigoPuntoA = :codigoPuntoA")
    , @NamedQuery(name = "PuntoAtencion.findByDireccion", query = "SELECT p FROM PuntoAtencion p WHERE p.direccion = :direccion")
    , @NamedQuery(name = "PuntoAtencion.findByNombrePunto", query = "SELECT p FROM PuntoAtencion p WHERE p.nombrePunto = :nombrePunto")
    , @NamedQuery(name = "PuntoAtencion.findByHoriario", query = "SELECT p FROM PuntoAtencion p WHERE p.horiario = :horiario")
    , @NamedQuery(name = "PuntoAtencion.findByCodigoEps", query = "SELECT p FROM PuntoAtencion p WHERE p.codigoEps = :codigoEps")})
public class PuntoAtencion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_punto_a", nullable = false)
    private Integer codigoPuntoA;
    @Column(length = 100)
    private String direccion;
    @Column(name = "nombre_punto", length = 50)
    private String nombrePunto;
    @Column(length = 100)
    private String horiario;
    @Column(name = "codigo_eps")
    private Integer codigoEps;

    public PuntoAtencion() {
    }

    public PuntoAtencion(Integer codigoPuntoA) {
        this.codigoPuntoA = codigoPuntoA;
    }

    public Integer getCodigoPuntoA() {
        return codigoPuntoA;
    }

    public void setCodigoPuntoA(Integer codigoPuntoA) {
        this.codigoPuntoA = codigoPuntoA;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNombrePunto() {
        return nombrePunto;
    }

    public void setNombrePunto(String nombrePunto) {
        this.nombrePunto = nombrePunto;
    }

    public String getHoriario() {
        return horiario;
    }

    public void setHoriario(String horiario) {
        this.horiario = horiario;
    }

    public Integer getCodigoEps() {
        return codigoEps;
    }

    public void setCodigoEps(Integer codigoEps) {
        this.codigoEps = codigoEps;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codigoPuntoA != null ? codigoPuntoA.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PuntoAtencion)) {
            return false;
        }
        PuntoAtencion other = (PuntoAtencion) object;
        if ((this.codigoPuntoA == null && other.codigoPuntoA != null) || (this.codigoPuntoA != null && !this.codigoPuntoA.equals(other.codigoPuntoA))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.usbbog.is.paciente.modelo.PuntoAtencion[ codigoPuntoA=" + codigoPuntoA + " ]";
    }
    
}
