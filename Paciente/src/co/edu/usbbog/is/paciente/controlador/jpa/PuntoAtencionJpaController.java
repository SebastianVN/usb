/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.controlador.jpa;

import co.edu.usbbog.is.paciente.controlador.jpa.exceptions.NonexistentEntityException;
import co.edu.usbbog.is.paciente.controlador.jpa.exceptions.PreexistingEntityException;
import co.edu.usbbog.is.paciente.modelo.PuntoAtencion;
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
public class PuntoAtencionJpaController implements Serializable {

    public PuntoAtencionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(PuntoAtencion puntoAtencion) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(puntoAtencion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findPuntoAtencion(puntoAtencion.getCodigoPuntoA()) != null) {
                throw new PreexistingEntityException("PuntoAtencion " + puntoAtencion + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(PuntoAtencion puntoAtencion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            puntoAtencion = em.merge(puntoAtencion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = puntoAtencion.getCodigoPuntoA();
                if (findPuntoAtencion(id) == null) {
                    throw new NonexistentEntityException("The puntoAtencion with id " + id + " no longer exists.");
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
            PuntoAtencion puntoAtencion;
            try {
                puntoAtencion = em.getReference(PuntoAtencion.class, id);
                puntoAtencion.getCodigoPuntoA();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The puntoAtencion with id " + id + " no longer exists.", enfe);
            }
            em.remove(puntoAtencion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<PuntoAtencion> findPuntoAtencionEntities() {
        return findPuntoAtencionEntities(true, -1, -1);
    }

    public List<PuntoAtencion> findPuntoAtencionEntities(int maxResults, int firstResult) {
        return findPuntoAtencionEntities(false, maxResults, firstResult);
    }

    private List<PuntoAtencion> findPuntoAtencionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(PuntoAtencion.class));
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

    public PuntoAtencion findPuntoAtencion(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(PuntoAtencion.class, id);
        } finally {
            em.close();
        }
    }

    public int getPuntoAtencionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<PuntoAtencion> rt = cq.from(PuntoAtencion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
