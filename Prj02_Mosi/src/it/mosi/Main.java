package it.mosi;
import it.mosi.view.*;
import it.mosi.controller.UserController;
import it.mosi.persistenza.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;


public class Main {
	
    public static void main(String[] args) {
    	
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistenza");
        EntityManager em = emf.createEntityManager(); 

        User user = new User("Mosi", "5852"); // Aggiornare con i valori desiderati
        UserView userView = new UserView();
        UserController userController = new UserController(user, userView);
                
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();
        
        em.persist(user);
        transaction.commit();

        em.close();
        emf.close();
        
        
       user.getUsers();
       user.getPassword();
        
    }
}
