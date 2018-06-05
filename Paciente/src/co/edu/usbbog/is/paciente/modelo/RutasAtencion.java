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
@Table(name = "rutas_atencion", catalog = "odrivers", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "RutasAtencion.findAll", query = "SELECT r FROM RutasAtencion r")
    , @NamedQuery(name = "RutasAtencion.findById", query = "SELECT r FROM RutasAtencion r WHERE r.id = :id")
    , @NamedQuery(name = "RutasAtencion.findByTelefono", query = "SELECT r FROM RutasAtencion r WHERE r.telefono = :telefono")
    , @NamedQuery(name = "RutasAtencion.findByEmail", query = "SELECT r FROM RutasAtencion r WHERE r.email = :email")
    , @NamedQuery(name = "RutasAtencion.findByPuntosInfo", query = "SELECT r FROM RutasAtencion r WHERE r.puntosInfo = :puntosInfo")
    , @NamedQuery(name = "RutasAtencion.findByCodigoEps", query = "SELECT r FROM RutasAtencion r WHERE r.codigoEps = :codigoEps")})
public class RutasAtencion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(nullable = false)
    private Integer id;
    private Integer telefono;
    @Column(length = 100)
    private String email;
    @Column(name = "puntos_info", length = 100)
    private String puntosInfo;
    @Column(name = "codigo_eps")
    private Integer codigoEps;

    public RutasAtencion() {
    }

    public RutasAtencion(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getTelefono() {
        return telefono;
    }

    public void setTelefono(Integer telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPuntosInfo() {
        return puntosInfo;
    }

    public void setPuntosInfo(String puntosInfo) {
        this.puntosInfo = puntosInfo;
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RutasAtencion)) {
            return false;
        }
        RutasAtencion other = (RutasAtencion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.usbbog.is.paciente.modelo.RutasAtencion[ id=" + id + " ]";
    }
    
}
