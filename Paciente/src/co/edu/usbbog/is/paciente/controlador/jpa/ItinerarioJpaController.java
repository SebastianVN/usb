/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.controlador.jpa;

import co.edu.usbbog.is.paciente.controlador.jpa.exceptions.NonexistentEntityException;
import co.edu.usbbog.is.paciente.controlador.jpa.exceptions.PreexistingEntityException;
import co.edu.usbbog.is.paciente.modelo.Itinerario;
import java.io.Serializable;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.EntityNotFoundException;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

/**
 *
 * @author Sebastian
 */
public class ItinerarioJpaController implements Serializable {

    public ItinerarioJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Itinerario itinerario) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(itinerario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findItinerario(itinerario.getCodigoItinerario()) != null) {
                throw new PreexistingEntityException("Itinerario " + itinerario + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Itinerario itinerario) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            itinerario = em.merge(itinerario);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = itinerario.getCodigoItinerario();
                if (findItinerario(id) == null) {
                    throw new NonexistentEntityException("The itinerario with id " + id + " no longer exists.");
                }
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void destroy(Integer id) throws NonexistentEntityException {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            Itinerario itinerario;
            try {
                itinerario = em.getReference(Itinerario.class, id);
                itinerario.getCodigoItinerario();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The itinerario with id " + id + " no longer exists.", enfe);
            }
            em.remove(itinerario);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Itinerario> findItinerarioEntities() {
        return findItinerarioEntities(true, -1, -1);
    }

    public List<Itinerario> findItinerarioEntities(int maxResults, int firstResult) {
        return findItinerarioEntities(false, maxResults, firstResult);
    }

    private List<Itinerario> findItinerarioEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Itinerario.class));
            Query q = em.createQuery(cq);
            if (!all) {
                q.setMaxResults(maxResults);
                q.setFirstResult(firstResult);
            }
            return q.getResultList();
        } finally {
            em.close();
        }
    }

    public Itinerario findItinerario(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Itinerario.class, id);
        } finally {
            em.close();
        }
    }

    public int getItinerarioCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Itinerario> rt = cq.from(Itinerario.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
