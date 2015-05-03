/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t1;

//import entidades.Profesional;
//import entidades.Usuario;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Toshiba
 */
public class Proyecto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic 
        
        /*
        Usuario u = new Usuario();
        u.setNombre("Ana");
        u.setApellido1("Fhena");
        u.setApellido2("Taint");
        u.setNIF("X99123745");
        u.setClave("22222225");
        u.setCorreo("afhena@gmail.com");
        u.setSexo(Usuario.SexoEnum.Mujer);
        u.setFecha_Nacimiento(null);
        u.setTutor(null);
        
        
        Profesional u = new Profesional();
        u.setTelefono("651 676 542");
        u.setCargo("Atencion Citas");
        u.setCorreo_Profes("michaelpro@x.org");
        u.setDespacho("B021");
        u.setUsuario(null);
        
        

        Proyecto proyecto = new Proyecto();
        proyecto.persist(u);
        */
        
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoPU");
        EntityManager em = emf.createEntityManager();
        em.close();
        emf.close();
                
        
        
    }
    /*
    public void persist(Object object) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoPU");
        EntityManager em = emf.createEntityManager();
        em.getTransaction().begin();
        try {
            em.persist(object);
            em.getTransaction().commit();
            } catch (Exception e) {
                e.printStackTrace();
                em.getTransaction().rollback();
            } finally {
        em.close();
        }
    
    }*/
    
}
