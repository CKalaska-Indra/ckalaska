package indra.talentCamp.encapsulamiento.models;

public class ProductoElectronico {

	private String nombre;
	private Double precio;
	private int stock;
	private String marca;
	

	
	public ProductoElectronico(String nombre, Double precio, int stock, String marca) {
		super();
		this.nombre = nombre;
		this.precio = precio;
		this.stock = stock;
		this.marca = marca;
	}
	
	private void updateStock(int productosVendidos) {
		this.stock = this.stock - productosVendidos;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}

}
