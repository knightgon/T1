/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

/**
 *
 * @author Michael
 */


@Entity
public class Profesional implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_profesional")
    private Long id;
    
    @Column (name = "Telefono", nullable = false, length = 11)
    private String Telefono;
    
    @Column (name = "Despacho", length = 5)
    private String Despacho;
    
    @Column (name = "Cargo", length = 40)
    private String Cargo;
    
    @Column (name = "Correo_Profesional", length = 30)
    private String Correo_Profes;
    
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

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDespacho() {
        return Despacho;
    }

    public void setDespacho(String Despacho) {
        this.Despacho = Despacho;
    }

    public String getCargo() {
        return Cargo;
    }

    public void setCargo(String Cargo) {
        this.Cargo = Cargo;
    }

    public String getCorreo_Profes() {
        return Correo_Profes;
    }

    public void setCorreo_Profes(String Correo_Profes) {
        this.Correo_Profes = Correo_Profes;
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
        if (!(object instanceof Profesional)) {
            return false;
        }
        Profesional other = (Profesional) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "proyecto1.Profesional[ id=" + id + " ]";
    }
    
}
