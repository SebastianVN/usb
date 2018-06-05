/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.controlador.jpa;

import co.edu.usbbog.is.paciente.controlador.jpa.exceptions.NonexistentEntityException;
import co.edu.usbbog.is.paciente.controlador.jpa.exceptions.PreexistingEntityException;
import co.edu.usbbog.is.paciente.modelo.Pqr;
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
public class PqrJpaController implements Serializable {

    public PqrJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(Pqr pqr) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(pqr);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPqr(pqr.getCodigoPqr()) != null) {
                throw new PreexistingEntityException("Pqr " + pqr + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(Pqr pqr) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            pqr = em.merge(pqr);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = pqr.getCodigoPqr();
                if (findPqr(id) == null) {
                    throw new NonexistentEntityException("The pqr with id " + id + " no longer exists.");
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
            Pqr pqr;
            try {
                pqr = em.getReference(Pqr.class, id);
                pqr.getCodigoPqr();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The pqr with id " + id + " no longer exists.", enfe);
            }
            em.remove(pqr);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<Pqr> findPqrEntities() {
        return findPqrEntities(true, -1, -1);
    }

    public List<Pqr> findPqrEntities(int maxResults, int firstResult) {
        return findPqrEntities(false, maxResults, firstResult);
    }

    private List<Pqr> findPqrEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(Pqr.class));
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

    public Pqr findPqr(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(Pqr.class, id);
        } finally {
            em.close();
        }
    }

    public int getPqrCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<Pqr> rt = cq.from(Pqr.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
