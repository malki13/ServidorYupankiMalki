package ec.edu.ups.app.ServidorYupankiMalki.modelo;

import java.util.List;

public class RespuestaLista {
	
	private int codigo;
	
	private String mensaje;
	
	private List<Producto> lst;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMensaje() {
		return mensaje;
	}

	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
	

	public List<Producto> getLst() {
		return lst;
	}

	public void setLst(List<Producto> lst) {
		this.lst = lst;
	}

	@Override
	public String toString() {
		return "RespuestaLista [codigo=" + codigo + ", mensaje=" + mensaje + ", lst=" + lst + "]";
	}

	

}
