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
@Table(name = "historial_medico", catalog = "odrivers", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistorialMedico.findAll", query = "SELECT h FROM HistorialMedico h")
    , @NamedQuery(name = "HistorialMedico.findByCodigoHis", query = "SELECT h FROM HistorialMedico h WHERE h.codigoHis = :codigoHis")
    , @NamedQuery(name = "HistorialMedico.findByCondicionSalud", query = "SELECT h FROM HistorialMedico h WHERE h.condicionSalud = :condicionSalud")
    , @NamedQuery(name = "HistorialMedico.findByAlergias", query = "SELECT h FROM HistorialMedico h WHERE h.alergias = :alergias")
    , @NamedQuery(name = "HistorialMedico.findByCirugias", query = "SELECT h FROM HistorialMedico h WHERE h.cirugias = :cirugias")
    , @NamedQuery(name = "HistorialMedico.findByRh", query = "SELECT h FROM HistorialMedico h WHERE h.rh = :rh")
    , @NamedQuery(name = "HistorialMedico.findByCedula", query = "SELECT h FROM HistorialMedico h WHERE h.cedula = :cedula")})
public class HistorialMedico implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "codigo_his", nullable = false)
    private Integer codigoHis;
    @Column(name = "condicion_salud", length = 240)
    private String condicionSalud;
    @Column(length = 50)
    private String alergias;
    @Column(length = 50)
    private String cirugias;
    @Column(length = 3)
    private String rh;
    private Integer cedula;

    public HistorialMedico() {
    }

    public HistorialMedico(Integer codigoHis) {
        this.codigoHis = codigoHis;
    }

    public Integer getCodigoHis() {
        return codigoHis;
    }

    public void setCodigoHis(Integer codigoHis) {
        this.codigoHis = codigoHis;
    }

    public String getCondicionSalud() {
        return condicionSalud;
    }

    public void setCondicionSalud(String condicionSalud) {
        this.condicionSalud = condicionSalud;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getCirugias() {
        return cirugias;
    }

    public void setCirugias(String cirugias) {
        this.cirugias = cirugias;
    }

    public String getRh() {
        return rh;
    }

    public void setRh(String rh) {
        this.rh = rh;
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
        hash += (codigoHis != null ? codigoHis.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof HistorialMedico)) {
            return false;
        }
        HistorialMedico other = (HistorialMedico) object;
        if ((this.codigoHis == null && other.codigoHis != null) || (this.codigoHis != null && !this.codigoHis.equals(other.codigoHis))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "co.edu.usbbog.is.paciente.modelo.HistorialMedico[ codigoHis=" + codigoHis + " ]";
    }
    
}
