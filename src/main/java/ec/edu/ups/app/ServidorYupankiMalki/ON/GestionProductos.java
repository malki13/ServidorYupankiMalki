package ec.edu.ups.app.ServidorYupankiMalki.ON;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.ejb.Stateless;
import javax.inject.Inject;

import ec.edu.ups.app.ServidorYupankiMalki.DAO.ProductoDAO;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.CabeceraCarrito;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.DetalleCarrito;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.Producto;

@Stateless
public class GestionProductos implements GestionProductosLocal {
	
	@Inject
	private ProductoDAO productoDao;
	
	
	public void guardarProducto(Producto p) {
		productoDao.insertarProducto(p);
	}
	
	public List<Producto> listarProductos(){
		List<Producto> p = new ArrayList<Producto>();
		p = productoDao.obtener();
		return p;
	}
	
	
	public Producto agregarProducto(int codigo) {
		Producto  p = productoDao.obtenerbuscar2(codigo);
		return p;
		
	}
	
	
	public CabeceraCarrito mostrarCarrito(List<DetalleCarrito> list) {
		System.out.println(list);
		double total = 0;
		CabeceraCarrito mic = new CabeceraCarrito();
		//mic.setFecha(new Date());
		DetalleCarrito miaux = new DetalleCarrito();
		
		
		
		for(DetalleCarrito dt:list) {
			total += dt.getSubTotal();
		}
		mic.setTotal(total);
		mic.setListaDetalles(list);
		return mic;
		
		
	}
	

}
