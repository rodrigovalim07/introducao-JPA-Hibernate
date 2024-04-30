package app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import dominio.Pessoa;

public class Programa {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
		EntityManager em = emf.createEntityManager();
		
		Pessoa p1 = new Pessoa(null, "Carlos da Silva", "carlos@gmail.com");
		Pessoa p2 = new Pessoa(null, "Joaquim Torres", "joaquim@gmail.com");
		Pessoa p3 = new Pessoa(null, "Ana Maria", "ana@gmail.com");
		
		em.getTransaction().begin();	// quando nao é só leitura/consulta, precisa de uma transação 
		em.persist(p1);	// criando uma tabela com os dados do objeto
		em.persist(p2);
		em.persist(p3);
		em.getTransaction().commit();
		System.out.println("Concluído.");
		
		Pessoa p = em.find(Pessoa.class, 3);	// procurar uma pessoa no banco de dados
		
		System.out.println(p);
		
		// precisa ser uma entidade monitorada para remoção (acabar de ter sido inserida ou recuperada pelo banco de dados)
		p = em.find(Pessoa.class, 2);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		System.out.println("Concluído.");
		emf.close();
		em.close();
	}
}
