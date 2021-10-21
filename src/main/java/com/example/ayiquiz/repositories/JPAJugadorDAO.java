package com.example.ayiquiz.repositories;

import com.example.ayiquiz.model.Jugador;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;


@Repository
public class JPAJugadorDAO implements JugadorDAO {

    private EntityManager entityManager = null;

    @PersistenceContext
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Transactional
    public void save(Jugador jugador) {
        this.entityManager.persist(jugador);
    }


    @Transactional
    @SuppressWarnings("unchecked")
    public List<Jugador> findAll() {
        return entityManager.createQuery(
                "select jugador " +
                        "from Jugador jugador " +
                        "order by jugador.id").
                getResultList();
    }

    @Transactional
    public Jugador findById(String jugadorID) {
        return entityManager.find(Jugador.class, jugadorID);
      /*  return entityManager.createQuery(
                "select jugador " +
                        "from Jugador jugador " +
                        "where jugador.id = :id"
        ).setParameter("id", jugadorID).getSingleResult();*/
    }

    @Transactional
    public void deleteById(String jugadorID) {
        Jugador deletedJugador = entityManager.find(Jugador.class, jugadorID);
        entityManager.remove(deletedJugador);
    }
}
