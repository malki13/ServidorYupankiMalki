package ec.edu.ups.app.ServidorYupankiMalki.DAO;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import ec.edu.ups.app.ServidorYupankiMalki.modelo.Producto;


@Stateless
public class ProductoDAO {
	
	@PersistenceContext 
	private EntityManager con;
	
	public void insertarProducto(Producto producto) {
		con.persist(producto);
	}
	
	
	public Producto obtenerbuscar2(int codigo) {
		 return con.find(Producto.class, codigo);
	}
	

	public boolean editar_modelo(Producto pers) {
		con.merge(pers);
		return true;
	}
	
	public List<Producto> obtener() {
		String jpl = "select p from Producto p";
		Query q = con.createQuery(jpl, Producto.class);
		return q.getResultList();
	
	}
	
	public void eliminarProducto(Producto per) {
		Producto p = obtenerbuscar2(per.getCodigo());
		con.remove(p);

    }

}
