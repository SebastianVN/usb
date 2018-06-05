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
    @NamedQuery(name = "Servicio.findAll", query = "SELECT s FROM Servicio s")
    , @NamedQuery(name = "Servicio.findByCodigoServcio", query = "SELECT s FROM Servicio s WHERE s.codigoServcio = :codigoServcio")
    , @NamedQuery(name = "Servicio.findByDuracionServ", query = "SELECT s FROM Servicio s WHERE s.duracionServ = :duracionServ")
    , @NamedQuery(name = "Servicio.findByHerramientas", query = "SELECT s FROM Servicio s WHERE s.herramientas = :herramientas")
    , @NamedQuery(name = "Servicio.findByHoraFin", query = "SELECT s FROM Servicio s WHERE s.horaFin = :horaFin")
    , @NamedQuery(name = "Servicio.findByHoraInicio", query = "SELECT s FROM Servicio s WHERE s.horaInicio = :horaInicio")
    , @NamedQuery(name = "Servicio.findByTipoServicio", query = "SELECT s FROM Servicio s WHERE s.tipoServicio = :tipoServicio")
    , @NamedQuery(name = "Servicio.findByCedula", query = "SELECT s FROM Servicio s WHERE s.cedula = :cedula")
    , @NamedQuery(name = "Servicio.findByCodigoEps", query = "SELECT s FROM Servicio s WHERE s.codigoEps = :codigoEps")})
public class Servicio implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_servcio", nullable = false)
    private Integer codigoServcio;
    @Column(name = "duracion_serv", length = 23)
    private String duracionServ;
    @Column(length = 100)
    private String herramientas;
    @Column(name = "hora_fin")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaFin;
    @Column(name = "hora_inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaInicio;
    @Column(name = "tipo_servicio", length = 100)
    private String tipoServicio;
    private Integer cedula;
    @Column(name = "codigo_eps")
    private Integer codigoEps;

    public Servicio() {
    }

    public Servicio(Integer codigoServcio) {
        this.codigoServcio = codigoServcio;
    }

    public Integer getCodigoServcio() {
        return codigoServcio;
    }

    public void setCodigoServcio(Integer codigoServcio) {
        this.codigoServcio = codigoServcio;
    }

    public String getDuracionServ() {
        return duracionServ;
    }

    public void setDuracionServ(String duracionServ) {
        this.duracionServ = duracionServ;
    }

    public String getHerramientas() {
        return herramientas;
    }

    public void setHerramientas(String herramientas) {
        this.herramientas = herramientas;
    }

    public Date getHoraFin() {
        return horaFin;
    }

    public void setHoraFin(Date horaFin) {
        this.horaFin = horaFin;
    }

    public Date getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(Date horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public Integer getCedula() {
        return cedula;
    }

    public void setCedula(Integer cedula) {
        this.cedula = cedula;
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
        hash += (codigoServcio != null ? codigoServcio.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Servicio)) {
            return false;
        }
        Servicio other = (Servicio) object;
        if ((this.codigoServcio == null && other.codigoServcio != null) || (this.codigoServcio != null && !this.codigoServcio.equals(other.codigoServcio))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.usbbog.is.paciente.modelo.Servicio[ codigoServcio=" + codigoServcio + " ]";
    }
    
}
