package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
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
public class Expediente implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_expediente")
    private Long id;
    
    @Column(name = "Direccion1", nullable = false, length = 60)
    private String Direccion1;
    
    @Column(name = "Direccion2", length = 60)
    private String Direccion2;
    
    @Column(name = "Fecha_Apertura", nullable = false)
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Fecha_apertura;
    
    @Column(name = "Telefono", length = 11)
    private String Telf;
    
    @Column(name = "Num_Habitaciones")   
    private Integer Num_Habit;
    
    @Column(name = "Reg_Vivienda", length = 60)
    private String Reg_vivienda;
    
    @Column(name = "Cond_Habitaciones", length = 120)
    private String Cond_hab;
    
    @Column(name = "Equipamiento", length = 60)
    private String Equipamiento;
    
    @Column(name = "Observaciones", length = 120)
    private String Observaciones;
    
    //--------Relacion---------

    @OneToOne
    @JoinColumn(name="id_usuario")
    private Usuario usuario;

    //-------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
    
    public String getDireccion1() {
        return Direccion1;
    }

    public void setDireccion1(String Direccion1) {
        this.Direccion1 = Direccion1;
    }

    public String getDireccion2() {
        return Direccion2;
    }

    public void setDireccion2(String Direccion2) {
        this.Direccion2 = Direccion2;
    }

    public Date getFecha_apertura() {
        return Fecha_apertura;
    }

    public void setFecha_apertura(Date Fecha_apertura) {
        this.Fecha_apertura = Fecha_apertura;
    }

    public String getTelf() {
        return Telf;
    }

    public void setTelf(String Telf) {
        this.Telf = Telf;
    }
    
    public Integer getNum_Habit() {
        return Num_Habit;
    }

    public void setNum_Habit(Integer Num_Habit) {
        this.Num_Habit = Num_Habit;
    }

    public String getReg_vivienda() {
        return Reg_vivienda;
    }

    public void setReg_vivienda(String Reg_vivienda) {
        this.Reg_vivienda = Reg_vivienda;
    }

    public String getCond_hab() {
        return Cond_hab;
    }

    public void setCond_hab(String Cond_hab) {
        this.Cond_hab = Cond_hab;
    }

    public String getEquipamiento() {
        return Equipamiento;
    }

    public void setEquipamiento(String Equipamiento) {
        this.Equipamiento = Equipamiento;
    }

    public String getObservaciones() {
        return Observaciones;
    }

    public void setObservaciones(String Observaciones) {
        this.Observaciones = Observaciones;
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
        if (!(object instanceof Expediente)) {
            return false;
        }
        Expediente other = (Expediente) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Expediente[ id=" + id + " ]";
    }
    
}
