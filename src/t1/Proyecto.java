/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package t1;

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
        
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("ProyectoPU");
        EntityManager em = emf.createEntityManager();
        em.close();
        emf.close();
        
        
    }
    
}
