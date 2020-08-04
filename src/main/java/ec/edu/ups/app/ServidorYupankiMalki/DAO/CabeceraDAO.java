package ec.edu.ups.app.ServidorYupankiMalki.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.app.ServidorYupankiMalki.modelo.CabeceraCarrito;



public class CabeceraDAO {
	
	@PersistenceContext 
	private EntityManager con;
	
	public void insertarCabeceraCarrito(CabeceraCarrito producto) {
		con.persist(producto);
	}
	
	
	public CabeceraCarrito obtenerbuscar2(int codigo) {
		 return con.find(CabeceraCarrito.class, codigo);
	}
	

	public boolean editar_modelo(CabeceraCarrito pers) {
		con.merge(pers);
		return true;
	}
	
	public List<CabeceraCarrito> obtener() {
		String jpl = "select p from CabeceraCarrito p";
		Query q = con.createQuery(jpl, CabeceraCarrito.class);
		return q.getResultList();
	
	}
	
	

}
