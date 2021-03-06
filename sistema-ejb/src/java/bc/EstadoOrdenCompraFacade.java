/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bc;

import be.EstadoOrdenCompra;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author root
 */
@Stateless
public class EstadoOrdenCompraFacade extends AbstractFacade<EstadoOrdenCompra> implements EstadoOrdenCompraFacadeLocal {
    @PersistenceContext(unitName = "sistema-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public EstadoOrdenCompraFacade() {
        super(EstadoOrdenCompra.class);
    }
    
}
