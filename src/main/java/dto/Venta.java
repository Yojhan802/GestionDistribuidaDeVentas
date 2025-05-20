/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import java.io.Serializable;
import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Size;
import jakarta.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author yojha
 */
@Entity
@Table(name = "venta")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Venta.findAll", query = "SELECT v FROM Venta v"),
    @NamedQuery(name = "Venta.findByCodiVent", query = "SELECT v FROM Venta v WHERE v.codiVent = :codiVent"),
    @NamedQuery(name = "Venta.findByFechVent", query = "SELECT v FROM Venta v WHERE v.fechVent = :fechVent")})
public class Venta implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "codiVent")
    private Integer codiVent;
    @Size(max = 45)
    @Column(name = "fechVent")
    private String fechVent;
    @JoinColumn(name = "codiClie", referencedColumnName = "codiClie")
    @ManyToOne(optional = false)
    private Cliente codiClie;

    public Venta() {
    }

    public Venta(Integer codiVent) {
        this.codiVent = codiVent;
    }

    public Integer getCodiVent() {
        return codiVent;
    }

    public void setCodiVent(Integer codiVent) {
        this.codiVent = codiVent;
    }

    public String getFechVent() {
        return fechVent;
    }

    public void setFechVent(String fechVent) {
        this.fechVent = fechVent;
    }

    public Cliente getCodiClie() {
        return codiClie;
    }

    public void setCodiClie(Cliente codiClie) {
        this.codiClie = codiClie;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codiVent != null ? codiVent.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Venta)) {
            return false;
        }
        Venta other = (Venta) object;
        if ((this.codiVent == null && other.codiVent != null) || (this.codiVent != null && !this.codiVent.equals(other.codiVent))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "dto.Venta[ codiVent=" + codiVent + " ]";
    }
    
}
