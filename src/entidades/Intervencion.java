package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Michael
 */

@Entity
public class Intervencion implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_intervencion")
    private Long id;
    
    @Column (name = "Estado", nullable = false, length = 20 )
    private String Estado;
    
    @Column (name = "Sector" , length = 10)
    private String Sector;
    
    @Column (name = "Recurso_Aplicado" , length = 50)
    private String Recurso_aplicado;
     
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column (name = "Fecha_Inicio", nullable = false)
    private Date Fecha_inicio;
    
    @Temporal(javax.persistence.TemporalType.DATE)
    @Column (name = "Ultima_act", nullable = false)
    private Date Ultima_act;
    
    @Column (name = "Recurso_Adecuado", length = 50)
    private String Recurso_adecuado;
    

    //--------Relacion--------- 
    @ManyToOne
    @JoinColumn(name="id_profesional")
    private Profesional profesional;
    
    @ManyToOne
    @JoinColumn(name="id_expediente")
    private Expediente expediente;
    //--------Relacion---------


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Expediente getExpediente() {
        return expediente;
    }

    public void setExpediente(Expediente expediente) {
        this.expediente = expediente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    public void setProfesional(Profesional profesional) {
        this.profesional = profesional;
    }
    
    public String getEstado() {
        return Estado;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public String getSector() {
        return Sector;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    public Date getFecha_inicio() {
        return Fecha_inicio;
    }

    public void setFecha_inicio(Date Fecha_inicio) {
        this.Fecha_inicio = Fecha_inicio;
    }

    public Date getUltima_act() {
        return Ultima_act;
    }

    public void setUltima_act(Date Ultima_act) {
        this.Ultima_act = Ultima_act;
    }

    public String getRecurso_aplicado() {
        return Recurso_aplicado;
    }

    public void setRecurso_aplicado(String Recurso_aplicado) {
        this.Recurso_aplicado = Recurso_aplicado;
    }

    public String getRecurso_adecuado() {
        return Recurso_adecuado;
    }

    public void setRecurso_adecuado(String Recurso_adecuado) {
        this.Recurso_adecuado = Recurso_adecuado;
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
        if (!(object instanceof Intervencion)) {
            return false;
        }
        Intervencion other = (Intervencion) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Intervencion[ id=" + id + " ]";
    }
    
}
