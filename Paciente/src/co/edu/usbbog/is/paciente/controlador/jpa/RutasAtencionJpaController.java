/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.usbbog.is.paciente.controlador.jpa;

import co.edu.usbbog.is.paciente.controlador.jpa.exceptions.NonexistentEntityException;
import co.edu.usbbog.is.paciente.controlador.jpa.exceptions.PreexistingEntityException;
import co.edu.usbbog.is.paciente.modelo.RutasAtencion;
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
public class RutasAtencionJpaController implements Serializable {

    public RutasAtencionJpaController(EntityManagerFactory emf) {
        this.emf = emf;
    }
    private EntityManagerFactory emf = null;

    public EntityManager getEntityManager() {
        return emf.createEntityManager();
    }

    public void create(RutasAtencion rutasAtencion) throws PreexistingEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(rutasAtencion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            if (findRutasAtencion(rutasAtencion.getId()) != null) {
                throw new PreexistingEntityException("RutasAtencion " + rutasAtencion + " already exists.", ex);
            }
            throw ex;
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void edit(RutasAtencion rutasAtencion) throws NonexistentEntityException, Exception {
        EntityManager em = null;
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            rutasAtencion = em.merge(rutasAtencion);
            em.getTransaction().commit();
        } catch (Exception ex) {
            String msg = ex.getLocalizedMessage();
            if (msg == null || msg.length() == 0) {
                Integer id = rutasAtencion.getId();
                if (findRutasAtencion(id) == null) {
                    throw new NonexistentEntityException("The rutasAtencion with id " + id + " no longer exists.");
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
            RutasAtencion rutasAtencion;
            try {
                rutasAtencion = em.getReference(RutasAtencion.class, id);
                rutasAtencion.getId();
            } catch (EntityNotFoundException enfe) {
                throw new NonexistentEntityException("The rutasAtencion with id " + id + " no longer exists.", enfe);
            }
            em.remove(rutasAtencion);
            em.getTransaction().commit();
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public List<RutasAtencion> findRutasAtencionEntities() {
        return findRutasAtencionEntities(true, -1, -1);
    }

    public List<RutasAtencion> findRutasAtencionEntities(int maxResults, int firstResult) {
        return findRutasAtencionEntities(false, maxResults, firstResult);
    }

    private List<RutasAtencion> findRutasAtencionEntities(boolean all, int maxResults, int firstResult) {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            cq.select(cq.from(RutasAtencion.class));
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

    public RutasAtencion findRutasAtencion(Integer id) {
        EntityManager em = getEntityManager();
        try {
            return em.find(RutasAtencion.class, id);
        } finally {
            em.close();
        }
    }

    public int getRutasAtencionCount() {
        EntityManager em = getEntityManager();
        try {
            CriteriaQuery cq = em.getCriteriaBuilder().createQuery();
            Root<RutasAtencion> rt = cq.from(RutasAtencion.class);
            cq.select(em.getCriteriaBuilder().count(rt));
            Query q = em.createQuery(cq);
            return ((Long) q.getSingleResult()).intValue();
        } finally {
            em.close();
        }
    }
    
}
