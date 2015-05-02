package entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
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
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_usuario")
    private Long id;
    
    @Column (name = "Nombre", nullable = false, length = 40)
    private String Nombre;
    
    @Column (name = "Apellido1", nullable = false, length = 20)
    private String Apellido1;
    
    @Column (name = "Apellido2", nullable = false, length = 20)
    private String Apellido2;
    
    @Column (name = "NIF", nullable = false, length = 9)
    private String NIF;   
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date Fecha_Nacimiento;
    
    public enum SexoEnum
    {
        Hombre,
        Mujer
    }
    @Column (name = "Sexo", nullable = false, length = 6)
    @Enumerated(EnumType.STRING)
    private SexoEnum Sexo;
    
    @Column (name = "Correo", nullable = false, length = 30)
    private String Correo;
    
    @Column(name = "id_tutor")
    private Long tutor;
    
    //--------Relacion---------

    //-------------------------

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }


    public SexoEnum getSexo() {
        return Sexo;
    }    

    public void setSexo(SexoEnum Sexo) {
        this.Sexo = Sexo;
    }
    
    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido1() {
        return Apellido1;
    }

    public void setApellido1(String Apellido1) {
        this.Apellido1 = Apellido1;
    }

    public String getApellido2() {
        return Apellido2;
    }

    public void setApellido2(String Apellido2) {
        this.Apellido2 = Apellido2;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public Date getFecha_Nacimiento() {
        return Fecha_Nacimiento;
    }

    public void setFecha_Nacimiento(Date Fecha_Nacimiento) {
        this.Fecha_Nacimiento = Fecha_Nacimiento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    public Long getTutor() {
        return tutor;
    }

    public void setTutor(Long tutor) {
        this.tutor = tutor;
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
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Usuario[ id=" + id + " ]";
    }
    
}