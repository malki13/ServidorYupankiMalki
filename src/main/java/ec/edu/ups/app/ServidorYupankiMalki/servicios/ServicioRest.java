package ec.edu.ups.app.ServidorYupankiMalki.servicios;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

import ec.edu.ups.app.ServidorYupankiMalki.ON.GestionProductosLocal;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.CabeceraCarrito;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.DetalleCarrito;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.Producto;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.Respuesta;
import ec.edu.ups.app.ServidorYupankiMalki.modelo.RespuestaLista;

@Path("/servidoryupanki")
public class ServicioRest {
	
	@Inject
	private GestionProductosLocal gestion;
	
	@POST
	@Path("/registroProducto")
	@Produces("application/json")
	@Consumes("application/json")
	public Respuesta listarREST(Producto p) {
		System.out.println("va guardar"+p.toString());
		gestion.guardarProducto(p);
		
		Respuesta respuesta = new Respuesta();
		respuesta.setCodigo(1);
		respuesta.setMensaje("Se ingreso el Producto");
		return respuesta;
		
	}
	
	@GET
	@Path("/listado")
	@Produces("application/json")
	public RespuestaLista listar() {
		List<Producto> lista = gestion.listarProductos();
		RespuestaLista respuesta = new RespuestaLista();
		if (lista.size() > 0 ) {
			respuesta.setCodigo(1);
			respuesta.setMensaje("Productos");
			respuesta.setLst(lista);
			return respuesta;
		}else {
			respuesta.setCodigo(2);
			respuesta.setMensaje("No existen Coicidencias");
			return respuesta;		
		}
	}
	
	
	@GET
	@Path("/agregarProducto")
	@Produces("application/json")
	public Producto mensaje(@QueryParam("codigo") int codigo) {
		Producto p = gestion.agregarProducto(codigo);
		return p;
	}
	
	
	@POST
	@Path("/carritoCompras")
	@Produces("application/json")
	@Consumes("application/json")
	public CabeceraCarrito listarREST(List<DetalleCarrito> mil) {
		CabeceraCarrito cb = gestion.mostrarCarrito(mil);
		return cb;
		
	}

}
