package ec.edu.ups.app.ServidorYupankiMalki.modelo;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;



@Entity
public class CabeceraCarrito implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="codigoCabecera")
	private int codigoCabecera;
	
	private Date fecha;
	private double total;
	
	@OneToMany( cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name="codigoCabecera")
	private List<DetalleCarrito> listaDetalles;
	
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public List<DetalleCarrito> getListaDetalles() {
		return listaDetalles;
	}
	public void setListaDetalles(List<DetalleCarrito> listaDetalles) {
		this.listaDetalles = listaDetalles;
	}
	
	public int getCodigoCabecera() {
		return codigoCabecera;
	}
	public void setCodigoCabecera(int codigoCabecera) {
		this.codigoCabecera = codigoCabecera;
	}
	public double getTotal() {
		return total;
	}
	public void setTotal(double total) {
		this.total = total;
	}
	@Override
	public String toString() {
		return "CabeceraCarrito [codigo=" + codigoCabecera + ", fecha=" + fecha + ", listaDetalles=" + listaDetalles + "]";
	}
	
	
	

}
