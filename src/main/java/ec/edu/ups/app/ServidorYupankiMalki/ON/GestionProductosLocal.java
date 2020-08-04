package ec.edu.ups.app.ServidorYupankiMalki.ON;

import java.util.List;

import javax.ejb.Local;

import ec.edu.ups.app.ServidorYupankiMalki.modelo.CabeceraCarrito;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.DetalleCarrito;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.Producto;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.Respuesta;

@Local
public interface GestionProductosLocal {
	
	public void guardarProducto(Producto p);
	public List<Producto> listarProductos();
	public Producto agregarProducto(int codigo);
	public CabeceraCarrito mostrarCarrito(List<DetalleCarrito> list);

}
