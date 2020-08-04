package ec.edu.ups.app.ServidorYupankiMalki.modelo;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class DetalleCarrito implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	
	private int cantidad;
	private Producto pro;
	private double subTotal;
	
	public int getCantidad() {
		return cantidad;
	}
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	public Producto getPro() {
		return pro;
	}
	public void setPro(Producto pro) {
		this.pro = pro;
	}
	public double getSubTotal() {
		return subTotal;
	}
	public void setSubTotal(double subTotal) {
		this.subTotal = subTotal;
	}
	
	@Override
	public String toString() {
		return "DetalleCarrito [cantidad=" + cantidad + ", pro=" + pro + ", subTotal=" + subTotal + "]";
	}
	
	
	
	

}
