/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.modelo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Sebastian
 */
@Entity
@Table(catalog = "odrivers", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Itinerario.findAll", query = "SELECT i FROM Itinerario i")
    , @NamedQuery(name = "Itinerario.findByCodigoItinerario", query = "SELECT i FROM Itinerario i WHERE i.codigoItinerario = :codigoItinerario")
    , @NamedQuery(name = "Itinerario.findByProximaCita", query = "SELECT i FROM Itinerario i WHERE i.proximaCita = :proximaCita")
    , @NamedQuery(name = "Itinerario.findByTipoCita", query = "SELECT i FROM Itinerario i WHERE i.tipoCita = :tipoCita")
    , @NamedQuery(name = "Itinerario.findByFecha", query = "SELECT i FROM Itinerario i WHERE i.fecha = :fecha")
    , @NamedQuery(name = "Itinerario.findByCedula", query = "SELECT i FROM Itinerario i WHERE i.cedula = :cedula")})
public class Itinerario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_itinerario", nullable = false)
    private Integer codigoItinerario;
    @Column(name = "proxima_cita", length = 30)
    private String proximaCita;
    @Column(name = "tipo_cita", length = 50)
    private String tipoCita;
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    private Integer cedula;

    public Itinerario() {
    }

    public Itinerario(Integer codigoItinerario) {
        this.codigoItinerario = codigoItinerario;
    }

    public Integer getCodigoItinerario() {
        return codigoItinerario;
    }

    public void setCodigoItinerario(Integer codigoItinerario) {
        this.codigoItinerario = codigoItinerario;
    }

    public String getProximaCita() {
        return proximaCita;
    }

    public void setProximaCita(String proximaCita) {
        this.proximaCita = proximaCita;
    }

    public String getTipoCita() {
        return tipoCita;
    }

    public void setTipoCita(String tipoCita) {
        this.tipoCita = tipoCita;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        hash += (codigoItinerario != null ? codigoItinerario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Itinerario)) {
            return false;
        }
        Itinerario other = (Itinerario) object;
        if ((this.codigoItinerario == null && other.codigoItinerario != null) || (this.codigoItinerario != null && !this.codigoItinerario.equals(other.codigoItinerario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.usbbog.is.paciente.modelo.Itinerario[ codigoItinerario=" + codigoItinerario + " ]";
    }
    
}
