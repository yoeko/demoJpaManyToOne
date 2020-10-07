package presentation;

import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import metier.Formation;
import metier.Lieu;

public class Lanceur {

	public static void main(String[] args) {
		
//		Enregistrement en base
		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-manytoone");
//		EntityManager em = emf.createEntityManager();
//		
//		EntityTransaction tx = em.getTransaction();
//		tx.begin();
//		
//		Lieu lieu = new Lieu("Objis", "57 rue d'Amsterdam, 75008 Paris");
//		Formation formation = new Formation("JPA", new Date(), 3, lieu);
//		
//		em.persist(formation);
//		
//		tx.commit();
//		
//		em.close();
//		emf.close();
		
		
		
//		Récupération en base
		
//		Ouverture unité de travail
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("demojpa-manytoone");
		EntityManager em = emf.createEntityManager();
		
//		Récupération Formation et lieu
		Formation formation = em.getReference(Formation.class, 2L);
		Lieu lieu = formation.getLieu();
		
//		Affichage résultat
		System.out.println("La formation "+ formation.getTheme() + "va se dérouler à "+ lieu.getNom()+", "+lieu.getAdresse());
		
//		Fermeture unité de travail JPA
		em.close();
		emf.close();
		

	}

}
